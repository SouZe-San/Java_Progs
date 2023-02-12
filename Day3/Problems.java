
import java.util.Arrays;
import java.util.Scanner;

// 1. WAP to find the sum of every even numbers in an array. If all the array values are odd then print “ No even value found .“
class EvenFind {
    void sumOfEven(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        if (sum == 0) {
            System.out.println("No Even Value found :>>");
        } else {
            System.out.println("The sum of even of array is: " + sum);
        }

    }
}

// 2.Wap to check if a number input is an Armstrong number or not.
class Armstrong {
    void check(int num) {
        int digit_count = String.valueOf(num).length();
        int number = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digit_count);
            num = num / 10;
        }
        if (sum == number) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}

// 3. WAP to Convert a decimal number to its binary form. Accept decimal number
// at run-time.
class DecimalBinary {
    void convertBinary(int num) {
        int[] binary_count = new int[32]; // It Only Convert til 32 bits
        int count = 0;
        while (num > 0) {
            binary_count[count] = num % 2;
            num = num / 2;
            count++;
        }
        for (int j = count - 1; j >= 0; j--) {
            System.out.print(binary_count[j]);
        }
    }
}

// 4. WAP that accepts 5-character inputs into an array and checks if it is a
// palindrome.
class PalindromeChecker {
    char storeCh;
    String newString = "";

    void check(String str) {
        for (int i = 0; i < str.length(); i++) {
            storeCh = str.charAt(i);
            newString = storeCh + newString;
        }
        if (str.equals(newString)) {
            System.out.println("given Input is a Palindrome");
        } else {
            System.out.println("Given Input is Not a Palindrome");
        }
    }
}

// 5. WAP that accepts 10 characters into an array. Count the number of
// non-repeating characters in the array.
class NonRepeating {
    void nonRepeatingCount(Character arr[]) {
        int len = arr.length;
        Character[] repeatChar = new Character[len];
        int array_Index = 0;
        for (int i = 0; i < len; i++) {
            int count = 1;
            Character ch = Character.toLowerCase(arr[i]);
            if (Arrays.asList(repeatChar).contains(ch)) {
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                char nextChar = Character.toLowerCase(arr[j]);
                if (ch == nextChar) {
                    count++;
                }
            }
            if (count > 1) {
                repeatChar[array_Index] = ch;
                array_Index++;
            }
            if (count == 1) {
                System.out.println(arr[i] + " :-> is a Non repeating Character in Array");
            }
        }
    }
}

// 6. WAP to accept integer inputs into 3 rows and 5 columns.
// Display the contents of each row in reverse.
class ArrayDisplay {
    int[][] twoD_arr = new int[3][5];

    void inputInArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.format("Enter %dth Rows input: ", i + 1);
            for (int j = 0; j < 5; j++) {
                twoD_arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    void Display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(" " + twoD_arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

// 7. WAP to verify if a 2D matrix is an Acrostic or not.
class Acrostic {
    void acrosticCheck(char arr[][], int col, int row) {
        boolean flag = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] != arr[j][i]) {
                    flag = false;
                }
            }
        }

        if (flag) {
            System.out.println("this is ACROSTIC");
        } else {
            System.out.println("This is not acrostic");
        }
    }
}

public class Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
          //! Problem 01: ---->
          int[] num_arr = { 1, 2, 35, 3, 24, 17, 0, 4, 287, 2576, 2, 7,8 , 4,32, 5,
          4,675, 674, 45, 2, 43, 64, 5 };
          EvenFind even = new EvenFind();
          even.sumOfEven(num_arr);
            
         //! PROBLEM 03: ---------->
         Armstrong armstrong = new Armstrong();
         armstrong.check(153);
         
         //! Problem 03 : --------->
         DecimalBinary dTOb = new DecimalBinary();
         System.out.println("Enter The Decimal Number : ");
         dTOb.convertBinary(sc.nextInt());
         
         //! PROBLEM 04 --------->
         System.out.println("Give String or Integer for checking Palindrome");
         System.out.print("Enter: ");
         String input_String = sc.nextLine();
         sc.close();
         PalindromeChecker palCheck = new PalindromeChecker();
         palCheck.check(input_String);
         
         // !PROBLEM 05 ---------------->
         Character char_Array[] = { 'a', 'W', 'i', 'e', 'K', 'a', 'E', 'k', 'A', 'A'
         };
         NonRepeating charArray = new NonRepeating();
         charArray.nonRepeatingCount(char_Array);
         
         // ! PROBLEM 06 -------------->
         ArrayDisplay array = new ArrayDisplay();
         array.inputInArray();
         array.Display();
         //! Problem 07 -------->
         int row, col;
         System.out.println("Enter column number: ");
         col = sc.nextInt();
         System.out.println("enter the row number: ");
         row = sc.nextInt();
         System.out.println("Enter the string input in array : ");
         char[][] arr = new char[row][col];
         for (int i = 0; i < row; i++) {
         arr[i] = sc.next().toCharArray();
         }
         Acrostic matrix = new Acrostic();
         matrix.acrosticCheck(arr, col, row);
         */
        sc.close();
    }
}
