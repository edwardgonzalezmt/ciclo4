package TiendaWeb.Interface;

import TiendaWeb.Modelo.Clothe;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author ANDRES
 */
public interface InterfaceClothe extends MongoRepository<Clothe, String> {
   public List<Clothe> findByPriceLessThanEqual(double precio);
    //Reto 5
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Clothe> findByDescriptionLike(String description); 
}
