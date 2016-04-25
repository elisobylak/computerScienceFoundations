import java.io.*;
public class Replace{
	public static void main(String args[]) {
		String Str = new String("Nano is a cool way to Java");

		System.out.print("Return Value:" );
		System.out.println(Str.replace('N', 'J'));

		System.out.print("Return Value:" );
		System.out.println(Str.replace('J', 'N'));
		}
}
