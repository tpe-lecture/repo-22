package tpe.oo.metropolis;

public class Schurke extends Mutant implements Steuerpflichtig{
    final Superkraft Schwaeche;

    Schurke(String name, String Mutation, int Einkommen, Superkraft Schwaeche) {
        super(name, Mutation, Einkommen);
        this.Schwaeche=Schwaeche;
        Finanzamt fa = Finanzamt.createFA();
        fa.addZahler((Steuerpflichtig) this);
       }

    public Superkraft getSchwaeche() {
        return Schwaeche;
    }

    @Override
    public int zahleSteuern() {
        return Steuerberater.Betrag(this);
    }

    @Override
    void kaempfe(Superkraft ...superkrafts) {
        if(gewinnt(superkrafts)){
            System.out.println(getName() + " gewinnt! Schwäche nicht erkannt.");
        } else {
            System.out.println("Gegener gewinnt! Schwäche erkannt.");
        }
    }

    boolean gewinnt(Superkraft ...superkrafts) {
        for(int i = 0; i < superkrafts.length; i++){
            if (superkrafts[i].equals(Schwaeche)){
                return false;
            }
        }
        return true;
    }

    public void kaempfe(Superheld held) {
            kaempfe(held.getSuperkraefte());
    }

}
