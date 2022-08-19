public class NestedLoopTriangle {
	public static void main (String []args){
	// making the right triangle 
	int rows = 6;
    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
	System.out.println();
	System.out.println();
	// making the straight triangle
	int level = 6; 
	int k = 0;
	for(int o =1; o<=level; ++o) {
		for (int spa = 1; spa <= level - o; ++spa) {
			System.out.print("  "); 
		}
	while (k != 2 * o - 1) {
		System.out.print("* ");
		++k; 
	}
	
	System.out.println();
	
	}
	
	}
	
}