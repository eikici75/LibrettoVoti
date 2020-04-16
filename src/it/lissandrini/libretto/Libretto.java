package it.lissandrini.libretto;

import java.util.ArrayList;
import java.util.Iterator;
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
	
	/**
	 * Restituisce una lista
	 * @param punti punteggio da ricerva
	 * @return lista di {@link Voto} aventi quel punteggio
	 */	
	public List<Voto> CercaVoti(int punti) {
		List<Voto> risultati = new ArrayList<>();
		
		for (Voto v: this.voti) {
			if (v.getPunti() == punti) {
				risultati.add(v);
			}	
		}
		return risultati;
	}
	
	/**
	 *  Ricerca un voto relativo al corso 
	 * @param nomeEsame nome del corso
	 * @return il {@link Voto} corrispondeye, oppure {@code null} de non esiste.
	 */
	public Voto cercaEsame(String nomeEsame) {
		for(Voto v: this.voti) {
			if (v.getCorso().equals(nomeEsame)) {
				return v;
			}
		}
		return null;
	}
	
	/**
	 * Dato un {@link voto}, determina se esiste già un voto con uguale
	 * corso ed punteggio 
	 * @param v
	 * @return {@ true} se ha trovato un corso e punteggio uguali
	 * 		   {@ false} se non ha trovato nessuna uguaglianza
	 */
	public boolean asistegiaVoto(Voto v) {
		Voto trovato = this.cercaEsame(v.getCorso());
		if (trovato==null) {
			return false;
		}
		if (trovato.getPunti()==v.getPunti()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((voti == null) ? 0 : voti.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libretto other = (Libretto) obj;
		if (voti == null) {
			if (other.voti != null)
				return false;
		} else if (!voti.equals(other.voti))
			return false;
		return true;
	}
	
	

}
