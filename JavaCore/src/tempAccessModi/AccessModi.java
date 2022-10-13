package tempAccessModi;

public class AccessModi 
{
	private String iAmPrivate;
	public String iAmPublic;
	String iAmDefualt;
	
	public AccessModi() {}
	
	
	//public AccessModi(String x, String y, String z)
	//{
		//if(x=="@@")
		//{	
			//iAmPrivate=x;
			//iAmPublic=y;
			//iAmDefualt=z;
		//}
	
	

	
//Best practice for creating a class
	//private attributes
	private String nameOfTech;
	private String ageOfTech;
	private int marketShare;

	//Public class
	public AccessModi(String nameOfTech, String ageOfTech, int marketShare)
	{
		this.ageOfTech=ageOfTech;
		this.nameOfTech=nameOfTech;
		this.marketShare=marketShare;
	}
}