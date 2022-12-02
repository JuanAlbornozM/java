
package cl.duoc.veterinaria.DTO;

import cl.duoc.veterinaria.until.Validaciones;

public abstract class Personas {
    private String nombre;
    private int rut;
    private char dv;        
    private String email;
    private String direccion;
    
    Validaciones validar = new Validaciones();
    

    public Personas(String nombre, int rut, char dv, String email, boolean particular,String direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.dv = dv;
        this.email = email;
        this.direccion = direccion;
    }
    public Personas() {
        this.nombre = "";
        this.rut = 0;
        this.dv = 0;
        this.email = "";
        this.direccion = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }
    
    public char getDv() {
        return dv;
    }

    public void setRut(int rut, char dv) {
        if (validar.validaRut(rut, dv)){
            this.rut = rut;
            this.dv = dv;
        }
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(validar.ValidarEmail(email)){
            this.email = email;
        }
        else{
            this.email = "No cumple requisito";
        }        
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public abstract String toString();
        
    

    
}
