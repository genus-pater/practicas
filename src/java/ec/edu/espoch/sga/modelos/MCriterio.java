/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.sga.modelos;

import ec.edu.espoch.sga.accesodatos.AccesoDatos;
import ec.edu.espoch.sga.accesodatos.ConjuntoResultado;
import ec.edu.espoch.sga.accesodatos.Parametro;
import ec.edu.espoch.sga.entidades.CCriterio;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eborja
 */
public class MCriterio {

    public static boolean insertarCriterio(CCriterio objCriterio) throws Exception {
        boolean booRespuesta = false;
        try {
            ArrayList<Parametro> arrLstCriterio = new ArrayList<>();
            String sql = "SELECT * from sgc.fn_insert_tcriterio(?)";
            arrLstCriterio.add(new Parametro(1, objCriterio.getStrNombre()));

            ConjuntoResultado conResultado = AccesoDatos.ejecutaQuery(sql, arrLstCriterio);
            while (conResultado.next()) {
                if (conResultado.getBoolean(0) == true) {
                    booRespuesta = true;
                }
            }
            conResultado = null;
        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());
        }
        return booRespuesta;
    }

    public static Boolean actualizarCriterio(CCriterio objCriterio) throws Exception {
        Boolean booResultado = false;
        String strQuery = "SELECT sgc.fn_update_tcriterio(?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, objCriterio.getLonCodigo()));
        lisParametros.add(new Parametro(2, objCriterio.getStrNombre()));
        ConjuntoResultado conResultado = AccesoDatos.ejecutaQuery(strQuery, lisParametros);
        while (conResultado.next()) {
            if (conResultado.getString("fn_update_tpersona").equals("true")) {
                booResultado = true;
            }
        }
        return booResultado;
    }

    public static ArrayList<CCriterio> obtenerCriterio() throws Exception {
        ArrayList<CCriterio> arrLstCriterio = new ArrayList<>();
        try {
            String strSql = "SELECT * FROM sgc.fn_select_tcriterio();";
            ConjuntoResultado conResultado = AccesoDatos.ejecutaQuery(strSql);
            arrLstCriterio = llenarCriterio(conResultado);
            conResultado = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return arrLstCriterio;
    }

    public static ArrayList<CCriterio> llenarCriterio(ConjuntoResultado conResultado) throws Exception {
        ArrayList<CCriterio> arrLstCriterio = new ArrayList<>();
        CCriterio objCriterio = null;
        try {
            while (conResultado.next()) {
                objCriterio = new CCriterio(conResultado.getInt(0),
                        conResultado.getString(1));
                arrLstCriterio.add(objCriterio);
            }
        } catch (Exception e) {
            arrLstCriterio.clear();
            //  integracion.auditoria.log ublog = new integracion.auditoria.log();
            // ublog.write("Modulo", "llenarModulos", e.getClass().getName(), e.getMessage());
            throw e;
        }
        return arrLstCriterio;
    }
}
