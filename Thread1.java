import java.util.Scanner;

class Thread1 extends Thread {
    String Threadname;
    int time;
    public Thread1(String name, int time){
        this.Threadname=name;
        this.time=time;
    }
	synchronized public void run() 
	{
		try 
		{
			int i=0;
			while (i<5) 
			{
				sleep(this.time);
				System.out.println(this.Threadname);
				i++;
			}
		} 

		catch (Exception e) {
		}
	System.out.println("Exiting Thread ");
	}
}




class Main
{
	public static void main(String args[]) 
	{
		Thread1 t1 = new Thread1("BMS",10000);
	    Thread1 t2 = new Thread1("CSE",5000);
		t1.start();
		t2.start();
	}
}