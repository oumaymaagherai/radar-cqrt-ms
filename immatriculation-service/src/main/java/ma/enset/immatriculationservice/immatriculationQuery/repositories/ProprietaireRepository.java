package ma.enset.immatriculationservice.immatriculationQuery.repositories;


import ma.enset.immatriculationservice.immatriculationQuery.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietaireRepository extends JpaRepository<Proprietaire, String> {
}
