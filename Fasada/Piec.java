/**
 * Created by Sylwik on 30.04.2017.
 */
public class Piec {

    public Piec()
    {
        System.out.println("Wkładam do pieca");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
