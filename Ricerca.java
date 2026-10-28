public class Ricerca extends Progetto {
    String codarg;
    int partner;
    double imptot;
    public Ricerca(int codice,String titolo,String tipo,String nomeco,String orgco,
        String codarg,int partner,double imptot){
        super(codice,titolo,tipo, nomeco, orgco);
        this.codarg=codarg;
        this.partner=partner;
        this.imptot=imptot;
    }

    public String toString() {
        return (String.format("%s | %3s | %3d |  -  | %,.0f ",super.toString(),codarg,partner,imptot));
    }

}