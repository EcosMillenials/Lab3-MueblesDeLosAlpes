/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.entities.RegistroVenta;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 * Servicio que se encarga del manejo de reportes
 * @author l.valbuena
 */
@Stateless
public class ServicioReporteMock implements IServicioReporteMockLocal {
    
    /**
     * servicio de persistencia
     */
    @EJB
    IServicioPersistenciaMockLocal servicioPersistencia;

    /**
     * Genera el reporte de ventas del ultimo mes
     * @return lista de ventas
     */
    @Override
    public List<RegistroVenta> generarReporteVentas() {
        List<RegistroVenta> resultado = new ArrayList<RegistroVenta>();
        
        resultado = servicioPersistencia.findAll(RegistroVenta.class);
        
        return resultado;
    }

    
}
