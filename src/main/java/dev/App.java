package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("super");
        
        String asciiArt = FigletFont.convertOneLine("ca    marche");
        System.out.println(asciiArt);
        
    }
}
