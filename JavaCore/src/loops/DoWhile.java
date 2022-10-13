package loops;
//Do While will always run at least once regardless of conditions
public class DoWhile {
	public static void main(String[] args) {
		int x=0;
		do {
			System.out.println("Hello "+(x+1)+" times");
			x++;
           }while(x<=10);
	}
}
