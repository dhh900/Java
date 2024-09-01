package mypackage;
public class DataTypes {
	public static void main(String[] args) {
		int currentYear=2024;
		double pi=3.14159;
		boolean weather=true;
		char firstLetter='D';
		
		System.out.println(currentYear);
		System.out.println(pi);
		System.out.println(weather);
		System.out.println(firstLetter);
		
		System.out.println(currentYear+pi);
		System.out.println(currentYear-pi);
		System.out.println(currentYear*pi);
		System.out.println(currentYear/pi);

		String familyName="Hefzy";
		String newString=firstLetter+"."+familyName;
		System.out.println(newString);
		
		String myName="Dina";
		System.out.println(myName.length());
		System.out.println(myName.toLowerCase());
		System.out.println(myName.toUpperCase());
		System.out.println(myName.replace('D','L'));
		System.out.println(myName.substring(1,4));		
	}

}
