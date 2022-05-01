package com.idat.TareaServicioI.repositorio;

import java.util.List;

import com.idat.TareaServicioI.modelo.Items;

public interface ItemRepositorio {

	public void guardarItem(Items item);
	public void editarItem(Items item);
	public void eliminarItem(Integer id);
	public List<Items> listarItems();
	public Items obtenerItemId(Integer id);
	
}
