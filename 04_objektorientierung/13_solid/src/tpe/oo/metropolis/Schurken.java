package tpe.oo.metropolis;

public class Schurken extends Mutant implements Streuerpflichtig{

    Schurken(String name, String Mutation, int Einkommen) {
        super(name, Mutation);
       }
    public int zahleSteuern(){
        return (getEinkommen()/100)*8;
    }

    @Override
    void kaempfe() {
    }


}
