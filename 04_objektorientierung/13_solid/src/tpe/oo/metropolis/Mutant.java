package tpe.oo.metropolis;

public abstract class Mutant extends Einwohner {
    private String mutation;

    Mutant(String name, String mutation){
        super(name);
        this.setMutation(mutation);
    }
    Mutant(String name, String mutation, int einkommen){
        super(name, einkommen);
        this.setMutation(mutation);
    }


    public String getMutation() {
        return mutation;
    }
    private void setMutation(String mutation) {
        this.mutation = mutation;
    }
    abstract void kaempfe(Superkraft ...superkrafts);
}