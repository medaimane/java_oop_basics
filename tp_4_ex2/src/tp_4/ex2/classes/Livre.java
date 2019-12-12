package tp_4.ex2.classes;

public class Livre extends Produit {
	
	String Titre;
	String Auteur;
	String ISBN;
	
	public Livre(Integer idProduit, String titre, String auteur, String iSBN) {
		super(idProduit);
		Titre = titre;
		Auteur = auteur;
		ISBN = iSBN;
	}
	
	@Override
	public void print() {
		System.out.println(this.Titre + ", " + this.Auteur + ", (ISBN : " + this.ISBN + ")");
	}

}
