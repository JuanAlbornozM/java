
package cl.duoc.abrazospaatras.Services;

import cl.duoc.abrazospaatras.DTO.Mascota;
import java.util.ArrayList;

public interface IListMascotas {
    public ArrayList<Mascota> listar();
    public String buscar (int id);
    public void guardar (Mascota mascota);
    public void eliminar (Mascota mascota);
    public void reemplazar (int id, Mascota mascota);
    
}
