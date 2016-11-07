package tpe.oo.metropolis;

public abstract class Gruppe implements Streuerpflichtig{
    String name;
    int einkommen;
    Gruppe(String name, int einkommen){
        this.einkommen=einkommen;
        setName(name);
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
    abstract public int zahleSteuern();
}
