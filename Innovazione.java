public class Innovazione extends Progetto {
    int aziende;
    double imptot;
    public Innovazione(int codice,String titolo,String tipo,String nomeco,String orgco,
        int aziende,double imptot)
    {
        super(codice, titolo ,tipo, nomeco, orgco);
        this.aziende=aziende;
        this.imptot=imptot;
    }
    public String toString() {
        return (String.format("%s |  -  |  -  | %3d | %,.0f " ,super.toString(),aziende,imptot));
    }
}
