package presentation;

import java.io.File;


import javax.xml.bind.JAXBContext;

import javax.xml.bind.Unmarshaller;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws Exception {
		
		JAXBContext context = JAXBContext.newInstance(Compte.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		System.out.println("cr�ation d'un compte");
		Compte cp = (Compte) unmarshaller.unmarshal(new File("compte.xml"));
				
		System.out.println(cp);
		
	}

}
