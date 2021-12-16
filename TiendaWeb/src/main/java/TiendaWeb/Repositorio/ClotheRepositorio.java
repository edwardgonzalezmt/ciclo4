package TiendaWeb.Repositorio;

import TiendaWeb.Modelo.Clothe;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import TiendaWeb.Interface.InterfaceClothe;

/**
 *
 * @author ANDRES
 */
@Repository
public class ClotheRepositorio {
    @Autowired
    private InterfaceClothe clothesCrudrepository;

    public List<Clothe> getAll() {
        return clothesCrudrepository.findAll();
    }

    public Optional<Clothe> getClothes(String reference) {
        return clothesCrudrepository.findById(reference);
    }
    public Clothe create(Clothe clothes) {
        return clothesCrudrepository.save(clothes);
    }

    public void update(Clothe clothes) {
        clothesCrudrepository.save(clothes);
    }
    
    public void delete(Clothe clothes) {
        clothesCrudrepository.delete(clothes);
    }
    public List<Clothe> gadgetsByPrice(double precio) {
        return clothesCrudrepository.findByPriceLessThanEqual(precio);
    }
    public List<Clothe> findByDescriptionLike(String description) {
        return clothesCrudrepository.findByDescriptionLike(description);
    }
}
