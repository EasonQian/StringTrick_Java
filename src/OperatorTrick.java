
public class OperatorTrick {

	public OperatorTrick() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		int x = 0, y = 1, z = 3;
		String s = "x, y, z ";
		
		/*
		 * compiler converts x y z to string
		 * output: 
		 * x, y, z 012
		 */
		print(s + x + y + z);
		
		/*
		 * converts to string, regardless of location
		 * output:
		 * 1 x, y, z
		 */
		print(x + " " + s);
		
		/*
		 * use parentheses to control evaluation order
		 * output:
		 * x, y, z (summed) = 3
		 */
		s += "(summed) = ";
		print(s + (x + y + z));
		
		/*
		 * easy way to convert to string, rather than use methods of Integer
		 */
		print("" + x);
	}

	
	public static void print(String s){
		System.out.println(s);
	}
}
