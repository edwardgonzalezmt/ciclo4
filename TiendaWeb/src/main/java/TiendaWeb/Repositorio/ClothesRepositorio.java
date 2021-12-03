package TiendaWeb.Repositorio;

import TiendaWeb.Interface.InterfaceClothes;
import TiendaWeb.Modelo.Clothes;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ANDRES
 */
@Repository
public class ClothesRepositorio {
    @Autowired
    private InterfaceClothes clothesCrudrepository;

    public List<Clothes> getAll() {
        return clothesCrudrepository.findAll();
    }

    public Optional<Clothes> getClothes(String reference) {
        return clothesCrudrepository.findById(reference);
    }
    public Clothes create(Clothes clothes) {
        return clothesCrudrepository.save(clothes);
    }

    public void update(Clothes clothes) {
        clothesCrudrepository.save(clothes);
    }
    
    public void delete(Clothes clothes) {
        clothesCrudrepository.delete(clothes);
    }
}
