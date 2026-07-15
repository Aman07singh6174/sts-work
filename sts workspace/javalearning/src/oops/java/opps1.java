
//class/object;

package oops.java;
class person{
	
	//atribut
	
	int age;
	String name,gender;
	
	//behaviaer
	
	public void run(){
		System.out.println("person.run");
	}
	public void work(){
		System.out.println("person.work");
	}
	public void sleep(){
		System.out.println("person.sleep");
	}
	public void print() {
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
		System.out.println("gender is:"+gender);
	}
}
public class opps1 {
	public static void main(String[] args) {
		
		//synterx--->classname objectname =newclass();
		
		
		person Raj = new person();
		Raj.name ="Raj singh";
		Raj.age=23;
		Raj.gender = "gender";
		
		Raj.run();
		Raj.work();
		Raj.sleep();
		Raj.print();
		
		
	}
}
