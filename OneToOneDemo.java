class Passport {
	int passportNo;
	String nationality;
	Passport(int passportNo,String nationality)
	{
		this.passportNo = passportNo;
		this.nationality = nationality;
	}
}
class Person{
	int id;
	String name;
	Passport pass;
	Person(int id,String name, Passport p){
		this.id = id;
		this.name = name;
		this.pass = p;
	}
}
public class OneToOneDemo{
	public static void main(String[]args){
		Passport p = new Passport(987654,"Indian");
		Person m = new Person(1,"Krishna",p);
		System.out.println(m.pass.passportNo);
	}
}
	
		
	
