package tp_4.ex2.classes;

public class CD extends Produit {
	String Titre;
	String Auteur;
	Integer prix;

	public CD(Integer idProduit, String titre, String auteur, Integer prix) {
		super(idProduit);
		this.Titre = titre;
		this.Auteur = auteur;
		this.prix = prix;
	}
	
	@Override
	public void print() {
		System.out.println(this.Titre + ", Auteur :" + this.Auteur + ", pour le prix exceptionnel de : " + this.prix);
	}

}
