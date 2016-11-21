package tpe.oo.metropolis;
/**
 * Mutant der in Metropolis wohnt.
 *
 */
public abstract class Mutant extends Einwohner {
    private String mutation;

    /**
     *
     * @param name Name
     * @param mutation Mutation
     */
    Mutant(String name, String mutation) {
        this(name, mutation, 0);
        this.setMutation(mutation);
    }
    /**
     *
     * @param name Name
     * @param mutation Mutation
     * @param einkommen Einkommen
     */
    Mutant(String name, String mutation, int einkommen) {
        super(name, einkommen);
        this.setMutation(mutation);
    }

    /**
     * Gibt die Mutation zurück.
     * @return Mutation
     */
    public String getMutation() {
        return mutation;
    }


    /**
     * Setzt die Mutation.
     * @param mutation Mutation
     */
    private void setMutation(String mutation) {
        this.mutation = mutation;
    }

    /**
     * Mutant kämpft gegen anderen Mutant.
     * @param superkrafts Superkräfte des anderen Mutants
     */
    abstract void kaempfe(Superkraft ...superkrafts);
}