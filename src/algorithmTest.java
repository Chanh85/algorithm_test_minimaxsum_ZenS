import java.util.*;

public class algorithmTest {
    
    //Read user input and put it in the array
    public static int[] userInputArray()
    {
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Input: ");
        String input = scanInput.nextLine();
        String[] toArray = input.split(" ");
        int[] inputArray = new int[toArray.length];
        
        for(int i = 0; i < inputArray.length; i++)
        {
            inputArray[i] = Integer.parseInt(toArray[i]);
        }
        scanInput.close();

        return inputArray;
    }

    //Calculate minimum and maximum sum of an array.
    public static String miniMaxSum(int[] array)
    {
        String result = "";
        int temp = 0;
        long[] tempResult = new long[array.length];

        for(int i = 0; i< array.length; i++)
        {
            int flag = array[i];
            for(int j = 0; j< array.length; j++)
            {
                if(array[j] == flag)
                {
                    continue;
                }
                temp += array[j];
            }
            tempResult[i] = temp;
            temp = 0;
        }
        Arrays.sort(tempResult);
        result = Long.toString(tempResult[0]) + " " + Long.toString(tempResult[tempResult.length-1]);

        return result;
        
    }

    //test section
    public static void main(String[] args) throws Exception {
        int[] array = userInputArray();
        System.out.println(miniMaxSum(array));
    }
}
