/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.entities.Mueble;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author l.valbuena
 */
@Stateless
public class ServicioCatalogoMock implements IServicioCatalogoMockLocal, IServicioCatalogoMockRemote {

    @Override
    public void agregarMueble(Mueble mueble) {
        
    }

    @Override
    public void eliminarMueble(long id) {
        
    }

    @Override
    public List<Mueble> darMuebles() {
        return new ArrayList<Mueble>();
    }

    @Override
    public void removerEjemplarMueble(long id) {
        
    }

}
