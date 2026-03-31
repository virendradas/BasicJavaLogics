class Fibonaccy
{

    static void fibonaccyCall(int n)
    {
        int first = 0;
        int sec = 1;

        for(int i=1; i<=n; i++)
        {
            System.out.print(first + " ");
            int next = first + sec;
            first = sec;
            sec = next;
        }
    }

    public static void main(String[] args) {
        int n = 10;

        fibonaccyCall(n);
    }
}