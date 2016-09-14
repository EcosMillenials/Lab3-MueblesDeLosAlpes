/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.entities.Mueble;
import com.losalpes.excepciones.OperacionInvalidaException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author l.valbuena
 */
@Stateless
public class ServicioCatalogoMock implements IServicioCatalogoMockLocal, IServicioCatalogoMockRemote {
    
    /**
     * Servicio de persistencia
     */
    @EJB
    private IServicioPersistenciaMockLocal servicioPersistencia;
    

    @Override
    public void agregarMueble(Mueble mueble) {
        try {
            servicioPersistencia.create(mueble);
        } catch (OperacionInvalidaException ex) {
            Logger.getLogger(ServicioCatalogoMock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarMueble(long id) {
//        Mueble mueble = servicioPersistencia.findById(Mueble.class, id);
        
    }

    @Override
    public List<Mueble> darMuebles() {
        return servicioPersistencia.findAll(Mueble.class);
    }

    @Override
    public void removerEjemplarMueble(long id) {
        
    }

}
