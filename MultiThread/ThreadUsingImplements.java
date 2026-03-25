class PhoneRepair implements Runnable
{
    public void run()
    {
        for(int i=0; i<20; i++)
        {
            System.out.println("Phone repairing..." + i);
        }
    }
}

class ManageCustomer implements Runnable
{
    public void run()
    {
        for(int i=0; i<20; i++)
        {
            System.out.println("Managing Customers..." + i);
        }
    }
}

class ThreadUsingImplements
{
    public static void main(String[] args) {
        Thread phone_r = new Thread(new PhoneRepair());
        Thread manage_c = new Thread(new ManageCustomer());

        phone_r.start();
        manage_c.start();
    }
}