package MentoringAhmet.InterviewQuestion;

import MentoringAhmet.MapPracticeWithList.Parent;

public class AlphaCharacters  {
    //print out only alphabetic characters,
    //print out only digit characters,
    //print out only symbols(other characters)


//i need to reach out each of the letters
public static void main(String[] args) {

    String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
    String OnlyAlphabets="";
    String OnlyDigits="";
    String OnlySpecial="";
    for(int i = 0; i<given.length();i++){
        char ch =given.charAt(i);
        if(Character.isAlphabetic(ch)&&!Character.isDigit(ch)){
            OnlyAlphabets+=ch;
        }else if(!Character.isAlphabetic(ch)&&Character.isDigit(ch)){
            OnlyDigits+=ch;
        }else{
            OnlySpecial+=ch;
        }
    }
    System.out.println("Alphabets = "+OnlyAlphabets);
    System.out.println("Digits = "+OnlyDigits);
    System.out.println("Special Characters" +OnlySpecial);
}

}
