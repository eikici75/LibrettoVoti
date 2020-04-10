package it.lissandrini.libretto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v - {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		this.voti.add(v);
	}

}
