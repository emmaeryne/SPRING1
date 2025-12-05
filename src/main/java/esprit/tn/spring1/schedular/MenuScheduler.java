package esprit.tn.spring1.schedular;

import esprit.tn.spring1.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class MenuScheduler {

    @Autowired
    private MenuService menuService;

    // Exécute toutes les minutes
    @Scheduled(fixedRate = 60000)
    public void scheduledMenuReport() {
        menuService.menuPlusCommande();
    }
}
