package esprit.tn.spring1.schedular;

import esprit.tn.spring1.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class CommandeScheduler {

    @Autowired
    private CommandeService commandeService;

    @Scheduled(fixedRate = 60000) // 60 000 ms = 60 sec
    public void scheduledCommandeReport() {
        commandeService.findCurrentYearCommandesOrderByNote();
    }
}
