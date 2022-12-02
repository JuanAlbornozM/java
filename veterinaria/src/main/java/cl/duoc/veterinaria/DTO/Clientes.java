
package cl.duoc.veterinaria.DTO;

public class Clientes extends Personas {
    private int telefono;
    private String comuna;
    private boolean particular;

    public Clientes(int telefono, String comuna, boolean particular) {
        this.telefono = telefono;
        this.comuna = comuna;
        this.particular = particular;
    }
    
    
    public Clientes() {
        this.telefono = 0;
        this.comuna = "";
        this.particular = false;
    }
    
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if (validar.validarTelefono(telefono)){
        this.telefono = telefono;
        }
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }

    @Override
    public String toString() {
        return "clientes{" + "telefono=" + telefono + ", comuna=" + comuna + ", particular=" + particular + '}';
    }
    
    
}
