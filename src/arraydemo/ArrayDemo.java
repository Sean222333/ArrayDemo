
package arraydemo;
import java.util.Scanner;
/**
 *
 * @author Sheng
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        char[] myLetters = new char[5];
        myLetters[0]='R';
        myLetters[1]='o';
        myLetters[2]='n';
        myLetters[3]='a';
        myLetters[4]='k';
        for(int i = 0; i<myLetters.length; i++){
            System.out.print(myLetters[i]);
       
            
        }
         */
        //new comments
        //added comment for revert
        System.out.println("Enter Word:");
        Scanner input = new Scanner(System.in);
      
        String myWord = input.nextLine();
        char[] myLetters = new char[myWord.length()];
        
        for(int i = 0; i<myLetters.length; i++){
            myLetters[i]=myWord.charAt(i);
            System.out.print(myLetters[i]);
        
        }
        System.out.println("");
        System.out.println("Print in reverse");
        for(int i=myLetters.length-1; i>=0; i-- ){
            System.out.print(myLetters[i]);
            
        }
        
        
        
        
    }
    
}
