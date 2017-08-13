/**
 * Created by Sylwik on 30.04.2017.
 */
public class Mieso {

    public Mieso()
    {
        System.out.println("Kroję mięso i podsmażam");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
