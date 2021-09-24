import java.util.Scanner;

public class CheckInput {
	void charCheck(char input)
	{
		if ((input >= 65 && input <= 90)
			|| (input >= 97 && input <= 122))
			System.out.println(" Alphabet ");

		else if (input >= 48 && input <= 57)
			System.out.println(" Digit ");

		else
			System.out.println(" Special Character ");
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		//char input=s.
		CheckInput ci=new CheckInput();
		char input = s.next().charAt(0);
		ci.charCheck(input);
	}
}
