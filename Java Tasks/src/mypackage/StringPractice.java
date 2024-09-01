package mypackage;
public class StringPractice {
    public static void main(String[] args) {

	String greeting = "Hello";
	String name = "Dina";
	String exclamation ="!";
	
	String message=greeting + name + exclamation;
	System.out.println(message);
		
	int length=message.length();
	System.out.println("The length of the message is: "+length);

    }
}
