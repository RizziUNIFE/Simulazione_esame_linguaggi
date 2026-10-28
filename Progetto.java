public class Progetto {
    int codice;
    String tipo;
    String nomeco;
    String orgco;
    String titolo; 
    public Progetto(int codice,String titolo,String tipo,String nomeco,String orgco){
        this.titolo=titolo;
        this.codice=codice;
        this.tipo=tipo;
        this.nomeco=nomeco;
        this.orgco=orgco;
    }
    public String getTitolo(){
        return titolo;
    }
    public String toString() {
        return String.format("|%-12s | %40s | %1d | %20s | %25s",tipo,titolo,codice,nomeco,orgco);
    }
}