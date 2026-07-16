package orologio;

import java.util.Scanner;

public class Clock {
	Scanner scanner = new Scanner(System.in);

	public void displayPartOfDay() {
		int ora;
		int minuti;
		
		
		System.out.print("Inserisci ora: ");
		ora = scanner.nextInt();
		System.out.print("Inserisci minuti: ");
		minuti = scanner.nextInt();
		
		
		if (ora>=6 && ora<=11 && minuti<=59) {
			System.out.print("L'ora" +ora+ ":" +minuti+ " è MATTINA");
		} else if (ora>=12 && ora<=17 && minuti<=59) {
			System.out.print("L'ora" +ora+ ":" +minuti+ " è POMERIGGIO");
		} else if (ora>=18 && ora<=22 && minuti<=59) {
			System.out.print("L'ora" +ora+ ":" +minuti+ " è SERA");
		} else if (ora>=23 || ora<=5  && minuti<=59) {
			System.out.print("L'ora" +ora+ ":" +minuti+ " è NOTTE");
		} 
		else {
			System.out.print("Orario Inesistente! Le ore vanno dalle 00 alle 24");
		}
		
		
		
		
		
		
	}
}
