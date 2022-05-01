package com.idat.TareaServicioI.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.TareaServicioI.modelo.Items;

@Repository
public class ItemRepositorioImpl implements ItemRepositorio {
	
	public List<Items> lista = new ArrayList<Items>();

	@Override
	public void guardarItem(Items item) {
		// TODO Auto-generated method stub
		lista.add(item);
	}

	@Override
	public void editarItem(Items item) {
		// TODO Auto-generated method stub
		lista.remove(obtenerItemId(item.getIdItem()));
		lista.add(item);
	}

	@Override
	public void eliminarItem(Integer id) {
		// TODO Auto-generated method stub
		lista.remove(obtenerItemId(id));
	}

	@Override
	public List<Items> listarItems() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Items obtenerItemId(Integer id) {
		// TODO Auto-generated method stub
		return lista.stream().filter(i -> i.getIdItem() == id).findFirst().orElse(null);
	}

}
