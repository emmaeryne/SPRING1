package esprit.tn.spring1.repositories;

import esprit.tn.spring1.entities.Menu;
import esprit.tn.spring1.enums.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findByTypeMenu(TypeMenu typeMenu);

    List<Menu> findByRestaurantIdRestaurant(Long idRestaurant);

    List<Menu> findByLibelleMenuContainingIgnoreCase(String libelle);
}
