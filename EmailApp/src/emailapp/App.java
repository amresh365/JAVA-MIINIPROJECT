package emailapp;

public class App {
public static void main(String[] args) {
	
	Email em1=new Email("Amresh","Gupta");
	
	em1.SetAlterNateEmail("ag@gmail.com");
	System.out.println("Alternate Email"+em1.getAlterNetEmail());
	
    System.out.println(	em1.showInfo());
	
	
}
}
