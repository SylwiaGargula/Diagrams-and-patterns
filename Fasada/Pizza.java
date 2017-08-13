/**
 * Created by Sylwik on 30.04.2017.
 */
public class Pizza {
    public Pizza()
    {

       przygotujCiasto();
       przygotujSos();
       przygotujPieczarki();
       przygotujMieso();
       przygotujWarzywa();
       przygotujSer();
       przygotujPiec();
        System.out.println("Jem nononononm");


    }

    public void przygotujCiasto() {Ciasto ciasto=new Ciasto();}

    public void przygotujSos()
    {
        Sos sos=new Sos();
    }

    public void przygotujPieczarki()
    {
        Pieczarki pieczarki=new Pieczarki();
    }
     public void przygotujMieso()
     {
         Mieso mieso=new Mieso();
     }

     public void przygotujWarzywa()
     {
         Warzywa warzywa=new Warzywa();
     }

     public void przygotujSer()
     {
         Ser ser=new Ser();
     }

    public void przygotujPiec()
     {
         Piec piec=new Piec();
     }
}
