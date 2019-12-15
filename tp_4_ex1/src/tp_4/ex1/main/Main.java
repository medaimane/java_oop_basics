package tp_4.ex1.main;

import java.util.Scanner;

import tp_4.ex1.classes.Utilisateur;

public class Main {

	public static void main(String[] args) {
		Utilisateur[] users = { 
			new Utilisateur("login1", "password1", 1, "Nom1", 10000.00),
			new Utilisateur("login2", "password2", 2, "Nom2", 10000.00),
		};

		Scanner s = new Scanner(System.in);

		System.out.println("Login : ");
		String login = s.nextLine();

		System.out.println("Password : ");
		String password = s.nextLine();


		Utilisateur authUser = null;

		for (int i = 0; i < users.length; i++) {
			
			if (users[i].equals(login, password)) {
				
				authUser = users[i];
				
			}
		}

		if (authUser != null) {
			System.out.println("Auth Success");
			authUser.AfficherUtilisateur();
		} else {
			System.out.println("Auth Failed");
		}
		
		s.close();
	}

}
