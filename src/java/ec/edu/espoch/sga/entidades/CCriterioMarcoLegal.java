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
public class CCriterioMarcoLegal {

    private CCriterio objCriterio;
    private int intCodigo;
    private String strMarcoLegal;

    //<editor-fold defaultstate="collapsed" desc="Sets y Gets">
    /**
     * @return the objCriterio
     */
    public CCriterio getObjCriterio() {
        return objCriterio;
    }

    /**
     * @param objCriterio the objCriterio to set
     */
    public void setObjCriterio(CCriterio objCriterio) {
        this.objCriterio = objCriterio;
    }

    /**
     * @return the intCodigo
     */
    public int getIntCodigo() {
        return intCodigo;
    }

    /**
     * @param intCodigo the intCodigo to set
     */
    public void setIntCodigo(int intCodigo) {
        this.intCodigo = intCodigo;
    }

    /**
     * @return the strMarcoLegal
     */
    public String getStrMarcoLegal() {
        return strMarcoLegal;
    }

    /**
     * @param strMarcoLegal the strMarcoLegal to set
     */
    public void setStrMarcoLegal(String strMarcoLegal) {
        this.strMarcoLegal = strMarcoLegal;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public CCriterioMarcoLegal() {
    }

    public CCriterioMarcoLegal(CCriterio objCriterio, int intCodigo, String strMarcoLegal) {
        this.objCriterio = objCriterio;
        this.intCodigo = intCodigo;
        this.strMarcoLegal = strMarcoLegal;
    }
    //</editor-fold>

}
