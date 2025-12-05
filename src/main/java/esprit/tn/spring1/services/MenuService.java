package esprit.tn.spring1.services;

import esprit.tn.spring1.entities.Menu;
import esprit.tn.spring1.enums.TypeMenu;

import java.util.List;

public interface MenuService {

    Menu addMenu(Menu menu);

    Menu updateMenu(Long idMenu, Menu menu);

    void deleteMenu(Long idMenu);

    Menu getMenuById(Long idMenu);

    List<Menu> getAllMenus();

    List<Menu> getMenusByType(TypeMenu typeMenu);

    List<Menu> searchMenus(String libelle);

    // 🔹 Méthode pour afficher le menu le plus commandé
    void menuPlusCommande();
}
