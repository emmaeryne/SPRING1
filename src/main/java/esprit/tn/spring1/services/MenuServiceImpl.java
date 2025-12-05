

/*package esprit.tn.spring1.services;
import org.springframework.transaction.annotation.Transactional;

import esprit.tn.spring1.entities.Menu;
import esprit.tn.spring1.enums.TypeMenu;
import esprit.tn.spring1.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Menu addMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public Menu updateMenu(Long idMenu, Menu menu) {
        Menu existing = menuRepository.findById(idMenu)
                .orElseThrow(() -> new RuntimeException("Menu not found"));

        existing.setLibelleMenu(menu.getLibelleMenu());
        existing.setTypeMenu(menu.getTypeMenu());
        existing.setPrixTotal(menu.getPrixTotal());
        existing.setRestaurant(menu.getRestaurant());

        return menuRepository.save(existing);
    }

    @Override
    public void deleteMenu(Long idMenu) {
        menuRepository.deleteById(idMenu);
    }

    @Override
    public Menu getMenuById(Long idMenu) {
        return menuRepository.findById(idMenu)
                .orElseThrow(() -> new RuntimeException("Menu not found"));
    }

    @Override
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    @Override
    public List<Menu> getMenusByType(TypeMenu typeMenu) {
        return menuRepository.findByTypeMenu(typeMenu);
    }

    @Override
    public List<Menu> searchMenus(String libelle) {
        return menuRepository.findByLibelleMenuContainingIgnoreCase(libelle);
    }

    /*@Override
    public void menuPlusCommande() {
        List<Menu> menus = menuRepository.findAll();

        if (menus.isEmpty()) {
            System.out.println("Aucun menu n'a été trouvé dans le restaurant.");
            return;
        }

        Menu menuLePlusCommande = null;
        int maxCommandes = 0;

        for (Menu menu : menus) {
            int nbCommandes = (menu.getCommandes() != null) ? menu.getCommandes().size() : 0;

            if (nbCommandes > maxCommandes) {
                maxCommandes = nbCommandes;
                menuLePlusCommande = menu;
            }
        }

        if (menuLePlusCommande != null) {
            System.out.println(
                    "Le menu le plus commandé est : " +
                            menuLePlusCommande.getLibelleMenu() +
                            " (" + maxCommandes + " commandes)"
            );
        } else {
            System.out.println("Aucun menu n'a été commandé pour le moment.");
        }
    }*/





   /* @Override
    @Transactional
    public void menuPlusCommande() {
        List<Menu> menus = menuRepository.findAll();

        if (menus.isEmpty()) {
            System.out.println("Aucun menu n'a été trouvé dans le restaurant.");
            return;
        }

        Menu menuLePlusCommande = null;
        int maxCommandes = 0;

        for (Menu menu : menus) {
            int nbCommandes = (menu.getCommandes() != null) ? menu.getCommandes().size() : 0;

            if (nbCommandes > maxCommandes) {
                maxCommandes = nbCommandes;
                menuLePlusCommande = menu;
            }
        }

        if (menuLePlusCommande != null) {
            System.out.println("Le menu le plus commandé est : " +
                    menuLePlusCommande.getLibelleMenu() +
                    " (" + maxCommandes + " commandes)");
        } else {
            System.out.println("Aucun menu n'a été commandé pour le moment.");
        }
    }*/



    /*@Override
    @Transactional
    public Menu menuPlusCommande() {
        List<Menu> menus = menuRepository.findAll();

        if (menus.isEmpty()) {
            System.out.println("Aucun menu n'a été trouvé dans le restaurant.");
            return null;
        }

        Menu menuLePlusCommande = null;
        int maxCommandes = 0;

        for (Menu menu : menus) {
            int nbCommandes = (menu.getCommandes() != null) ? menu.getCommandes().size() : 0;

            if (nbCommandes > maxCommandes) {
                maxCommandes = nbCommandes;
                menuLePlusCommande = menu;
            }
        }

        if (menuLePlusCommande != null) {
            System.out.println("Le menu le plus commandé est : " +
                    menuLePlusCommande.getLibelleMenu() +
                    " (" + maxCommandes + " commandes)");
        } else {
            System.out.println("Aucun menu n'a été commandé pour le moment.");
        }

        return menuLePlusCommande; // <-- retour de l'objet trouvé
    }






}*/

package esprit.tn.spring1.services;

import esprit.tn.spring1.entities.Menu;
import esprit.tn.spring1.enums.TypeMenu;
import esprit.tn.spring1.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Menu addMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public Menu updateMenu(Long idMenu, Menu menu) {
        Menu existing = menuRepository.findById(idMenu)
                .orElseThrow(() -> new RuntimeException("Menu not found"));

        existing.setLibelleMenu(menu.getLibelleMenu());
        existing.setTypeMenu(menu.getTypeMenu());
        existing.setPrixTotal(menu.getPrixTotal());
        existing.setRestaurant(menu.getRestaurant());

        return menuRepository.save(existing);
    }

    @Override
    public void deleteMenu(Long idMenu) {
        menuRepository.deleteById(idMenu);
    }

    @Override
    public Menu getMenuById(Long idMenu) {
        return menuRepository.findById(idMenu)
                .orElseThrow(() -> new RuntimeException("Menu not found"));
    }

    @Override
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    @Override
    public List<Menu> getMenusByType(TypeMenu typeMenu) {
        return menuRepository.findByTypeMenu(typeMenu);
    }

    @Override
    public List<Menu> searchMenus(String libelle) {
        return menuRepository.findByLibelleMenuContainingIgnoreCase(libelle);
    }

    // 🔹 Méthode pour récupérer le menu le plus commandé
    @Override
    @Transactional
    public Menu menuPlusCommande() {
        List<Menu> menus = menuRepository.findAll();

        if (menus.isEmpty()) {
            System.out.println("Aucun menu n'a été trouvé dans le restaurant.");
            return null;
        }

        Menu menuLePlusCommande = null;
        int maxCommandes = 0;

        for (Menu menu : menus) {
            int nbCommandes = (menu.getCommandes() != null) ? menu.getCommandes().size() : 0;

            if (nbCommandes > maxCommandes) {
                maxCommandes = nbCommandes;
                menuLePlusCommande = menu;
            }
        }

        if (menuLePlusCommande != null) {
            System.out.println("Le menu le plus commandé est : " +
                    menuLePlusCommande.getLibelleMenu() +
                    " (" + maxCommandes + " commandes)");
        } else {
            System.out.println("Aucun menu n'a été commandé pour le moment.");
        }

        return menuLePlusCommande;
    }
}


