
public class Tv {
private String display;
private String color;
private String testing;

public String getTesting() {
	return testing;
}

public String getDisplay() {
	return display;
}
public String getColor() {
	return color;
}
public Tv(String display, String color, String testing) {
	
	this.display = display;
	this.color = color;
	this.testing = testing;
}
public  String test(){
	if(testing.equals("tested"))
	{
     return "Ready";
	}
	else
		return "Not Ready";
}

}
