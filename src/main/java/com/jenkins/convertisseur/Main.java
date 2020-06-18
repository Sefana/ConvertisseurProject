package com.jenkins.convertisseur;
import java.util.Scanner;

import com.jenkins.bank.Account;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account("R", "Sefana", "epargne", 123456, 100000);
		
		System.out.println("Que voulez vous convertir ?");
		System.out.println("1. Des euro en francs");
		System.out.println("2. Des francs en euro");
		System.out.println("3. Des euro en dollars");
		System.out.println("4. Des dollars en euro");
		System.out.println("5. Acceder a mon compte bancaire");
		System.out.print("Votre choix :");
		int choix = sc.nextInt();
		
		System.out.print("Veuillez saisir le montant a convertir : ");
		int montant = sc.nextInt();
		
		switch (choix) {
		case 1:
			final double tauxEF = 0.152449;
			System.out.println(montant/tauxEF);
			break;
		case 2:
			final double tauxFE = 6.55957;
			System.out.println(montant/tauxFE);
			break;
		case 3:
			final double tauxED = 0.889334;
			System.out.println(montant/tauxED);
			break;
		case 4:
			final double tauxDE = 1.12449;
			System.out.println(montant/tauxDE);
			break;
		case 5:
			System.out.println("Saisir le numero du compte :");
			int compte = sc.nextInt();
			if(compte == acc.getId()) {
				System.out.println("Le numero du compte est " + acc.getId());
				System.out.println("Ce compte est un compte " + acc.getType());
				System.out.println("Sa valeur initiale est de " + acc.getValeur());
			} else {
				System.out.println("Le numero de compte n'est pas valide");
			}
		default:
			System.out.println("Veuillez saisir une valeur correcte");
			break;
		}
		
	}
}
