import java.util.Scanner;
import java.util.Arrays;

class lvp3 {

    // Function to return the length
    // of the longest valid substring
    public static int solve(String s, int n)
    {

        // Variables for left and right
        // counter maxlength to store
        // the maximum length found so far
        int left = 0, right = 0;
        int maxlength = 0;

        // Iterating the string from left to right
        for (int i = 0; i < n; i++) {

            // If "(" is encountered, then
            // left counter is incremented
            // else right counter is incremented
            if (s.charAt(i) == '(')
                left++;
            else
                right++;


			System.out.println("From left to right!   left="+left+"    right="+right);
            // Whenever left is equal to right,
            // it signifies that the subsequence
            // is valid and
            if (left == right){
                maxlength = Math.max(maxlength,
                                     2 * right);
									 
				System.out.println("Max length 1 = "+maxlength);
				System.out.println("---------------------");
									 }
                
            // Resetting the counters when the
            // subsequence becomes invalid
            else if (right > left)
                left = right = 0;
        }

        left = right = 0;

        // Iterating the string from right to left
        for (int i = n - 1; i >= 0; i--) {

            // If "(" is encountered, then
            // left counter is incremented
            // else right counter is incremented
            if (s.charAt(i) == '(')
                left++;
            else
                right++;
				
			System.out.println("From Right to Left!   left="+left+"    right="+right);
            // Whenever left is equal to right,
            // it signifies that the subsequence
            // is valid and
            if (left == right){
                maxlength = Math.max(maxlength, 
                                     2 * left);
				System.out.println("Max length 2 = "+maxlength);
				System.out.println("---------------------");
				}
            // Resetting the counters when the
            // subsequence becomes invalid
            else if (left > right)
                left = right = 0;
        }
        return maxlength;
    }

    // Driver code
    public static void main(String args[])
    {
        // Function call
        System.out.print("the length of the longest valid substring = "+solve(")((()()()())())(((())(", 22));
    }
}
