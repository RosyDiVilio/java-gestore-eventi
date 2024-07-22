package org.java.gestore.eventi;

import java.time.LocalTime;
import java.util.Date;
import java.util.Random;

public class Concerto extends Evento {
	
	private LocalTime ora;
	private float prezzo;
	
	//costruttore per inizzializzare gli attributi
	public Concerto(String titolo, Date data, int postiTotali, int postiPrenotati, LocalTime ora, float prezzo) {
		super(titolo, data, postiTotali, postiPrenotati);
		
		LocalTime oraLocale = LocalTime.now();
		this.ora = ora;
		
		int min = 111111;
		int max = 999999;
		Random prezzoRandom = new Random();
		
		this.prezzo = prezzoRandom.nextInt(max - min) + min;
	}
	
	//metodi getter e setter per modificare e recuperare gli attributi
	public float getPrezzo() {
		return this.prezzo;
	}
	
	public String getPrezzoUmano() {
		return String.format("%.2f", this.prezzo);
	}
	
	public void setPrezzo() {
		this.prezzo = prezzo;
	}
	
	public LocalTime getOra() {
		return this.ora;
	}
	
	public void setOra() {
		this.ora = ora;
	}
	
	@Override
	public String toString() {
		return getData() + " " + "-" + " " + this.ora + " " + "-" + " " + getTitolo() + " " + "-" + " " + this.prezzo;
	}
}
