/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author camilo
 */
public class ProvidersModel {

    private ConexionBD con;
    private Connection conex;

    public ProvidersModel(){
        con = new ConexionBD();
        conex = con.getConexion();
    }

    public ArrayList getProveedores(){
      ArrayList<ArrayList> proveedores = new ArrayList<ArrayList>();
      try{
        Statement query = conex.createStatement();
        ResultSet response = query.executeQuery("SELECT t.tercero_id, t.tipo_id, t.numero_id, t.direccion, t.nombre_tercero, t.telefono, p.estado FROM tercero as t INNER JOIN proveedor as p ON p.tercero_id = t.tercero_id");
        while(response.next()){
            int i= 1;
            ArrayList<String> proveedor = new ArrayList<String>();
            while(i<7){
                proveedor.add(response.getString(i));
                i++;
            }
            proveedores.add(proveedor);
        }
        return proveedores;
      }
      catch(SQLException ex){
          Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
          return proveedores;
      }
    }
}