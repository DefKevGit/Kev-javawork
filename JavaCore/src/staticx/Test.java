package staticx;

public class Test {
	public static void main(String[] args) {
		Sample obj1=new Sample();
		obj1.name="Angel";
		obj1.SSN=2034567;
		
		/*Sample obj2=new Sample();
		obj2.name="Kev";
		obj2.SSN=4561231;*/
		
		//nameOfOrg for Sample object 1 "Sun Microsystems"
		System.out.println(obj1.nameOfOrg);
		
		//nameOfOrg for uninstantiated Sample 
		System.out.println(Sample.nameOfOrg);
		
		//nameOfOrg for uninstantiated Sample changed to Oracle
		Sample.nameOfOrg="Oracle";
		//new nameOfOrg for uninstantiated Sample 
		System.out.println(Sample.nameOfOrg);
		
		//new Sample object takes new nameOfOrg "Oracle"
		Sample obj2=new Sample();
		obj2.name="Kev";
		obj2.SSN=4561231;
		//Test to see if new static value has been adopted == True
		System.out.println(obj2.nameOfOrg);
		
	}

}
