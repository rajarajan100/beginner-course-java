
public class Employee extends Person {
	float Salary;
	Employee(int id,String name,float Salary){
		super(id,name);
	this.Salary=Salary;
	}
void display(){
	System.out.println(id+""+name+""+Salary);
	}
}
