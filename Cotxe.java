public class Cotxe implements Vehicle {

    private int velocitatActual = 0;

    @Override
    public int getVelocitatActual(){
        return velocitatActual;
    }

    @Override
    public String moute(int velocitat) {
        this.velocitatActual = velocitat;
        return "M'estic movent a quatre rodes a " + Integer.toString(velocitat) + " Km/h";
    }

    @Override
    public String aturat() {
        this.velocitatActual = 0;
        return "Estic aturat i estable sobre les meves quatre rodes.";
    }
    
}
