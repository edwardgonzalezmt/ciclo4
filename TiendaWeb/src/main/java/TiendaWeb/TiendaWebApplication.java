package TiendaWeb;

import TiendaWeb.Interface.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import TiendaWeb.Interface.InterfaceClothe;
import TiendaWeb.Interface.InterfaceOrder;

@Component
@SpringBootApplication
public class TiendaWebApplication implements CommandLineRunner {
@Autowired
    private InterfaceClothe interfaceClothes;
@Autowired
    private InterfaceUser interfaceUser;

@Autowired
    private InterfaceOrder interfaceOrder;
    
    public static void main(String[] args) {
		SpringApplication.run(TiendaWebApplication.class, args);
	}
          @Override
    public void run(String... args) throws Exception {
        interfaceClothes.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();
    }
	

}
