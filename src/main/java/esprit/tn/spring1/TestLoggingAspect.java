package esprit.tn.spring1;

import esprit.tn.spring1.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestLoggingAspect implements CommandLineRunner {

    @Autowired
    private CommandeService commandeService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== TEST LOGGING ASPECT ===");

        // Ici tu appelles les méthodes de CommandeService
        commandeService.getAllCommandes();
    }
}
