
public class Testinterfacemultipleinheritance implements itrf1,itrf2{

	public void Show()
	{
		itrf1.super.Show();
		itrf2.super.Show();
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Testinterfacemultipleinheritance tmh = new Testinterfacemultipleinheritance();

	    tmh.Show();
	
	
	}

}
