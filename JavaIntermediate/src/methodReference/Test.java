package methodReference;

public class Test 
{
	public static void main(String[] args) 
	{
		School sch=new School();
		Notable nt=sch::noteSomething;
		nt.note("lecture");
		Notable nt1=sch::writeSomething;
		nt1.note("lesson");
	}
}
