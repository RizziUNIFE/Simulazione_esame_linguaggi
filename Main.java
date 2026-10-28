import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //______________________progetti.txt__________________________________________________
        List<Progetto> prgs = new ArrayList<Progetto>();
        
        int codice,aziende,partner;
        float imptemp;
        double imptot;
        String tipo,titolo,nomeco,orgco,codarg;

        try{
            
            Scanner sc = new Scanner(new FileReader("progetti.txt"));
            sc.useLocale(Locale.US);
            while (sc.hasNext()) {
                codice = sc.nextInt();
                tipo = sc.next();
                sc.nextLine();
                titolo= sc.nextLine();
                nomeco= sc.nextLine();
                orgco= sc.nextLine();
                if (tipo.equals("ricerca")) {
                    codarg = sc.next();
                    partner = sc.nextInt();
                    sc.nextLine();
                    imptemp = sc.nextFloat();
                    imptot = 1.3 *1000;
                    Ricerca r = new Ricerca(codice, titolo ,tipo, nomeco, orgco, codarg, partner, imptot);
                    prgs.add(r);
                }
                else if (tipo.equals("innovazione")) {
                    aziende = sc.nextInt();
                    imptemp = sc.nextFloat();
                    imptot = imptemp *1000;
                    Innovazione i = new Innovazione(codice, titolo ,tipo, nomeco, orgco, aziende, imptot);
                    prgs.add(i);
                }
            }
                for (Progetto p: prgs){
                    System.out.println(p);
                }
            
            sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        //________________________Fine di progetti.txt_______________________________________________________________
        
        System.out.println("\n\n");

        //_________________________inizio progetti.txt___________________________
        List<Ricercatore> rics = new ArrayList<Ricercatore>();
        String nome,cognome,grrp;
        int z;
        double y;
        List<Integer> progetti = new ArrayList<Integer>();
        List<Double> ore = new ArrayList<Double>();
        try{
        
        Scanner sca = new Scanner(new FileReader("ricercatori.txt"));
        while(sca.hasNext()){
            nome = sca.nextLine();
            cognome = sca.nextLine();
            grrp = sca.nextLine();
            while (!(grrp).equals("")){ //sfruttamento della riga vuota nel file ricercatori 
                try{
                Scanner lezi = new Scanner(grrp);
                z = lezi.nextInt();
                y = lezi.nextDouble();
                progetti.add(z);
                ore.add(y);
                grrp = sca.nextLine();
                lezi.close();
                }
                catch (Exception e){
                    break;
                }
            }
            Ricercatore r = new Ricercatore(nome, cognome, progetti, ore);
            rics.add(r);

            progetti = new ArrayList<Integer>();
            ore = new ArrayList<Double>();

            
        }
        sca.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        for (Ricercatore oooo : rics) {
                System.out.println(oooo);
            }
        //_________________________fine progetti.txt___________________________

        System.out.println("\n\n");

        //_________________________inizio lettura da riga di comando___________
            
        if (args.length > 0) {
            for (String val : args){
                for (Ricercatore ric : rics) {
                    if (ric.cognome.equals(val)){
                        String n= ric.getNome();
                        String c = ric.getCognome();
                        double o = ric.getImpor();
                        int cp = ric.getCodProg();
                        for (Progetto prg : prgs) {
                            if (prg.codice==cp){
                                String t = prg.getTitolo();
                                System.out.println(String.format("|%10s|%10s|%5.2f|%40s|",n,c,o,t));
                                
                            }
                            
                            
                        }
                    
                    }
                }
                System.out.println("\n\n");
            }
        } 
        //_________________________fine lettura da riga di comando_____________
    }
}
