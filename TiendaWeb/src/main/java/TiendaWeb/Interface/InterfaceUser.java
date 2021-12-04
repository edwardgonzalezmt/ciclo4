package TiendaWeb.Interface;

import TiendaWeb.Modelo.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author ANDRES
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    Optional<User> findTopByOrderByIdDesc();
}
