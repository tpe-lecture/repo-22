package tpe.oo.metropolis;

public class Richter extends Menschen {
    private boolean korrupt = false;

    Richter(String name, int einkommen, boolean korrupt) {
        super(name, einkommen);
        setKorrupt(korrupt);
    }

    public boolean isKorrupt() {
        return korrupt;
    }

    public void setKorrupt(boolean korrupt) {
        this.korrupt = korrupt;
    }

    public void verurteilen(Schurke boesewicht){
        if (schuldig()){
            System.out.println(boesewicht.getName()+" ist schuldig!");
        }else{
            System.out.println(boesewicht.getName()+" ist nicht schuldig!");
        }
    }

    private boolean schuldig(){
        return korrupt;
    }
}
