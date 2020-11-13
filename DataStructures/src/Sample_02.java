import JAVA.util.List.LinkedList;
import JAVA.util.List.List;

/*
 * Linked List implementation  
 * */

public class Sample_02 {

	public static void main(String[] args) {
		
		Student[] student = new Student[6];
		student[0] = new Student("ram" , 19, 123456 , "ram@gmail.com");
		student[1] = new Student("raja" , 21, 123456 , "raja@gmail.com");
		student[2] = new Student("ravi" , 20, 123456 , "ravi@gmail.com");
		student[3] = new Student("raghul" , 25, 123456 , "raghul@gmail.com");
		student[4] = new Student("siva" , 18, 123456 , "siva@gmail.com");
		student[5] = new Student("arun" , 24, 123456 , "arun@gmail.com");
		
		Student student_temp = student[2];
		
		List<Student> ll = new LinkedList<Student>(student);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println("is empty : " +ll.isEmpty() );
		System.out.println(ll.get(1));
		ll.set(1,student_temp);
		System.out.println(ll);
		System.out.println(ll.indexOf(student[2]) +" "+ll.lastIndexOf(student[2]));
		ll.inserAt(5, student_temp);
		System.out.println(ll);
		ll.replaceAtEnd(student[2], student[0]);
		System.out.println(ll);
		//ll.deleteAtEnd(student[2]);
		//System.out.println(ll);	
		//ll.delete(student[2]);
		//System.out.println(ll);
		ll.deleteAll(student[2]);
		
		//List <Student> ll2 = new LinkedList<Student>();
		//ll2.add(student);
		//System.out.println(ll2.containsAll(student));
		ll.swap(0, 3);
		System.out.println(ll);
		ll.reversed();
		System.out.println(ll);
		
	}
 
}
class Student {
	private String Name;
	private int age;
	private long phoneNumber;
	private String email;
	
	public Student(){}
	public Student(String Name,int age,long phoneNumber,String email){
		this.Name = Name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.email=email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString(){
		return String.format("%s %d %s %s",this.Name,this.age, this.phoneNumber,this.email);
	}
	
}