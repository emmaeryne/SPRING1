
package esprit.tn.spring1.controllers;

import esprit.tn.spring1.entities.Menu;
import esprit.tn.spring1.entities.Restaurant;
import esprit.tn.spring1.services.IRestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tp8")                   // même prefix que dans le cours (tp8)
@RequiredArgsConstructor
public class RestaurantController {

    private final IRestaurantService iRestaurantService;

    // ──────────────────────────────────────────────────────────────
    // CAS 1 : Ajouter Restaurant + Menus en même temps (cascade)
    // ──────────────────────────────────────────────────────────────
    @PostMapping("/restaurant/ajouter-restaurant-et-menus")
    public Restaurant ajouterRestaurantEtMenus(@RequestBody Restaurant restaurant) {
        return iRestaurantService.ajoutRestaurantEtMenusAssocies(restaurant);
    }

    // ──────────────────────────────────────────────────────────────
    // CAS 2 : Affecter un Menu déjà existant à un Restaurant déjà existant
    // ──────────────────────────────────────────────────────────────
    @PutMapping("/restaurant/affecter-menu-a-restaurant/{menuId}/{restaurantId}")
    public void affecterMenuARestaurant(
            @PathVariable("menuId") Long menuId,
            @PathVariable("restaurantId") Long restaurantId) {
        iRestaurantService.assignMenuToRestaurant(menuId, restaurantId);
    }

    // ──────────────────────────────────────────────────────────────
    // CAS 4 : Ajouter un nouveau Menu et l’affecter à un Restaurant existant
    // ──────────────────────────────────────────────────────────────
    @PostMapping("/restaurant/ajouter-menu-et-affecter/{restaurantId}")
    public Menu ajouterMenuEtAffecterRestaurant(
            @PathVariable("restaurantId") Long restaurantId,
            @RequestBody Menu menu) {
        return iRestaurantService.addMenuAndAssignToRestaurant(restaurantId, menu);
    }

    // ──────────────────────────────────────────────────────────────
    // CAS 6 : Désaffecter un Menu d’un Restaurant
    // ──────────────────────────────────────────────────────────────
    @PutMapping("/restaurant/desaffecter-menu-du-restaurant/{menuId}/{restaurantId}")
    public void desaffecterMenuDuRestaurant(
            @PathVariable("menuId") Long menuId,
            @PathVariable("restaurantId") Long restaurantId) {
        iRestaurantService.desaffecterMenuDuRestaurant(menuId, restaurantId);
    }
}