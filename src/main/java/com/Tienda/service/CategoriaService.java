
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Metodo para consultar las categorias. El parametro define si se muestran solo las activas o todas
    public List<Categoria> getCategorias(boolean activos);
    
    // Se obtiene una categoria por su ID
    public Categoria getCategoria(Categoria categoria);
    
    //Insertar, se inserta cuando el id categoria esta vacio (valor 0 o null)
    //Modificar, se modifica cuando el id categoria no esta vacio
    public void save(Categoria categoria);
    
    //Se elimina un registro por su idCategoria
    public void delete(Categoria categoria);
   
    
    
}
