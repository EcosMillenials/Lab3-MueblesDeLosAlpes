/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;


import com.losalpes.entities.RegistroVenta;
import com.losalpes.servicios.IServicioReporteMockLocal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Managed Bean encargado de la generacion de reportes
 * @author l.valbuena
 */
@ManagedBean
@ViewScoped
public class ReporteBean {
    
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    
    /**
     * Relacion con la interfaz de reporte que provee los servicios de reportes
     */
    @EJB
    private IServicioReporteMockLocal reporteService;
    
    /**
     * Informacion con el reporte de ventas
     */
    private List<RegistroVenta> reporteVentas;
    
    //-----------------------------------------------------------
    // Metodos
    //-----------------------------------------------------------
    
    /**
     * Constructor sin parametros
     */
    public ReporteBean() {
        reporteVentas = new ArrayList<RegistroVenta>();        
    }
    
    /**
     * Postconstructor del bean
     */
    @PostConstruct
    public void init() {
        reporteVentas = reporteService.generarReporteVentas();
    }
    
    /**
     * Invoca el servicio EJB que provee el reporte de ventas
     * @return 
     */
//    public List<Reporte> ventasMes() {
//        reporteVentas = reporteService.generarReporteVentas();
//    }

    
    public List<RegistroVenta> getReporteVentas() {
        return reporteVentas;
    }

    public void setReporteVentas(List<RegistroVenta> reporteVentas) {
        this.reporteVentas = reporteVentas;
    }
    
    
    
    
}
