
package challengequestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ChallengeQuestions {

    public static void main(String[] args) {
       
        /* Question 1
        System.out.println(Arrays.toString(bondValues(5.0, 0.15, 10)));*/

        /* Question 2
        System.out.println(uniqueArray(new int[]{6,5,3,7,7}));*/
        
        /* Question 3
        System.out.println(Arrays.toString(arrays(new double[]{6,5.5,3},
                new double[]{1,2.5,3,1,1})));*/
        
        /* Question 4
        System.out.println(Arrays.toString(commonNumbers(new int[]{6,5,3,1,5,3},
        new int[]{1,2,3,1,1,5})));*/

        /* Question 5
        System.out.println(Arrays.toString(consonentSequence("question5.txt")));*/
        
        /* Question 6
        Room room = new Room(1, 2, 5.2);
        System.out.println("Square footage: " + room.squareFootage());
        System.out.println("Wall area: " + room.wallArea());*/
        
        /*Question 7
        Scanner input = null;
        
        try{
            input = new Scanner(new File("bulb.txt"));
        } catch (FileNotFoundException e) {
            System.exit(1);
        }
        
        Light[] bulbArray = new Light[Integer.parseInt(input.nextLine())];
        
        for(int i = 0; i < bulbArray.length; i++)
        {
            String[] properties = input.nextLine().split(",");
            bulbArray[i] = new Light(properties[0], properties[1], properties[2]);
            if(bulbArray[i].isOn())
                System.out.println(bulbArray[i]);
        }*/
        
        /* Question 8
        System.out.println(taxes(new double[]{1, 2, 3, 4, 5}, 0.5));*/
       
        /* Question 9
        System.out.println(isPalindrome("rotator"));*/
        
        /* Question 10
        System.out.println(Arrays.toString(sumArray(new int[][]{{1,2,3,4},{1,2,3,4},
        {1,2,3,4}})));*/
        
        /* Question 11
        System.out.println(countWords("In a professional context it often happens that private or corporate clients corder a publication to be made and presented with the actual content still not being ready. Think of a news blog that's filled with content hourly on the day of going live. However, reviewers tend to be distracted by comprehensible content, say, a random text copied from a newspaper or the internet. The are likely to focus on the text, disregarding the layout and its elements. Besides, random text risks to be unintendedly humorous or offensive, an unacceptable risk in corporate environments. Lorem ipsum and its many variants have been employed since the early 1960ies, and quite likely since the sixteenth century.",
                                "and"));*/
        
        /* Question 12
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Dress", 100.00));
        cart.addItem(new Item("Coffee", 5.25));
        cart.addItem(new Item("Hat", 1.00));
        cart.addItem(new Item("Watering Can", 10.00));
        cart.addItem(new Item("Firelogs", 30.99));
        cart.addItem(new Item("Lampshade", 100.10));
        
        cart.recepit(0.13, 10.00);*/
        
        /* Question 13
        System.out.println(morsecode("ERIN27"));*/
        
        /* Question 14
        Club club = new Club("members.txt");
        club.addMember("Hershel", "Farmhouse");
        System.out.println(club.checkMembership("Harry", "Quidditch"));
        System.out.println(club.checkMembership("Ron", "Burrow"));*/
        
        
    }
    
    /* Question 1
    static double[] bondValues(double initialAmount, double rate, int nYears)
    {
	double[] investmentArray = new double[nYears];
	investmentArray[0] = initialAmount;

     	for (int i = 1; i < nYears; i++)
	{
		investmentArray[i] = investmentArray[i - 1] * (1 + rate);
	}  
	
	return investmentArray;
    }*/
    
    /* Question 2
    static boolean uniqueArray(int[] testArray)
    {
	for(int i = 0; i < testArray.length; i++)
	{
            for(int j = i + 1; j < testArray.length; j++)
            {
		if (testArray[i] == testArray[j])
                    return false;
            }
	}
	return true;
    }*/
    
    /* Question 3
    public static double[] arrays(double[] first, double[] second)
{
	int longer = (first.length > second.length) ? first.length : second.length;
	int shorter = (first.length < second.length) ? first.length : second.length;

	double[] combined = new double[longer];

	for (int i = 0; i < longer; i++)
	{
            if (i < shorter)
                combined[i] = first[i] + second[i];
            else if (first.length == longer)
                combined[i] = first[i];
            else
                combined[i] = second[i];
	}
	
	return combined;

    }*/
    
    /* Question 4
    public static int[] commonNumbers(int[] first, int[] second)
    {
        int[] longer = (first.length > second.length) ? first : second;
        int[] shorter = (first.length <= second.length) ? first : second;
        int[] third = new int[shorter.length];

        boolean duplicate;
        int length = 0;
        
        for(int i = 0; i < shorter.length; i++)
        {
            duplicate = false;
                    
            for(int j = i + 1; j < shorter.length; j++)
            {
                if(shorter[i] == shorter[j])
                {
                    duplicate = true;
                    break;
                }
            }
                 
            if(!duplicate)
            {
                for(int j = 0; j < longer.length; j++)
                {
                    if(shorter[i] == longer[j])
                    {
                        third[length] = shorter[i];
                        length++;
                        break;
                    }
                }
            }
        }
        
      return Arrays.copyOf(third, length);  
    }*/
    
    /* Question 5
    public static String[] consonentSequence(String infile)
    {
        String sequence = "";
	String contender = "";
	String seqWord= "";
        String word = "";
        Scanner input = null;
        
	try{
            input = new Scanner(new File(infile));
	} catch(FileNotFoundException e) {
            System.exit(1);
	}

	while(input.hasNext())
	{
                contender = "";
		word = input.next();
                
		for(int i = 0; i < word.length(); i++)
		{
			switch(word.charAt(i))
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
                                    if(contender.length() > sequence.length())
                                    {
                                        sequence = contender;
                                        seqWord = word;
                                    }
                                    contender = "";
                                    break;
				default:
                                    contender += word.charAt(i);
                                    
			}
                        if(contender.length() > sequence.length())
                            {
                                sequence = contender;
                                seqWord = word;
                            }
		}
	}

        if(input != null)
            input.close();
        
	return new String[]{sequence, seqWord, String.valueOf(sequence.length())};
}*/
    
    /* Question 8
    public static double taxes(double cart[], double taxrate)
    {
	int totalPrice = 0;

	for(double item : cart)
	{
		totalPrice += item * (1 + taxrate);
	}

	return totalPrice;
    }*/
    
    /* Question 9
    public static boolean isPalindrome(String in)
    {
     	boolean isPalindrome = true;

	for(int i = 0; i < in.length() / 2; i++)
	{
		if(in.charAt(i) != in.charAt(in.length() - 1 - i))
			isPalindrome = false;
	}
	
	return isPalindrome; 	
    }*/
    
    /* Question 10
    public static int[] sumArray(int[][] toSum)
    {
	int[] summedArray = new int[toSum[0].length];

	for(int i = 0; i < toSum.length; i++)
	{
		for(int j = 0; j < toSum[i].length; j++)
		{
			summedArray[j] += toSum[i][j];
		}
	}
        return summedArray;
    }*/
    
    /* Question 11
    public static int countWords(String text, String word)
    {
	int count = 0;

	String[] words = text.split(" ");
	for(int i = 0; i < words.length; i++)
	{
		if(!Character.isLetter(words[i].charAt(words[i].length()- 1))
                    && words[i].substring(0, words[i].length() - 1).equalsIgnoreCase(word))
                        count++;
                    
                if (words[i].equalsIgnoreCase(word))
                {
                    count++;
                }
	}
    return count;
    }*/
    
    /* Question 13
    public static String morsecode(String encode)
    {
        String morse = "";
        for(int i = 0; i < encode.length(); i++)
        {
            switch(encode.charAt(i))
            {
                 case 'A':
                    morse += ". ---   ";
                    break;
                 case 'B':
                    morse += "--- . . .   ";
                    break;
                 case 'C':
                    morse += "--- . --- .   ";
                    break;
                 case 'D':
                    morse += "--- . .   ";
                    break;
                 case 'E':
                    morse += ".   ";
                    break;
                 case 'F':
                    morse += ". . --- .   ";
                    break;
                 case 'G':
                    morse += "--- --- .   ";
                    break;
                 case 'H':
                    morse += ". . . .   ";
                    break;
                 case 'I':
                    morse += ". .   ";
                    break;
                 case 'J':
                    morse += ". --- --- ---   ";
                    break;
                 case 'K':
                    morse += "--- . ---   ";
                    break;
                 case 'L':
                    morse += ". --- . .   ";
                    break;
                 case 'M':
                    morse += "--- ---   ";
                    break;
                 case 'N':
                    morse += "--- .   ";
                    break;
                 case 'O':
                    morse += "--- --- ---   ";
                    break;
                 case 'P':
                    morse += ". --- --- .   ";
                    break;
                 case 'Q':
                    morse += "--- --- . ---";
                    break;
                 case 'R':
                    morse += ". --- .   ";
                    break;
                 case 'S':
                    morse += ". . .   ";
                    break;
                 case 'T':
                    morse += "---   ";
                    break;
                 case 'U':
                    morse += ". . ---   ";
                    break;
                 case 'V':
                    morse += ". . . ---   ";
                    break;
                 case 'W':
                    morse += ". --- ---   ";
                    break;
                 case 'X':
                    morse += "--- . . ---   ";
                    break;
                 case 'Y':
                    morse += "--- . --- ---   ";
                    break;
                 case 'Z':
                    morse += "--- --- . .   ";
                    break;
                 case '1' :
                    morse += ". --- --- --- ---   ";
                    break;
                 case '2':
                    morse += ". . --- --- ---   ";
                    break;
                 case '3':
                    morse += ". . . --- ---   ";
                    break;
                 case '4':
                    morse += ". . . . ---   ";
                    break;
                 case '5':
                    morse += ". . . . .   ";
                    break;
                 case '6':
                    morse += "--- . . . .   ";
                    break;
                 case '7':
                    morse += "--- --- . . .   ";
                    break;
                 case '8':
                    morse += "--- --- --- . .   ";
                    break;
                 case '9':
                    morse += "--- --- --- --- .   ";
                    break;  
                 case '0':
                    morse += "--- --- --- --- ----   ";
                    break;  
                }
            }
	return morse;
        }*/
    
        /*
        
    */
}   
