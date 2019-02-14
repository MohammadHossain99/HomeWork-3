package homework3; //encapsulation

public class studentinfo {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setstudentid(001);
		st1.setfirst("Mohammad");
		st1.setlast("Hossain");
		st1.setdob("01/01/1990");
		
		System.out.println(st1.getstudentid()+ " " +st1.getfirst() + " " + st1.getlast()+ " "+ st1.getdob());

	}

}
