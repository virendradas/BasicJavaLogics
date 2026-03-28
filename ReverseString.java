class ReverseString
{
    public static void main(String[] args) {
        String str = "Hello";
        String rev = "";
        int l = str.length();
        
        for(int i=0; i<l; i++)
        {
            rev = str.charAt(i) + rev;
            if(rev.length() == str.length())
            {
                System.out.print(rev);
            }
        }
    }
}