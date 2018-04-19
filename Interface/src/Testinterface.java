
public class Testinterface {

	public static void main(String[] args) {
		
		Dieselengine de = new Dieselengine();
		
		de.input(3);
		de.efficiencyincrease(2);
		de.efficiencydecrease(1);
		System.out.println("The status of Dieselengine is");
		de.result();
		
        Petrolengine pe = new Petrolengine();
		
		pe.input(3);
		pe.efficiencyincrease(1);
		pe.efficiencydecrease(0);
		System.out.println("The status of Petrolengine is");
		pe.result();
		
	}

}
