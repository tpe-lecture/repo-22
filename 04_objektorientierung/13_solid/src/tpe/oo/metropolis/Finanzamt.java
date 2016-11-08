package tpe.oo.metropolis;


public class Finanzamt {
    private Finanzamt(){
    }

    public static final Finanzamt Instance = new Finanzamt();
    public static Finanzamt createFA() {
            return Instance;
    }

    Steuerpflichtig[] Steuer = new Steuerpflichtig[100];
    int pflichtige=0;
    public int steuernausgeben() {
        int Est=0;
        for(int i = 0; i<pflichtige; i++){
            Est += Steuer[i].zahleSteuern();
        }
        return Est;
    }


    public int addZahler(Steuerpflichtig neuerZahler) {
        if(pflichtige<=100){
            Steuer[pflichtige]= neuerZahler;
            pflichtige++;
            return pflichtige;
         }else{
            System.out.println("Steuer voll");
            return -1;
         }
     }

    public int calcSteuern(Steuerpflichtig zahler){
        return zahler.zahleSteuern();
    }

 }


