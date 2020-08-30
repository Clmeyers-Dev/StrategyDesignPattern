//Christopher Meyers
import java.util.Random;
public class BlockBehavior implements DefenceBehavior,OffenceBehavior {
 Random rand = new Random();

@Override
public String play() {
	 int randomNum = rand.nextInt(3);
	 
	 if(randomNum == 0) {
		 return (" blocks player from passing");
	 }
	 if(randomNum ==1) {
		 return ("blocks player from shooting");
	 }
	 if(randomNum ==2) {
		 return ("Checks Player with puck");
	 }else {
		 return null;
	 }
}
}
