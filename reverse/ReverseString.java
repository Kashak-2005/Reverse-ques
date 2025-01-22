
class Solution{
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters at left and right indices
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move pointers towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // Example 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println(java.util.Arrays.toString(s1)); // Output: ["o", "l", "l", "e", "h"]

        // Example 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s2);
        System.out.println(java.util.Arrays.toString(s2)); // Output: ["h", "a", "n", "n", "a", "H"]
    }
}

