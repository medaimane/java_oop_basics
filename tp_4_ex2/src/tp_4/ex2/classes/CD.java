package tp_4.ex2.classes;

public class CD extends Produit {
	String Titre;
	String Auteur;

	public CD(Integer idProduit, String titre, String auteur) {
		super(idProduit);
		Titre = titre;
		Auteur = auteur;
	}

}
