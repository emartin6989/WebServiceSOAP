package Serveur;

import javax.xml.ws.Endpoint;

import WebService.BanqueService;

public class ServeurWebService {

	public static void main(String[] args) {
		// 1 création du serveur
String url="http://localhost:8585/";

//2 publication du web service
Endpoint.publish(url, new BanqueService());
System.out.println(url);
	}

}
