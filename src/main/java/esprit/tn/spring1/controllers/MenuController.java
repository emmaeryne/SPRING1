package esprit.tn.spring1.controllers;

import esprit.tn.spring1.entities.Menu;
import esprit.tn.spring1.enums.TypeMenu;
import esprit.tn.spring1.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/add")
    public Menu addMenu(@RequestBody Menu menu) {
        return menuService.addMenu(menu);
    }

    @PutMapping("/update/{id}")
    public Menu updateMenu(@PathVariable Long id, @RequestBody Menu menu) {
        return menuService.updateMenu(id, menu);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMenu(@PathVariable Long id) {
        menuService.deleteMenu(id);
        return "Menu deleted successfully.";
    }

    @GetMapping("/get/{id}")
    public Menu getMenuById(@PathVariable Long id) {
        return menuService.getMenuById(id);
    }

    @GetMapping("/all")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/type/{type}")
    public List<Menu> getMenusByType(@PathVariable TypeMenu type) {
        return menuService.getMenusByType(type);
    }

    @GetMapping("/search")
    public List<Menu> searchMenus(@RequestParam String libelle) {
        return menuService.searchMenus(libelle);
    }
}
