package liskov;

public class Test {
	public static void main(String[] args) {
		Owl owl=new Owl();
		Animal an=new Animal();
		an.learnToFly(owl);
	}

}
