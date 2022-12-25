package ma.enset.infraction.infractionQuery.repositories;

import ma.enset.infraction.infractionQuery.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction,String> {

}
