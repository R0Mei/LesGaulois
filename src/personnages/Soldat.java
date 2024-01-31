package personnages;


public class Soldat extends Romain {
	public Grade grade;

	public Soldat(int force, String name, Grade g) {
		super(force, name);
		this.grade = g;
	}

}
