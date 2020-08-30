//Christopher Meyers
import java.util.Random;
public class Forward extends Player{

	Random rand = new Random();
	 passBehavior pb;
	 ShootBehavior sb;
	 ChasePuckBehavior  cPb;
	 BlockBehavior bB;
	public String forward = "Forward";
	int randomNum = rand.nextInt(1);
	public Forward(String name) {
		
		super(name);
		if(Player.offense) {
			if(randomNum == 0) {
				setOffenceBehavior(pb);
			 }else {
				 setOffenceBehavior(sb);
			 }
			
		}
		if(Player.offense) {
			if(randomNum == 0) {
				
				setDefenceBehavior(cPb);
			 }else {
				 setDefenceBehavior(bB);
			 }
		}
	}
	
	
	public void setOffenceBehavior(OffenceBehavior ob) {
		 
		 if(ob!=null) {
			 Player.offenceBehavior =ob;
			 Player.offenceBehavior.play(); 
		 }
		
		
	}
	public void setDefenceBehavior(DefenceBehavior db) {
		if(db!=null) {
			db.play();
		}
	
		
	}

	
	
	public String toString() {
		
		return this.name +" plays the postion " + forward ;
	}

}
