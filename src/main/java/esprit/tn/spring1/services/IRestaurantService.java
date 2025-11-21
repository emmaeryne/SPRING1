// src/main/java/esprit/tn/spring1/services/IRestaurantService.java
package esprit.tn.spring1.services;

import esprit.tn.spring1.entities.Menu;
import esprit.tn.spring1.entities.Restaurant;

public interface IRestaurantService {

    // Cas 1 : Créer Restaurant + ses Menus (cascade)
    Restaurant ajoutRestaurantEtMenusAssocies(Restaurant restaurant);

    // Cas 2 : Affecter un Menu existant à un Restaurant existant
    void assignMenuToRestaurant(Long menuId, Long restaurantId);

    // Cas 4 : Ajouter un nouveau Menu et l’affecter à un Restaurant existant
    Menu addMenuAndAssignToRestaurant(Long restaurantId, Menu menu);

    // Cas 6 : Désaffecter un Menu d’un Restaurant
    void desaffecterMenuDuRestaurant(Long menuId, Long restaurantId);
}