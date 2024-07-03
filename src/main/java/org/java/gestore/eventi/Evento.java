package org.java.gestore.eventi;

import java.util.Date;

public class Evento implements Prenota, Disdici {
	
	private String titolo;
	private Date data;
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
		Date dataAttuale = new Date();
		if (data.after(dataAttuale)) {
			this.data = data;
		} else {
			System.out.println("La data inserita è gia passata");
		}
	}
	
	private int getPostiTotali() {
		return this.postiTotali;
	}
	
	private void setPostiTotali() {
		if (postiTotali > 0) {
	    this.postiTotali = postiTotali;
		} else {
		   System.out.println("il numero di posti inserito non è corretto!");
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


