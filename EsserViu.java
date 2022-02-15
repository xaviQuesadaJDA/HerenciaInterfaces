import java.text.SimpleDateFormat;
import java.util.Date;

public class EsserViu{
    private Date naixement;
    private float massa;

    public EsserViu(){
        neix();
    }

    public float getMassa(){
        return this.massa;
    }

    public void setMassa(float kg){
        this.massa = kg;
    }

    public void neix(){
        System.out.println("He nascut!");
        this.naixement = new Date();
    }

    public void creix(){
        System.out.println("He crescut!");
    }

    public EsserViu reprodueix(){
        System.out.println("Em reprodueixo!");
        return new EsserViu();
    }

    public void mor(){
        System.out.println("Adeu món cruel!");
    }

    @Override
    public String toString(){
        StringBuilder resultat = new StringBuilder();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        resultat.append("Sóc un ésser viu i vaig nèixer el ");
        resultat.append(formatter.format(naixement));
        return resultat.toString();
    }
}