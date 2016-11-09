package tpe.oo.metropolis;

import java.lang.reflect.Array;

public abstract class Unternehmen extends Gruppe implements Steuerpflichtig{
    static int mitglnr = 0;
    Einwohner[] mitglieder;
    int steuernr = -1;
    Finanzamt fa = null;


    Unternehmen(String name, int einkommen, Einwohner ... Mitglieder){
        super(name, einkommen);
        for (int i = 0; i<Mitglieder.length; i++){
            addMitglied(Mitglieder[i]);
        }
        mitglnr = mitglieder.length;
        this.einkommen=einkommen;
        fa = Finanzamt.createFA();
        this.steuernr = fa.addZahler((Steuerpflichtig) this);
    }

    @Override
    public abstract int zahleSteuern();

    public void addMitglied(Einwohner neuesMitglied) {
        if (!(neuesMitglied == null)){
            if (neuesMitglied instanceof Buerger || neuesMitglied instanceof Superheld){
                if (mitglnr > 0){
                    Object newArray = Array.newInstance(mitglieder.getClass().getComponentType(), Array.getLength(mitglieder)+1);
                    System.arraycopy(mitglieder, 0, newArray, 0, mitglieder.length);
                    mitglieder = (Einwohner[]) newArray;
                    mitglieder[mitglnr] = neuesMitglied;
                    ++mitglnr;
                    System.out.println("neues Mitglied: " + mitglieder[mitglnr-1].getName());
                } else {
                    mitglieder = new Einwohner[1];
                    this.mitglieder[0] = neuesMitglied;
                    mitglnr++;
                    System.out.println("erstes Mitglied: " + mitglieder[mitglnr-1].getName());
                }
            }else{
                System.out.println("Mitglied nicht berechtigt");
            }
        }
     }


}
