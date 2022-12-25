package ma.enset.immatriculationservice.immatriculationQuery.repositories;


import ma.enset.immatriculationservice.immatriculationQuery.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository<Vehicule, String> {
}

