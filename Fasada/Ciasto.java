/**
 * Created by Sylwik on 30.04.2017.
 */



public class Ciasto {

    public Ciasto() {
        System.out.println("Robię spód pizzy");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
