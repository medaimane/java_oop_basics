package tp_4_ex3.classes;

public class Carre extends Forme {

	
	Double cote;
	
	public Carre(Double cote) {
		this.cote = cote;
	}

	@Override
	public Double getSurface() {
		return this.cote * this.cote;
	}
	
}
