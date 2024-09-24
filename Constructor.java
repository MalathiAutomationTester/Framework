
public class Constructor {
	//its a block of code it will initialize when the obj is createted in class
	//constructor name same as class name
	// not must have explicit returntype
	//cant be a static ,final, and synchronize
	String name;
	int id;
	public void display() {
	System.out.println(name);
	System.out.println(id);

	}

public static void main(String[] args) {
	Constructor Const = new Constructor();
Const.display();
}
}
