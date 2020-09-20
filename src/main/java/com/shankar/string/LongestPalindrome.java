package com.shankar.string;

/**
 * Find the longest palindrome in a given string
 */
class LongestPalindrome {
    public static void main(String ar[]){

    }
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        //Start from one end. Find longest palindrome around that char.
        for(int i=0; i < s.length(); i++){
            String palindrome = getEvenPalindromeAroundChar(i, s);
            //System.out.println(" pos = "+i+" even palin "+palindrome);
            if(longestPalindrome.length() < palindrome.length()){
                longestPalindrome = palindrome;
            }
            palindrome = getOddPalindromeAroundChar(i, s);
            //System.out.println(" pos = "+i+" odd palin "+palindrome);
            if(longestPalindrome.length() < palindrome.length()){
                longestPalindrome = palindrome;
            }
        }
        return longestPalindrome;
    }

    private String getOddPalindromeAroundChar(int startPos, String s){
        int left=startPos;
        int right=startPos;

        while(left > 0 && right < s.length() -1){
            //check if left and right are same
            if(s.charAt(left-1) != s.charAt(right+1)){
                break;
            }else{
                left--;
                right++;
            }
        }
        StringBuilder palindrome = new StringBuilder();
        for(int i=left; i <= right;i++){
            palindrome.append(s.charAt(i));
        }
        return palindrome.toString();
    }

    private String getEvenPalindromeAroundChar(int startPos, String s){
        int left=startPos;
        int right=startPos+1;
        if(right == s.length()){
            return "";
        }
        if(s.charAt(left) != s.charAt(right)){
            return "";
        }
        while(left > 0 && right < s.length() -1){
            //check if left and right are same
            if(s.charAt(left-1) != s.charAt(right+1)){
                break;
            }else{
                left--;
                right++;
            }
        }
        StringBuilder palindrome = new StringBuilder();
        for(int i=left; i <= right;i++){
            palindrome.append(s.charAt(i));
        }
        return palindrome.toString();
    }

}

