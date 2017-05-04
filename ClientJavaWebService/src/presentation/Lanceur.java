package presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import webservice.BanqueService;
import webservice.BanqueWS;
import webservice.Compte;

public class Lanceur {

	public static void main(String[] args) {
		BanqueService bs = new BanqueWS().getBanqueServicePort();
		System.out.println("CONVERSION");
		bs.conversionED(100);
		System.out.println(bs.conversionED(100)+ " $");
		System.out.println("CONSULTER UN COMPTE");
		Compte c = bs.getCompte(10);
		System.out.println(c);
		System.out.println("LISTER LES COMPTES");
		List<Compte> comptes = bs.getComptes();
		for (Compte cp : comptes) {
			System.out.println(cp);
		}

	}

}
