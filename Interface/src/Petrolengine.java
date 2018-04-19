
public class Petrolengine implements Engine {
	int input;
	int efficiency;
	
	public void input(int newinput)
	{
		input=newinput;
	}

	public void efficiencyincrease(int neweffinc)
	{
		efficiency += neweffinc;
	}
	
	public void efficiencydecrease(int neweffdec)
	{
		efficiency -= neweffdec;
	}
	
	public void result()
	{
		System.out.println("input:" +input +"  "+ "effciency:" +efficiency);
	}
	
}
