package TiendaWeb;

import TiendaWeb.Interface.InterfaceClothes;
import TiendaWeb.Interface.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class TiendaWebApplication implements CommandLineRunner {
@Autowired
    private InterfaceClothes interfaceClothes;
    @Autowired
    private InterfaceUser interfaceUser;
    
    public static void main(String[] args) {
		SpringApplication.run(TiendaWebApplication.class, args);
	}
          @Override
    public void run(String... args) throws Exception {
        interfaceClothes.deleteAll();
        interfaceUser.deleteAll();
    }
	

}
