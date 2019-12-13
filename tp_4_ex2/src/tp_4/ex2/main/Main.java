package tp_4.ex2.main;

import tp_4.ex2.classes.CD;
import tp_4.ex2.classes.Livre;
import tp_4.ex2.classes.Produit;

public class Main {

	public static void main(String[] args) {
		
		Livre livre1 = new Livre(1, "TitreLivre1", "AuteurLivre1", "ISBNLivre1");
		CD cd1  = new CD(1, "TitreCD1", "AuteurCD1", 30);
		
		livre1.print();
		cd1.print();
		
		Produit prod1 = new CD(2, "TitreCD2", "AuteurCD2", 40);
		
		prod1.print();
		
		Produit prod2 = new Livre(2, "TitreLivre2", "AuteurLivre2", "ISBNLivre2");
		
		prod2.print();
		
		// Remark : When we create an object from a type and a different reference type (child of this type), 
		// 			this object takes a type of the reference. this is the concept of Polymorphisme !!
	}

}
