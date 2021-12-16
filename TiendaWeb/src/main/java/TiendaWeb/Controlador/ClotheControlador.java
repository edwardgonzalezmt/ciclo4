package TiendaWeb.Controlador;

import TiendaWeb.Modelo.Clothe;
import TiendaWeb.Servicio.ClotheServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ANDRES
 */
@RestController
@RequestMapping("/api/clothe")
@CrossOrigin("*")
public class ClotheControlador {
    @Autowired
    private ClotheServicio clothesService;
    
    @GetMapping("/all")
    public List<Clothe> getAll() {
        return clothesService.getAll();
    }
    
    @GetMapping("/{reference}")
    public Optional<Clothe> getClothes(@PathVariable("reference") String reference) {
        return clothesService.getClothes(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Clothe create(@RequestBody Clothe gadget) {
        return clothesService.create(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Clothe update(@RequestBody Clothe gadget) {
        return clothesService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return clothesService.delete(reference);
    }
    @GetMapping("/price/{price}")
    public List<Clothe> gadgetsByPrice(@PathVariable("price") double precio) {
        return clothesService.gadgetsByPrice(precio);
    }
    @GetMapping("/description/{description}")
    public List<Clothe> findByDescriptionLike(@PathVariable("description") String description) {
        return clothesService.findByDescriptionLike(description);
    }
}
