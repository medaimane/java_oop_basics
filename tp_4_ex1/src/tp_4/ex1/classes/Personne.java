package tp_4.ex1.classes;

public class Personne {

	private Integer ID;
	private String Nom;
	private Double Salaire;

	public Personne() {
		super();
	}

	public Personne(Integer iD, String nom, Double salaire) {
		super();
		this.ID = iD;
		this.Nom = nom;
		this.Salaire = salaire;
	}

	public Personne(Personne p) {
		this.ID = p.ID;
		this.Nom = p.Nom;
		this.Salaire = p.Salaire;
	}

	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer iD) {
		this.ID = iD;
	}

	public String getNom() {
		return this.Nom;
	}

	public void setNom(String nom) {
		this.Nom = nom;
	}

	public Double getSalaire() {
		return this.Salaire;
	}

	public void setSalaire(Double salaire) {
		this.Salaire = salaire;
	}

	@Override
	public String toString() {
		return "Personne [ID=" + this.ID + ", Nom=" + this.Nom + ", Salaire=" + this.Salaire + "]";
	}

	public void AfficherPersonne() {
		System.out.println(this.toString());
	}

}
