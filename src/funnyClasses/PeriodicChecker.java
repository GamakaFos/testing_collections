package funnyClasses;

public class PeriodicChecker extends Thread
{
    @Override
    public void run()
    {
        while(true) {
            System.out.println("Thread is doing something");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}