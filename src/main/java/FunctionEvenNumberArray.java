public class FunctionEvenNumberArray {
    public static void main (String[]args){
        int [] numbers = {4,8,7,66,9,13,6,4};
        int [] even = getEvenNumberArray(numbers);
        for (int number:even){
            System.out.println("Even numbers " + number);
        }

    }
    private static int[] getEvenNumberArray (int[]numbers){
        int count = 0;
        for (int number:numbers){
            if (number%2==0){
                count++;
            }
        }
        int []evenNumbers = new int [count];
        int index =0;
        for (int number:numbers){
            if(number %2==0){
                evenNumbers[index]= number;
                index++;
            }
        }
        return evenNumbers;
    }

}
