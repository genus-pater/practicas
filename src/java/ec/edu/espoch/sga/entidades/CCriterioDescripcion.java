/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.sga.entidades;

/**
 *
 * @author eborja
 */
public class CCriterioDescripcion {

    private CCriterio objCriterio;
    private int intCodigo;
    private String strDescripcion;

    //<editor-fold defaultstate="collapsed" desc="Sets y Gets">
    /**
     * @return the strDescripcion
     */
    public String getStrDescripcion() {
        return strDescripcion;
    }

    /**
     * @param strDescripcion the strDescripcion to set
     */
    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public CCriterioDescripcion(CCriterio objCriterio, int intCodigo, String strDescripcion) {
        this.objCriterio = objCriterio;
        this.intCodigo = intCodigo;
        this.strDescripcion = strDescripcion;
    }

    public CCriterioDescripcion() {
    }
    //</editor-fold>

}
