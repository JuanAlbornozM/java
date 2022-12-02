/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.abrazospaatras.DTO;


public class Mascota {
    private String nombre;
    private String tipo;
    private boolean castrado;

    public Mascota(String nombre, String tipo, boolean castrado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.castrado = castrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
    
    
    
}
