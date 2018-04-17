
public class Testencapsulate {

	public static void main(String[] args) {
		Encapsulate e = new Encapsulate();
		
		e.setAge(25);
		e.setName("Raja");
		e.setCity("Cuddalore");
		
		System.out.println("Name:"+e.getName());
		System.out.println("Age:"+e.getAge());
		System.out.println("City:"+e.getCity());
		

	}

}
