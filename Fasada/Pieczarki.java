/**
 * Created by Sylwik on 30.04.2017.
 */
public class Pieczarki {
    public Pieczarki()
    {
        System.out.println("Kroję i smażę pieczarki");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
