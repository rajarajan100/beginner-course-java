
public class Dieselengine implements Engine {
	int input;
	int efficiency;
	
	public void input(int newinput)
	{
		input=newinput;
	}
	
	public void efficiencyincrease(int effinc) {
		efficiency=efficiency+effinc;
	}
	public void efficiencydecrease(int effdec) {
		efficiency=efficiency-effdec;
	}
	
	void result()
	{
		System.out.println("input:" +input +"  "+ "efficiency:" +efficiency);
		
	}

}
