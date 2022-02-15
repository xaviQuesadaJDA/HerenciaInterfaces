public class Animal extends EsserViu{
    private Organ[] organs;

    public void mou(){
        System.out.println("M'estic movent!");
    }

    @Override
    public String toString(){
        return super.toString() + System.lineSeparator() + "Sóc un animal.";
    }

}
