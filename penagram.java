import java.util.Scanner;
public class penagram {
    public boolean checkIfPangram(String sentence) {
        boolean[] letterPresent = new boolean[26];
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if(ch >= 'a' && ch<='z'){
                letterPresent[ch - 'a']= true;
            }
        }    
        for (boolean present : letterPresent) {
            if(!present){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        String in = input.nextLine();

        penagram checker = new penagram();
        boolean result = checker.checkIfPangram(in);
        System.out.println("string is panagram? " + result);

        input.close();
    }
   
}
