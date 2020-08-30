//Christopher Meyers
public abstract class Player {
protected String name;
protected static boolean offense = true;
protected static DefenceBehavior defenceBehavior;
protected static OffenceBehavior offenceBehavior;
public Player (String name) {
	this.name = name;
	if(defenceBehavior!=null) {setDefenceBehavior(defenceBehavior);}
	if(offenceBehavior!=null) {setOffenceBehavior(offenceBehavior);}
}


public abstract void setDefenceBehavior(DefenceBehavior db);
public abstract void setOffenceBehavior(OffenceBehavior ob);
	
public String play() {
	if(offense) {
		if(offenceBehavior !=null) {
			return offenceBehavior.play();
		}else {
			return null;
		}
		
	}else {
		if(defenceBehavior != null) {
			return defenceBehavior.play();
		}else {
			return null;
		}
		
	}
}
public void turnover() {
	if(offense) {
		offense =false;
	}else {
		offense =true;
	}
}
}
