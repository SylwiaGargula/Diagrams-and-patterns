/**
 * Created by Sylwik on 30.04.2017.
 */
public class Ser {

    public Ser()
    {System.out.println("Posypuję serem");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
