import java.util.Scanner;


public class Main { 
	static int x;
	static int y;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isMath = false;
		while (!isMath) {
			System.out.println("Enter First Number:");
			while(!sc.hasNextInt()) {
				System.out.println("Wrong Input, use numbers");
				sc.next();
			}
			x = sc.nextInt();
			
			System.out.println("Enter Second Number:");
			while(!sc.hasNextInt()) {
				System.out.println("Wrong Input, use numbers");
				sc.next();
			}
			y = sc.nextInt();
			
			isMath = true;
		}	
		
		boolean isSelected = false;
		while (!isSelected) {
			System.out.println("Select Option:"
					+ "\n1 - Add"
					+ "\n2 - Substract"
					+ "\n3 - Multiple"
					+ "\n4 - Divide1");
					
			while(!sc.hasNextInt()) {
				System.out.println("Wrong option"
						+ ""
						+ "Select Option:"
						+ "\n1 - Add"
						+ "\n2 - Substract"
						+ "\n3 - Multiple"
						+ "\n4 - Divide1");
				sc.next();
			}
			
			int mathOp = sc.nextInt();
			switch (mathOp) {
				case 1: 
					System.out.println(x + " + " + y +" = " + (x+y));
					isSelected = true;
					break;
				case 2: 
					System.out.println(x + " - " + y +" = " + (x - y));
					isSelected = true;
					break;
				case 3: 
					System.out.println(x + " * " + y +" = " + (x * y));
					isSelected = true;
					break;
				case 4:
					try {
						System.out.println(x + " / " + y +" = " + (x / y));
					}catch(Exception e) {
						System.out.println("You cannot devide on 0");
					}
					isSelected = true;
					break;
				default:
					System.out.println("Something wrong");
					isSelected = true;
					break;
			}
		}
		sc.close();
	}
}


