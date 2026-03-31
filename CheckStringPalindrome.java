class CheckStringPalindrome {
    
    static void checkPalindrome(String str)
    {
        String rev = "";
        int l = str.length();
        
        for(int i = 0; i<l; i++)
        {
            rev = str.charAt(i) + rev;
        }
        
        if(str.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
    
    public static void main(String[] args) 
    {
        String str = "mada";
        checkPalindrome(str);
    }
}