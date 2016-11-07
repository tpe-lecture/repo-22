package tpe.oo.metropolis;

public class Finanzamt {
    public int steuernausgeben(){
        return EST() + GewSt() + KST();
    }

    Streuerpflichtig[] est = new Streuerpflichtig[100];
    Streuerpflichtig[] gewSt = new Streuerpflichtig[100];
    Streuerpflichtig[] kst = new Streuerpflichtig[100];
    int estMit = 0;
    int gewMit = 0;
    int kstMit = 0;


    private int GewSt() {
        int gewst=0;
        for(int i = 0; i<gewMit; i++){
            gewst += gewSt[i].zahleSteuern();
        }
        return gewst;
    }

    private int EST() {
        int est=0;
        for(int i = 0; i<estMit; i++){
            est += gewSt[i].zahleSteuern();
        }
        return est;
    }

    private int KST() {
        int kst=0;
        for(int i = 0; i<kstMit; i++){
            kst += gewSt[i].zahleSteuern();
        }
        return kst;
    }
    public void addZahler(Streuerpflichtig neuerZahler, int Steuerart) {
        switch (Steuerart){
        case 1: {
                    if(estMit<=100){
                         this.est[estMit]= neuerZahler;
                         this.estMit++;
                         System.out.println(estMit + " Zahler");
                     }else{
                         System.out.println("estMit voll");
                     }
                }

        case 2: {
                    if(gewMit<=100){
                         this.gewSt[gewMit]= neuerZahler;
                         this.gewMit++;
                     }else{
                         System.out.println("gewMit voll");
                     }
                 }
        case 3: {
                    if(kstMit<=100){
                        this.kst[kstMit]= neuerZahler;
                        this.kstMit++;
                     }else{
                        System.out.println("kstMit voll");
                     }
                 }
        }

    }
}
