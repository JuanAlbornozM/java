
package cl.duoc.veterinaria.DTO;

import java.time.LocalDate;

public class Atenciones {
    private LocalDate fecha;
    private Medicos medico;
    private Mascotas mascota;
    private String procedimiento;
    private String observacion;
    private int valor;

    public Atenciones(LocalDate fecha, Medicos medico, Mascotas mascota, String procedimiento, String observacion, int valor) {
        this.fecha = fecha;
        this.medico = medico;
        this.mascota = mascota;
        this.procedimiento = procedimiento;
        this.observacion = observacion;
        this.valor = valor;
    }
    
    public Atenciones() {
        this.fecha = LocalDate.now();
        this.medico = new Medicos();
        this.mascota = new Mascotas();
        this.procedimiento = "";
        this.observacion = "";
        this.valor = 0;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public Mascotas getMascota() {
        return mascota;
    }

    public void setMascota(Mascotas mascota) {
        this.mascota = mascota;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Atenciones{" + "fecha=" + fecha + ", medico=" + medico + ", mascota=" + mascota + ", procedimiento=" + procedimiento + ", observacion=" + observacion + ", valor=" + valor + '}';
    }
    
    
    
    
}
