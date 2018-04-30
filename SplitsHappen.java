/**
 *Splits Happen programming test
 *Author: Logan Race
 */
import java.util.Scanner;

public class SplitsHappen 
{
    public static void main(String[] args)
    {
        //Take score sheet and create an array for the score card
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Scorecard: ");
        String scoreString = (in.nextLine());
        char[] charArray = scoreString.toCharArray();
        int[] scoreArray = new int[charArray.length];
        int score = 0;
        int roll = 0;
        //Char array to int array
        for (int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] == 'X')
                scoreArray[i] = 10;
            else if (charArray[i] == '-')
                scoreArray[i] = 0;
            else if (charArray[i] == '/')
                scoreArray[i] = (10 - scoreArray[i-1]);
            else
                scoreArray[i] = Character.getNumericValue(charArray[i]);
        }
        //read through int array and add up scores
        for (int i = 0; i < 10; i++)
        {
            if (scoreArray[roll] == 10)
            {
                score += (10 + scoreArray[roll+1] + scoreArray[roll+2]);
                roll ++;
            }
            else if (scoreArray[roll] + scoreArray[roll+1] == 10)
            {
                score += (10 + scoreArray[roll+2]);
                roll += (2);
            }
            else
            {
                score += (scoreArray[roll] + scoreArray[roll+1]);
                roll += 2;
            }
        }
        System.out.println("Total Score: " + score);
            
}
}
