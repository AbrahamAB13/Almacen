/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informacion;

import Informacion.Info_nombre;

/**
 *
 * @author Tesoem
 */
public class datos {
    Info_nombre nombres;
    String Fechadenacimiento;
    String correo;
    String rfc;
    info_direccion direccion;
    

    public datos(Info_nombre nombres, String Fechadenacimiento, String correo, String rfc, info_direccion direccion) {
        this.nombres = nombres;
        this.Fechadenacimiento = Fechadenacimiento;
        this.correo = correo;
        this.rfc = rfc;
        this.direccion = direccion;
      
     
    }
    
    public datos() {
    }

   public Info_nombre getNombres() {
        return nombres;
        
    }

    public void setNombres(Info_nombre nombres) {
        this.nombres = nombres;
    }

    

    public String getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.Fechadenacimiento = fechadenacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public info_direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(info_direccion direccion) {
        this.direccion = direccion;
    }

  
 
    
}
