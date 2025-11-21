package esprit.tn.spring1.repositories;

import esprit.tn.spring1.entities.ChefCuisinier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefCuisinierRepository extends JpaRepository<ChefCuisinier, Long> {

}
