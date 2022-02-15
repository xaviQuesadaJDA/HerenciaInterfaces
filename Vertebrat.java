public class Vertebrat extends Animal{
    private Os[] ossos;
    private String name;

    public Vertebrat(){
        this.ossos = new Os[] {new Os("Húmer"), new Os("Fèmur"), new Os("Radi")};
    }

    public Vertebrat(String name){
        this();
        this.name = name;
    }

    @Override 
    public String toString(){
        StringBuilder resultat = new StringBuilder();
        resultat.append("Em dic " + this.name + " i aquests són els meus ossos:");
        resultat.append(System.lineSeparator());
        for (int i = 0; i < this.ossos.length; i++){
            resultat.append(ossos[i].toString());
            resultat.append(System.lineSeparator());
        }
        return super.toString() + System.lineSeparator() + resultat.toString();
    }

}
