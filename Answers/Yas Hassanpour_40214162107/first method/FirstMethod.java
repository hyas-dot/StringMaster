import java.util.Scanner;
public class FirstMethod
{
    public static void main(String[] args)
    {
        Scanner statement= new Scanner(System.in);
        Scanner num= new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence = statement.nextLine();
        System.out.print("\nEnter the index number: ");
        int indexNum= num.nextInt();
        String result=  wordFinder(sentence, indexNum);
        System.out.print("The result is: "+result);
    }
    public static String wordFinder (String sentence, int number)
    {
        String[] word= sentence.split(" ");
        if (number>0&&number<=word.length)
        {
            return word[number-1];
        }
        else
        {
            return"The number is out of range!";
        }

    }
}