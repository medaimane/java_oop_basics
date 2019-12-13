package tp_4_ex3.classes;

public class Circle extends Forme {

	Double r;

	public Circle(Double r) {
		this.r = r;
	}

	@Override
	public Double getSurface() {
		return Math.PI*this.r*this.r;
	}

}
