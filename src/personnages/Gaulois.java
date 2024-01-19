package personnages;

public class Gaulois {
	private int force;
	private String name; 
	public Gaulois(int force, String name) 
	{
		this.force = force;
		this.name = name;
	}
	public String getName()
	{
		return(name);
	}
	public void parler(String phrase) {
		System.out.println("Le gaulois "+getName()+" : \""+ phrase+"\".");
	}
	public void frapper(Romain ouf)
	{
		System.out.println(getName()+" envoie un grand coup dans la machoire de "+ouf.getName()+".");
		ouf.recevoirCoup(force/3);
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois(8,"Astérix");
		System.out.println(asterix.getName());
	}
}
