package tp_4.ex1.classes;

public class Utilisateur extends Personne {

	private String login;
	private String password;

	public Utilisateur() {
		super();
	}

	public Utilisateur(String login, String password, Integer iD, String nom, Double salaire) {
		super(iD, nom, salaire);
		this.login = login;
		this.password = password;
	}

	public Utilisateur(Personne p, Utilisateur u) {
		super(p);
		this.login = u.login;
		this.password = u.password;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Utilisateur [login=" + login + ", password=" + password + "]";
	}
	
	public void AfficherUtilisateur() {
		System.out.println(this.toString());
		this.AfficherPersonne();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	public boolean equals(String login, String password) {
		return this.login.equals(login) && this.password.equals(password);
	}
	
	
}
