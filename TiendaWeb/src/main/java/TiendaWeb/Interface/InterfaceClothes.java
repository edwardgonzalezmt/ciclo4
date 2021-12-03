/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaWeb.Interface;

import TiendaWeb.Modelo.Clothes;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author ANDRES
 */
public interface InterfaceClothes extends MongoRepository<Clothes, String> {
    
}
