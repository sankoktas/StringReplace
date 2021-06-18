import java.awt.Rectangle;
import java.util.Scanner;
public class KFS_StringReplace_Main
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word, program will change its 'i's with '!'s and 's's with '$': ");
        String word = input.next();
        
        String replaceword1 = word.replace("i", "!"); // replaces i with !
        String replaceword2 = replaceword1.replace("s", "$");
        
        System.out.println("Modified version of your word: " + replaceword2);
        
        String s1 = "Mississippi"; // actual string 
        String replaceString1 = s1.replace("i", "!"); // replaces i with !
        String replaceString2 = replaceString1.replace("s", "$"); // replaces s with dollar sign
        
        System.out.println("Actual:" + s1); // prints actual 
        System.out.println("Modified:" + replaceString2); // prints modified
        
    }
}
