import java.lang.*;
import java.util.Scanner;
class BinaryToDecimal {
    public static void main(String[] args){
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a binary number: ");
        String binaryString =input.nextLine();
        System.out.println("Output: "+Integer.parseInt(binaryString,2));

        char numberAsCharArray[]= binaryString.toCharArray();
        System.out.println("Size: " + numberAsCharArray.length);
        if (numberAsCharArray[0] ==0 ) {
            System.out.println("It is a zero!");
        } else {
            System.out.println("Es no zero!!!!");
        }
    }
}