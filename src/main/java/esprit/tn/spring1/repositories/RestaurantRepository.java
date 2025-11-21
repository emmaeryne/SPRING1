// src/main/java/esprit/tn/spring1/repositories/RestaurantRepository.java
package esprit.tn.spring1.repositories;

import esprit.tn.spring1.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}