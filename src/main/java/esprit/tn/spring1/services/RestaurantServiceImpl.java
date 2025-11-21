// src/main/java/esprit/tn/spring1/services/RestaurantServiceImpl.java
package esprit.tn.spring1.services;

import esprit.tn.spring1.entities.Menu;
import esprit.tn.spring1.entities.Restaurant;
import esprit.tn.spring1.repositories.MenuRepository;
import esprit.tn.spring1.repositories.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements IRestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final MenuRepository menuRepository;

    // CAS 1 : Création Restaurant + Menus (cascade + initialisation prixTotal)






    @Override
    public Restaurant ajoutRestaurantEtMenusAssocies(Restaurant restaurant) {
        if (restaurant.getMenus() != null) {
            restaurant.getMenus().forEach(menu -> {
                menu.setPrixTotal(0F);
                menu.setRestaurant(restaurant);
            });
        }
        return restaurantRepository.save(restaurant);
    }











    // CAS 2 : Affecter un Menu existant à un Restaurant existant
    @Override
    public void assignMenuToRestaurant(Long menuId, Long restaurantId) {
        Menu menu = menuRepository.findById(menuId).orElseThrow();
        Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow();

        restaurant.getMenus().add(menu);
        menu.setRestaurant(restaurant);

        restaurantRepository.save(restaurant);
    }




    

    // CAS 4 : Ajouter un nouveau Menu et l’affecter à un Restaurant existant
    @Override
    public Menu addMenuAndAssignToRestaurant(Long restaurantId, Menu menu) {
        Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow();

        menu.setPrixTotal(0F);
        menu.setRestaurant(restaurant);
        restaurant.getMenus().add(menu);

        restaurantRepository.save(restaurant);  // cascade ALL → menu sauvegardé aussi
        return menu;
    }

    // CAS 6 : Désaffecter un Menu d’un Restaurant (sans supprimer le menu)
    @Override
    public void desaffecterMenuDuRestaurant(Long menuId, Long restaurantId) {
        Menu menu = menuRepository.findById(menuId).orElseThrow();
        Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow();

        restaurant.getMenus().remove(menu);
        menu.setRestaurant(null);                  // cohérence bidirectionnelle

        restaurantRepository.save(restaurant);
    }
}