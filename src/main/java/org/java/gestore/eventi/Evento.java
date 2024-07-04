package org.java.gestore.eventi;

import java.time.LocalDate;
import java.util.Date;

public class Evento implements Prenota, Disdici {
	
	private String titolo;
	private Date data;
	private int postiTotali;
	private int postiPrenotati;
	
	public Evento(String titolo, Date data, int postiTotali, int postiPrenotati ) {

		this.titolo = titolo;
		this.data = data;
		this.postiTotali = postiTotali;
		this.postiPrenotati = 0;
	}
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public void setTitolo() {
		this.titolo = titolo;
	}
	
	public Date getData() {
		return this.data;
	}
	
	private Date LocalDate() {
		return null;
	}
	
	public void setData() {
		if (data.after(LocalDate())) {
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
		this.postiPrenotati = postiPrenotati;
	}
	
	@Override 
	public void prenota() {
	   if (data.after(LocalDate())) {
		   postiPrenotati = postiPrenotati + 1;
	   } else {
		   System.out.println("La data non è disponibile: non puoi prenotare i posti");
	   } if (postiPrenotati > postiTotali) {
		   System.out.println("Disponibilità posti esaurita");
	   }
	}
	
	@Override
	public void disdici() {
		if (data.after(LocalDate()) && postiPrenotati > 0) {
		postiPrenotati = postiPrenotati - 1;
	    } else {
		System.out.println("La data non è disponibile: non puoi disdire i posti");
	    } if (postiPrenotati == 0) {
		System.out.println("Non ci sono posti da disdire");
	    }
    }
	
	@Override 
	public String toString() {
		return this.data + " " + "-" + " " + this.titolo;
	}
	
}


