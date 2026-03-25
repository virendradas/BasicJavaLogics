class PhoneRepair extends Thread
{
    public void run()
    {
        for(int i=0; i<20; i++)
        {
            System.out.println("Phone repairing..." + i);
        }
    }
}

class ManageCustomer extends Thread
{
    public void run()
    {
        for(int i=0; i<20; i++)
        {
            System.out.println("Managing Customers..." + i);
        }
    }
}

class ThreadUsingExtends
{
    public static void main(String[] args) {
        PhoneRepair phone_r = new PhoneRepair();
        ManageCustomer manage_c = new ManageCustomer();

        phone_r.start();
        manage_c.start();
    }
}