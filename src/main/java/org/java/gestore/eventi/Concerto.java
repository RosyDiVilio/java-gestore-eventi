package org.java.gestore.eventi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento {
	
	private LocalTime ora;
	private float prezzo;
	
	//costruttore per inizzializzare gli attributi
	public Concerto(String titolo, LocalDate data, int postiTotali, LocalTime ora, float prezzo) {
		super(titolo, data, postiTotali);
		
		//inizzializzazione degli attributi
		this.ora = ora;
		this.prezzo = prezzo;
		
	}
	
	//metodi getter e setter per modificare e recuperare gli attributi
	public float getPrezzo() {
		return this.prezzo;
	}
	
	public String getPrezzoUmano() {
		return String.format("%.2f", this.prezzo);
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public LocalTime getOra() {
		return this.ora;
	}
	
	public void setOra(LocalTime ora) {
		this.ora = ora;
	}
	
	@Override
	public String toString() {
		return "Data e ora: " +  super.getData() + " " + "alle" + " " + this.ora + " " + "-" + " " + "Titolo evento: " + super.getTitolo() + " " + "-" + " " + "Prezzo: " + "€" + getPrezzoUmano();
	}
}
