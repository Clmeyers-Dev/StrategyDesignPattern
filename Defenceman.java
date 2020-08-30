//Christopher Meyers
import java.util.Random;
public  class Defenceman extends Player{
public String Defenceman  = "Defenceman";
Random rand = new Random();
passBehavior pB;
SlapShotBehavior sSB;
ChasePuckBehavior CPB;
BlockBehavior bB;
	public Defenceman(String name) {
		super(name);
		
	}
	@Override
	public void setOffenceBehavior(OffenceBehavior ob){
		int randomNum = rand.nextInt(1);
		if(randomNum ==0) {
			pB.play();
		}else {
			sSB.play();
		}
	}
	@Override
	public void setDefenceBehavior(DefenceBehavior db) {
		int randomNum = rand.nextInt(1);
		if(randomNum ==0) {
			CPB.play();
			
		}else {
			bB.play();
		}
		
	}
public String toString() {
		
		return this.name +" plays the postion " + Defenceman ;
	}




}
