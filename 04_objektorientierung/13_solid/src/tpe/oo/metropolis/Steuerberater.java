package tpe.oo.metropolis;

public class Steuerberater {

    public static int Betrag(Steuerpflichtig sp){
        if (sp instanceof Gruppe ){
            if (sp instanceof Personengesellschaft){
                int perSteu = ((Personengesellschaft) sp).getEinkommen()/ 100 * 15;
                if (perSteu > 800){
                    return perSteu - 800;
                }
                    return 0;
            }else{
            return ((Gruppe) sp).getEinkommen()/ 100 * 15;
            }
        }else if(sp instanceof Buerger || sp instanceof Schurke){
            return EKS(((Einwohner) sp).getEinkommen());
        }else {
            return 0;
        }
    }

    public static int EKS(int einkommen){
            int rest = einkommen;
            int abgaben = 0;
            if (rest > 20000) {
                if (rest > 60000) {
                    if (rest > 120000) {
                        abgaben += (rest - 120000) / 100 * 40;
                        rest = 120000;
                    }
                    abgaben += (rest - 60000) / 100 * 25;
                    rest = 60000;
                }
                abgaben += (rest - 20000) / 100 * 15;
                abgaben += 1600;
            } else {
                abgaben = rest / 100 * 8;
            }
            return abgaben;
    }
    public int Steuer(int einkommen){
        return einkommen / 100 * 15;
    }
}
