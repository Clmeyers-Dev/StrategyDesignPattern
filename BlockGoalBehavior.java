//Christopher Meyers
import java.util.Random;
public class BlockGoalBehavior implements DefenceBehavior {
	Random rand = new Random();
	@Override
	public String play() {
		 int randomNum = rand.nextInt(4);
		 if(randomNum == 0) {
			 return (" hand blocks the puck");
		 }
		 if(randomNum ==1) {
			 return ("catches the puck");
		 }
		 if(randomNum ==2) {
			 return ("blocks puck with knee pads");
		 }
		 if(randomNum ==3) {
			 return ("blocks puck with stick");
		 }else {
			 return null;
		 }
	}
	

}
