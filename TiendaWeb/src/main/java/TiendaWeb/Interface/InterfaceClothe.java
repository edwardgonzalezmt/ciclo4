/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaWeb.Interface;

import TiendaWeb.Modelo.Clothe;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author ANDRES
 */
public interface InterfaceClothe extends MongoRepository<Clothe, String> {
    
}
