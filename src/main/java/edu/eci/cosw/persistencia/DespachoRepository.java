/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.persistencia;

import edu.eci.cosw.model.Despacho;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface DespachoRepository  extends CrudRepository<Despacho, Integer>{
    
}