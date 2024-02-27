// 26 Feb 2024
public class Arrays{
    public static void main(String[] args) {
        // 1. Creating the array
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        // 2. Creating two varabiles sum and average
        int sum =0;
        Double average;
        // 3. Accessing all the elements inside the array using for each loop
        for(int element : myArray){
        // 4. Adding every elements in the sum
            sum += element;
        }
        // 5. Getting the array length
        int arrayLength = myArray.length;
        // 6. Calculate the average + convert the average from int to double
        average = ((double)sum / (double)arrayLength);
        // 7. Printing the Sum & Average
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}