package tp_4_ex3.main;

import tp_4_ex3.classes.Carre;
import tp_4_ex3.classes.Circle;
import tp_4_ex3.classes.Forme;

public class Main {

	public static void main(String[] args) {
		
		Forme[] figures = new Forme[3];
		
		
		figures[0] = new Carre(2.);
		figures[1] = new Circle(3.);
		figures[2] = new Carre(5.2);
		
		for (int i = 0; i < figures.length; i++) {
			System.out.println(figures[i] + " : surface = " + figures[i].getSurface() + "cm2");
		}
	}

}
