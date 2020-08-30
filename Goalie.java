//Christopher Meyers
public class Goalie extends Player {
public String Goalie = "Goalie";
BlockGoalBehavior BGB;
	public Goalie(String name) {
		super(name);
		
		setDefenceBehavior(BGB);
		setOffenceBehavior(offenceBehavior);
	}

	@Override
	public void setDefenceBehavior(DefenceBehavior db) {
		if(db!=null) {
			BGB.play(); 
		}else {
			return;
		}
		
		
	}

	@Override
	public void setOffenceBehavior(OffenceBehavior ob) {
		if(ob!=null) {
			BGB.play();
		}else {
			return;
		}
		
		
	}
public String toString() {
		
		return this.name +" plays the postion  " + Goalie ;
	}
	

}
