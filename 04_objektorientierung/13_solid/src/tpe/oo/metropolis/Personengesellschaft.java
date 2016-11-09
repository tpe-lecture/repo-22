package tpe.oo.metropolis;

public class Personengesellschaft extends Unternehmen implements Steuerpflichtig{
    int einkommen;
    Personengesellschaft(String name,int einkommen, Einwohner ... Mitglieder) {
        super(name, einkommen, Mitglieder);
    }

    @Override
    public int zahleSteuern() {
        return Steuerberater.Betrag(this);
    }

    public void getMitglieder() {
        System.out.print("Mitglieder von " + getName() + ": ");
        if (mitglnr >=1){
        for(int i=0; i < mitglnr; i++){
            System.out.print(mitglieder[i].getName()+ ", ");
        }
        }else{
            System.out.println("noch keine Mitglieder");
        }
        System.out.println("");
    }

}
