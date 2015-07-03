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
public class CCriterio {

    private long lonCodigo;
    private String strNombre;

    //<editor-fold defaultstate="collapsed" desc="Sets y Gets">
    /**
     * @return the lonCodigo
     */
    public long getLonCodigo() {
        return lonCodigo;
    }

    /**
     * @param lonCodigo the lonCodigo to set
     */
    public void setLonCodigo(long lonCodigo) {
        this.lonCodigo = lonCodigo;
    }

    /**
     * @return the strNombre
     */
    public String getStrNombre() {
        return strNombre;
    }

    /**
     * @param strNombre the strNombre to set
     */
    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public CCriterio(long lonCodigo, String strNombre) {
        this.lonCodigo = lonCodigo;
        this.strNombre = strNombre;
    }

    public CCriterio() {
    }
    //</editor-fold>

}
