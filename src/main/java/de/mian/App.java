package de.mian;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
	Scanner keyboard = new Scanner(System.in);
	String text = keyboard.nextLine();
		
	System.out.println(text.toUpperCase() );
    }
}
