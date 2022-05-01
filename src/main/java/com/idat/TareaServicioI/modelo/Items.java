package com.idat.TareaServicioI.modelo;

import java.io.Serializable;

public class Items implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8910730209493424613L;
	
	private Integer idItem;
	private String item;
	private Integer cantidad;
	private Integer total;
	
	public Items() {
		super();
	}
	
	public Integer getIdItem() {
		return idItem;
	}
	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
}
