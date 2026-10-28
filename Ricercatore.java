import java.util.*;

public class Ricercatore {
    String nome;
    String cognome;
    List<Integer> codprog;
    List<Double> impor;
    public Ricercatore(String nome,String cognome,List<Integer> codprog,List<Double> impor){
        this.nome=nome;
        this.cognome=cognome;
        this.codprog=codprog;
        this.impor=impor;
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public int getCodProg(){
        int i = impor.indexOf(Collections.max(impor));
        return (codprog.get(i));
    }

    public double getImpor(){

        return (Collections.max(impor));
    }


    
    public String toString() {
        //impegno orario totale___________________
        double oretot=0;
        
        for (double otemp : impor) {
            oretot = oretot+otemp;
        }
        //________________________________________
        //_______matrice progetto/ore_____________
        int hhh= codprog.size();
        
        double[][] progore;

        progore = new double[hhh][2];

        for (int i = 0; i < codprog.size(); i++) {
            progore[i][0]=codprog.get(i);
            progore[i][1]=impor.get(i);
        }
        //________________________________________

        return String.format("|%10s|%10s|%5.2f|%3d|%s",nome,cognome,oretot,hhh,Arrays.deepToString(progore));

        
    }
}
