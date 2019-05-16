import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Numbers {

		public int smallestNumber(int n) {
				
				Random r = new Random();
				ArrayList<Integer> list = new ArrayList<Integer>();      
			    //Generates 500 Random Numbers in between 0 to 1000
				for (int i=0; i<=500; i++) {
		            list.add(r.nextInt(1000));
		        }
			    
				Collections.sort(list);
				
			    return list.get(n);
			    
			
		}
}
