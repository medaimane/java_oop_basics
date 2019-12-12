package tp_4.ex2.classes;

public class Produit {

	private Integer idProduit; 
	
	public Produit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public void print() {
		System.out.println(" ID :  " + this.idProduit);
	}
}
