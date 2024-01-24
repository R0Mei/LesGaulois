package personnages;


public class Soldat extends Romain {
	private Grade grade;

	public Soldat(int force, String name, Grade g) {
		super(force, name);
		this.grade = g;
	}

}
