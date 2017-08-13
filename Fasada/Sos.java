/**
 * Created by Sylwik on 30.04.2017.
 */
public class Sos {
    public Sos()
    {System.out.println("Nakladam sos pomidorowy");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
