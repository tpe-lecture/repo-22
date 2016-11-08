package tpe.oo.metropolis;

public abstract class Einwohner {
    private int einkommen;
    private String name;

    Einwohner(String name, int einkommen){
        this(name);
        this.setEinkommen(einkommen);
    }
    Einwohner(String name){
        this.setName(name);
    }
    public int getEinkommen() {
        return einkommen;
    }
    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }
    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
}
