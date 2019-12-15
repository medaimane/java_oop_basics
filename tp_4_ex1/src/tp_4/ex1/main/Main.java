package tp_4.ex1.main;

import java.util.Scanner;

import tp_4.ex1.classes.Utilisateur;

public class Main {

	public static void main(String[] args) {

		System.out.println("#build users array#");

//		Utilisateur[] users = new Utilisateur[5];
//		
//		users[0] = new Utilisateur("login1", "password1", 1, "Nom1", 10000.00);
//		users[1] = new Utilisateur("login2", "password2", 2, "Nom2", 10000.00);
//		users[2] = new Utilisateur("login3", "password3", 3, "Nom3", 10000.00);
//		users[3] = new Utilisateur("login4", "password4", 4, "Nom4", 10000.00);
//		users[4] = new Utilisateur("login5", "password5", 5, "Nom5", 10000.00);

		Utilisateur[] arrayOfUtilisateurs = { 
			new Utilisateur("login1", "password1", 1, "Nom1", 10000.00),
			new Utilisateur("login2", "password2", 2, "Nom2", 10000.00),
			new Utilisateur("login3", "password3", 3, "Nom3", 10000.00),
			new Utilisateur("login4", "password4", 4, "Nom4", 10000.00),
			new Utilisateur("login5", "password5", 5, "Nom5", 10000.00), 
		};

		System.out.println("#Users#");
		System.out.println(arrayOfUtilisateurs.toString());

		Scanner s = new Scanner(System.in);

		System.out.print("Username : ");
		String username = s.nextLine();

		System.out.print("Password : ");
		String password = s.nextLine();

		s.close();

		Boolean authAccess = false;
		Utilisateur authUser = null;

		for (int i = 0; i < arrayOfUtilisateurs.length; i++) {
			if (arrayOfUtilisateurs[i].getLogin() == username && arrayOfUtilisateurs[i].getPassword() == password) {
				authAccess = true;
				authUser = arrayOfUtilisateurs[i];
			}
		}

		if (authAccess == true) {
			System.out.println("Auth Success");
			authUser.AfficherUtilisateur();
		} else {
			System.out.println("Auth Failed");
		}
	}

}
