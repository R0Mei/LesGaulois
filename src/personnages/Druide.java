package personnages;

public class Druide extends Gaulois{
	int nbPotion = 0;
	int[] Potions = new int[10];
	
	public Druide(int force, String name) {
		super(force, name);
		for(int i = 0;i<Potions.length;i++) {
			Potions[i]=0;
		}
	}
	public void fabricationPotion(int nb) {
		int puissance = (int)(Math.random() * 4)+2;
		for(int i = 0;i<nb;i++) {
			if(nbPotion!=Potions.length) {
				Potions[i]= puissance;
				nbPotion++;
				}
			else {
				System.out.println("Plus de place dans le sac à dos !");
				return;
			}
		}
	System.out.println("Le gaulois "+getName()+ ": \" J'ai concocté "+nb+" doses de potion magique. Elle a une force de "+puissance+".\".");
	}
	public int getPotion() {
		for(int i = nbPotion-1; i>=0;i--) {
			if (Potions[i]!=0) {
				int popo=Potions[i];
				Potions[i]=0;
				nbPotion -=1;
				return popo;
			}
		}
		return 1;
	}
}
