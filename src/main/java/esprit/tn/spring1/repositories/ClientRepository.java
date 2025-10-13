package esprit.tn.spring1.repositories;

import esprit.tn.spring1.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository <Client,Long> {
}
