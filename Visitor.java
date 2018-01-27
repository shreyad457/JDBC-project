
public class Visitor {

	String name;
	int roll;
	
	
	Visitor(int roll,String name)
	{
		this.name=name;
		this.roll=roll;
	}
	
	int getRoll()
	{
		return this.roll;
	}
	String display()
	{
		return "("+this.roll+",'"+this.name+"');";
	}
}