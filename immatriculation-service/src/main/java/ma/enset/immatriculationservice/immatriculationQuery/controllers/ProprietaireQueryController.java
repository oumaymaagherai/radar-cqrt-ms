package ma.enset.immatriculationservice.immatriculationQuery.controllers;


import lombok.AllArgsConstructor;
import ma.enset.commonapi.query.GetAllProprietairesQuery;
import ma.enset.commonapi.query.GetProprietaireById;
import ma.enset.immatriculationservice.immatriculationQuery.entities.Proprietaire;
import ma.enset.immatriculationservice.immatriculationQuery.repositories.ProprietaireRepository;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/proprietaire/queries")
@CrossOrigin("*")
public class ProprietaireQueryController {
    private QueryGateway queryGateway;
    private ProprietaireRepository proprietaireRepository;

    @GetMapping("/allProprietaires")
    public List<Proprietaire> getAllProprietaires() {
        return queryGateway.query(new GetAllProprietairesQuery(), ResponseTypes.multipleInstancesOf(Proprietaire.class)).join();
    }

    @QueryHandler
    public List<Proprietaire> on(GetAllProprietairesQuery query) {
        return proprietaireRepository.findAll();
    }

    @GetMapping("/getProprietaire/{id}")
    public Proprietaire getProprietaire(@PathVariable String id) {
        return queryGateway.query(new GetProprietaireById(id),ResponseTypes.instanceOf(Proprietaire.class)).join();
    }

    @QueryHandler
    public Proprietaire on(GetProprietaireById query) {
        return proprietaireRepository.findById(query.getId()).orElse(null);
    }
}
