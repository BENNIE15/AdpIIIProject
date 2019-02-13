package ac.za.cput;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    System.out.println( "Hello World!" );

    ArrayList<String> colours = new ArrayList<>();

    colours.add("red");
    colours.add("green");
    colours.add("yellow");
    colours.add("white");
    colours.add("neon");
    colours.add("blue");
    colours.add("purple");
    colours.add("black");
    colours.add("grey");
    colours.add("silver");

    System.out.println("Colours been added to arrayList");
    System.out.println("-------------------------");

    for (String i: colours)
        {
            System.out.println(i);
        }



    }
}
