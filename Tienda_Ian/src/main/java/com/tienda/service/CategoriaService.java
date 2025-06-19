/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    // Se obtiene un listado de categorías (activas o no)
    public List<Categoria> getCategorias(boolean activo);

    // Se obtiene una categoría a partir del ID
    public Categoria getCategoria(Categoria categoria);
    
    // Inserta o actualiza una categoría
    public void save(Categoria categoria);
    
    // Elimina una categoría
    public void delete(Categoria categoria);
}

