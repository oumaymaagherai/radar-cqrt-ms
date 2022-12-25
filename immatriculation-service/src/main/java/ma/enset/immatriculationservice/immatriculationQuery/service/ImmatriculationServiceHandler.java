package ma.enset.immatriculationservice.immatriculationQuery.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.commonapi.events.ProprietaireCreatedEvent;
import ma.enset.commonapi.events.ProprietaireUpdatedEvent;
import ma.enset.commonapi.events.VehiculeCreatedEvent;
import ma.enset.commonapi.events.VehiculeUpdatedEvent;
import ma.enset.immatriculationservice.immatriculationQuery.entities.Proprietaire;
import ma.enset.immatriculationservice.immatriculationQuery.entities.Vehicule;
import ma.enset.immatriculationservice.immatriculationQuery.repositories.ProprietaireRepository;
import ma.enset.immatriculationservice.immatriculationQuery.repositories.VehiculeRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ImmatriculationServiceHandler {
    private final ProprietaireRepository proprietaireRepository;
    private final VehiculeRepository vehiculeRepository;

    @EventHandler
    public void on(ProprietaireCreatedEvent event) {
        log.info("*********************************");
        log.info("ProprietaireCreatedEvent received");
        Proprietaire proprietaire = new Proprietaire();
        proprietaire.setId(event.getId());
        proprietaire.setNom(event.getNom());
        proprietaire.setPrenom(event.getPrenom());
        proprietaire.setDdn(event.getDdn());
        proprietaire.setEmail(event.getEmail());
        proprietaire.setNumTel(event.getNumTel());
        proprietaireRepository.save(proprietaire);
    }

    @EventHandler
    public void on(ProprietaireUpdatedEvent event) {
        log.info("*********************************");
        log.info("ProprietaireUpdatedEvent received");
        Proprietaire proprietaire = proprietaireRepository.findById(event.getId()).get();
        proprietaire.setNom(event.getNom());
        proprietaire.setPrenom(event.getPrenom());
        proprietaire.setDdn(event.getDdn());
        proprietaire.setEmail(event.getEmail());
        proprietaire.setNumTel(event.getNumTel());
        proprietaireRepository.save(proprietaire);
    }

    @EventHandler
    public void on(VehiculeCreatedEvent event) {
        log.info("*********************************");
        log.info("VehiculeCreatedEvent received");
        Vehicule vehicule = new Vehicule();
        vehicule.setId(event.getId());
        vehicule.setMarque(event.getMarque());
        vehicule.setModele(event.getModele());
        vehicule.setMatricule(event.getMatricule());
        vehicule.setPuissanceFiscale(event.getPuissanceFiscale());
        Proprietaire proprietaire = proprietaireRepository.findById(event.getProprietaireId()).get();
        if (proprietaire != null) {
            vehicule.setProprietaire(proprietaire);
        }
        vehiculeRepository.save(vehicule);
    }

    @EventHandler
    public void on(VehiculeUpdatedEvent event) {
        log.info("*********************************");
        log.info("VehiculeUpdatedEvent received");
        Vehicule vehicule = vehiculeRepository.findById(event.getId()).get();
        vehicule.setMarque(event.getMarque());
        vehicule.setModele(event.getModele());
        vehicule.setMatricule(event.getMatricule());
        vehicule.setPuissanceFiscale(event.getPuissanceFiscale());
        Proprietaire proprietaire = proprietaireRepository.findById(event.getProprietaireId()).get();
        vehicule.setProprietaire(proprietaire);
        vehiculeRepository.save(vehicule);
    }
}
