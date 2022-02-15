public class Moto implements Vehicle {

    private int velocitatActual = 0;

    @Override
    public int getVelocitatActual(){
        return velocitatActual;
    }

    @Override
    public String moute(int velocitat) {
        this.velocitatActual = velocitat;
        return "M'estic movent a dues rodes a " + Integer.toString(velocitat) + " Km/h";
    }

    @Override
    public String aturat() {
        this.velocitatActual = 0;
        return "Estic aturat posa els peus a terra!!!";
    }
     
    public String fesCavallet(){
        return "Aixeco la roda devantera.";
    }
}
