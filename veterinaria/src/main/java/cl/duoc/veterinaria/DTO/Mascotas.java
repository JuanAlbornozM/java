
package cl.duoc.veterinaria.DTO;

import java.time.LocalDate;

public class Mascotas {
    private int codigo;
    private String nombre;
    private Clientes cliente;
    private LocalDate fechaNacimiento;
    private String raza;
    private String especie;
    private String descripcion;

    public Mascotas(int codigo, String nombre, Clientes cliente, LocalDate fechaNacimiento, String raza, String especie, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cliente = cliente;
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
        this.especie = especie;
        this.descripcion = descripcion;
    }
    
    public Mascotas() {
        this.codigo = 0;
        this.nombre = "";
        this.cliente = new Clientes();
        this.fechaNacimiento = LocalDate.now();
        this.raza = "";
        this.especie = "";
        this.descripcion = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "codigo=" + codigo + ", nombre=" + nombre + ", cliente=" + cliente + ", fechaNacimiento=" + fechaNacimiento + ", raza=" + raza + ", especie=" + especie + ", descripcion=" + descripcion + '}';
    }
    
    

    
    
    
}