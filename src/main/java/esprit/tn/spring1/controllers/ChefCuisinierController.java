package esprit.tn.spring1.controllers;

import esprit.tn.spring1.entities.ChefCuisinier;
import esprit.tn.spring1.repositories.ChefCuisinierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chef")
@RequiredArgsConstructor
public class ChefCuisinierController {

    private final ChefCuisinierRepository chefCuisinierRepository;

    @PostMapping("/add")
    public ChefCuisinier addChef(@RequestBody ChefCuisinier chef) {
        return chefCuisinierRepository.save(chef);
    }

    @GetMapping("/all")
    public List<ChefCuisinier> getAllChefs() {
        return chefCuisinierRepository.findAll();
    }

    @GetMapping("/{id}")
    public ChefCuisinier getChefById(@PathVariable Long id) {
        return chefCuisinierRepository.findById(id).orElse(null);
    }

    @PutMapping("/update/{id}")
    public ChefCuisinier updateChef(@PathVariable Long id, @RequestBody ChefCuisinier newChef) {
        return chefCuisinierRepository.findById(id).map(chef -> {
            chef.setNom(newChef.getNom());
            chef.setPrenom(newChef.getPrenom());
            chef.setTypeChef(newChef.getTypeChef());
            return chefCuisinierRepository.save(chef);
        }).orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteChef(@PathVariable Long id) {
        chefCuisinierRepository.deleteById(id);
        return "Chef supprimé avec succès !";
    }
}
