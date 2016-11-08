package tpe.oo.metropolis;

import java.lang.reflect.Array;

public class Syndikat extends Gruppe{
    Schurke[] mitglieder;
    int mitglnr = 0;
    int einkommen = 0;
    int steuernr = -1;
    Finanzamt fa = null;

    Syndikat(String name, Schurke ... Mitglieder) {
        super(name, calcEinkommen(Mitglieder));
        mitglnr=Mitglieder.length;
        mitglieder = new Schurke[mitglnr];
        System.arraycopy(Mitglieder, 0, mitglieder, 0, mitglieder.length);
        fa = Finanzamt.createFA();
        this. steuernr = fa.addZahler((Steuerpflichtig) this);
    }


    private static int calcEinkommen(Schurke[] Mitglieder) {
        int add = 0;
        for(int i=0; i < Mitglieder.length; i++){
            add += Mitglieder[i].getEinkommen();
        }
        return add;
    }


    public void getMitglieder() {
        System.out.print("Mitglieder von " + getName() + ": ");
        for(int i=0; i < mitglieder.length; i++){
            System.out.print(mitglieder[i].getName()+ ", ");
        }
        System.out.println("");
    }

    public void addMitglied(Schurke neuerBoesewicht) {

        Object newArray = Array.newInstance(mitglieder.getClass().getComponentType(), Array.getLength(mitglieder)+1); // +2
        System.arraycopy(mitglieder, 0, newArray, 0, mitglieder.length);
        mitglieder = (Schurke[]) newArray;
        mitglieder[mitglnr] = neuerBoesewicht;
        ++mitglnr;
        this.einkommen += neuerBoesewicht.getEinkommen();
     }

    public int getEinkommen() {
        this.einkommen = calcEinkommen(mitglieder);
        return einkommen;
    }



    @Override
    public int zahleSteuern() {
        return Steuerberater.Betrag(this);
    }
}
