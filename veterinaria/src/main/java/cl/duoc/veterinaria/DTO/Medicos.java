
package cl.duoc.veterinaria.DTO;

public class Medicos extends Personas {
    private String especialidad;

    public Medicos(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public Medicos() {
        this.especialidad = "";
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "medicos{" + "especialidad=" + especialidad + '}';
    }
    
    
}
