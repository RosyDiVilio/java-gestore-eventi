package org.java.gestore.eventi;

public class Evento implements Prenota, Disdici {
	
	private String titolo;
	private int data;
	private int postiTotali;
	private int postiPrenotati;
	
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public void setTitolo() {
		this.titolo = titolo;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData() {
		this.data = data;
	}
	
	private int getPostiTotali() {
		return this.postiTotali;
	}
	
	private void setPostiTotali() {
		if (postiTotali > 0) {
	    this.postiTotali = postiTotali;
		} else {
		   System.out.println("La data inserita non è corretta!");
		}
	}
	
	private int getPostiPrenotati() {
		return this.postiPrenotati;
	}
	
	public void setPostiPrenotati() {
		this.postiPrenotati = 0;
	}
	
	@Override 
	public void prenota() {
	   postiPrenotati = postiPrenotati + 1;
	}
	
	@Override
	public void disdici() {
		postiPrenotati = postiPrenotati - 1;
	}
	
	

}


