package it.lissandrini.libretto;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto libr = new Libretto();
		
		libr.add(new Voto(25, "Informatica 1", LocalDate.of(2020, 1, 16)));
		libr.add(new Voto(30, "Informatica 2", LocalDate.of(2020, 1, 16)));
		libr.add(new Voto(30, "Informatica 3", LocalDate.of(2020, 2, 16)));
		libr.add(new Voto(25, "Informatica 1", LocalDate.of(2020, 2, 16)));
		libr.add(new Voto(24, "Informatica 2", LocalDate.of(2020, 3, 16)));
		libr.add(new Voto(24, "Informatica 2", LocalDate.of(2020, 3, 16)));
		libr.add(new Voto(23, "Informatica 3", LocalDate.of(2020, 4, 16)));
		libr.add(new Voto(23, "Informatica 4", LocalDate.of(2020, 4, 16)));
		libr.add(new Voto(22, "Informatica 4", LocalDate.of(2020, 5, 16)));
		libr.add(new Voto(22, "Informatica 3", LocalDate.of(2020, 5, 16)));
		
	}

}
