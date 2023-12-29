package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Iterable<User> findByUserNameContaining(String text);

    Optional<User> findByUserId(int userId);
}