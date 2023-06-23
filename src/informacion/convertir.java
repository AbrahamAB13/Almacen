/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informacion;

import com.google.gson.Gson;

/**
 *
 * @author Tesoem
 */
public class convertir {
    public datos aclase(String cadena){
        Gson gson = new Gson();
       
        return gson.fromJson(cadena, datos.class);
      
    }
    public String ajson(datos datos){
        Gson gson = new Gson();
        return gson.toJson(datos);
        
        
    }
}