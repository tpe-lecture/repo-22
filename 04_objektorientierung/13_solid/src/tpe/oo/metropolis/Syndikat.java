package tpe.oo.metropolis;

public class Syndikat extends Gruppe{
    Schurken[] mitglieder = new Schurken[100];
    int Mitglieder = 0;
    int einkommen = 0;
    Syndikat(String name, int einkommen) {
        super(name, einkommen);
    }


    public Schurken[] getMitglieder() {
        return mitglieder;
    }

    public void addMitglied(Schurken neuerBoesewicht) {
        if(Mitglieder<=100){
        this.mitglieder[Mitglieder]= neuerBoesewicht;
        this.Mitglieder++;
        this.einkommen += neuerBoesewicht.getEinkommen();
        }else{
            System.out.println("voll");
        }
    }



    @Override
    public int zahleSteuern() {
        return 0;
    }


}
