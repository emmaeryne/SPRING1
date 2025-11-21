package esprit.tn.spring1.services;

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
}
