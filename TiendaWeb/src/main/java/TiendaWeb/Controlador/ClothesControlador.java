package TiendaWeb.Controlador;

import TiendaWeb.Modelo.Clothes;
import TiendaWeb.Servicio.ClothesServicio;
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
public class ClothesControlador {
    @Autowired
    private ClothesServicio clothesService;
    
    @GetMapping("/all")
    public List<Clothes> getAll() {
        return clothesService.getAll();
    }
    
    @GetMapping("/{reference}")
    public Optional<Clothes> getClothes(@PathVariable("reference") String reference) {
        return clothesService.getClothes(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Clothes create(@RequestBody Clothes gadget) {
        return clothesService.create(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Clothes update(@RequestBody Clothes gadget) {
        return clothesService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return clothesService.delete(reference);
    } 
}
