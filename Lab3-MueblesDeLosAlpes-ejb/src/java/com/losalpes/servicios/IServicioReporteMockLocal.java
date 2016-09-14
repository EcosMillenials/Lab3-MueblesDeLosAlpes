/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.entities.RegistroVenta;
import java.util.List;
import javax.ejb.Local;

/**
 * Contrato funcional para el manejo de reportes
 * @author l.valbuena
 */
@Local
public interface IServicioReporteMockLocal {
    
    /**
     * Genera el reporte de ventas del ultimo mes
     * @return lista de ventas
     */
    List<RegistroVenta> generarReporteVentas();
    
}
