/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.abrazospaatras.Services.APP;

import cl.duoc.abrazospaatras.DTO.Mascota;
import cl.duoc.abrazospaatras.Services.IListMascotas;
import java.util.ArrayList;

/**
 *
 * @author juana
 */
public class ListarMascotas implements IListMascotas{
    private ArrayList<Mascota> Lista;

    public ListarMascotas() {
        this.Lista = new ArrayList();
    }
    
    

    @Override
    public ArrayList<Mascota> listar() {
        return Lista;
    }

    @Override
    public String buscar(int id) {
        return Lista.get(id).toString();
    }

    @Override
    public void guardar(Mascota mascota) {
        Lista.add(mascota);
    }

    @Override
    public void eliminar(Mascota mascota) {
        Lista.remove(mascota);
    }

    @Override
    public void reemplazar(int id, Mascota mascota) {
        Lista.set(id, mascota);
    }
    
}
