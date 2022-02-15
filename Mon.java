public class Mon {
    public static void main(String[] args){
        /*
        Vertebrat gatRenat = new Vertebrat("Renat");
        EsserViu fillDelGatRenat;
        System.out.println(gatRenat);
        gatRenat.creix();
        fillDelGatRenat = gatRenat.reprodueix();
        fillDelGatRenat.creix();
        gatRenat.mor();
        */

        Vehicle moto = new Moto();
        Vehicle cotxe = new Cotxe();

        System.out.println(moto.moute(20));
        System.out.println(cotxe.moute(30));

        System.out.println(moto.aturat());
        System.out.println(cotxe.aturat());
        
    }
}
