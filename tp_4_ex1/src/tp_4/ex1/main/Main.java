package tp_4.ex1.main;

import java.util.ArrayList;
import java.util.Scanner;

import tp_4.ex1.classes.Utilisateur;

public class Main {

	static ArrayList<Utilisateur> users;

	static void buildUsers() {
		System.out.println("#build users array#");
		users = new ArrayList<Utilisateur>();

		Utilisateur user1 = new Utilisateur("login1", "password1", 1, "Nom1", 10000.00);
		Utilisateur user2 = new Utilisateur("login2", "password2", 2, "Nom2", 10000.00);
		Utilisateur user3 = new Utilisateur("login3", "password3", 3, "Nom3", 10000.00);
		Utilisateur user4 = new Utilisateur("login4", "password4", 4, "Nom4", 10000.00);
		Utilisateur user5 = new Utilisateur("login5", "password5", 5, "Nom5", 10000.00);

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);

		System.out.println("#Users#");
		System.out.println(users.toString());
	}

	public static void main(String[] args) {

		buildUsers();

		Scanner s = new Scanner(System.in);

		System.out.print("Username : ");
		String username = s.nextLine();

		System.out.print("Password : ");
		String password = s.nextLine();

		s.close();
		
		Boolean authAccess = false;
		Utilisateur authUser = null;

		for (int i = 0; i < users.size(); i++) {
			Utilisateur u = users.get(i);
			if (u.getLogin() == username && u.getPassword() == password) {
				authAccess = true;
				authUser = u;
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
