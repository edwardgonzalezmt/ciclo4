package TiendaWeb.Servicio;

import TiendaWeb.Modelo.Clothe;
import TiendaWeb.Repositorio.ClotheRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ANDRES
 */
@Service
public class ClotheServicio {
    @Autowired
    private ClotheRepositorio clothesRepository;

    public List<Clothe> getAll() {
        return clothesRepository.getAll();
    }

   public Optional<Clothe> getClothes(String reference) {
        return clothesRepository.getClothes(reference);
    }

    public Clothe create(Clothe accesory) {
        if (accesory.getReference() == null) {
            return accesory;
        } else {
            return clothesRepository.create(accesory);
        }
    }

    public Clothe update(Clothe accesory) {

        if (accesory.getReference() != null) {
            Optional<Clothe> accesoryDb = clothesRepository.getClothes(accesory.getReference());
            if (!accesoryDb.isEmpty()) {
                
                if (accesory.getCategory() != null) {
                    accesoryDb.get().setCategory(accesory.getCategory());
                }
                if (accesory.getSize() != null) {
                    accesoryDb.get().setSize(accesory.getSize());
                }
                if (accesory.getDescription() != null) {
                    accesoryDb.get().setDescription(accesory.getDescription());
                }
                if (accesory.getPrice() != 0.0) {
                    accesoryDb.get().setPrice(accesory.getPrice());
                }
                if (accesory.getQuantity() != 0) {
                    accesoryDb.get().setQuantity(accesory.getQuantity());
                }
                if (accesory.getPhotography() != null) {
                    accesoryDb.get().setPhotography(accesory.getPhotography());
                }
                accesoryDb.get().setAvailability(accesory.isAvailability());
                clothesRepository.update(accesoryDb.get());
                return accesoryDb.get();
            } else {
                return accesory;
            }
        } else {
            return accesory;
        }
    }

    public boolean delete(String reference) {
        Boolean aBoolean = getClothes(reference).map(accesory -> {
            clothesRepository.delete(accesory);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
