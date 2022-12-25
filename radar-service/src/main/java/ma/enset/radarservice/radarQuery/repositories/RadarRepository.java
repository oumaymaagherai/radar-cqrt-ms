package ma.enset.radarservice.radarQuery.repositories;

import ma.enset.radarservice.radarQuery.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadarRepository extends JpaRepository<Radar,String> {

}