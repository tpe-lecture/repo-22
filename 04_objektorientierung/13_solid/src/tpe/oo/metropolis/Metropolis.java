package tpe.oo.metropolis;

public class Metropolis {

    public static void main(String[] args) {
        Finanzamt fm = Finanzamt.createFA();
        Einwohner[] einarr = new Einwohner[10];

        int temp=0;
        einarr[temp++] = new Buerger("Max Mustermann", 100000);

        System.out.println("Max ändert Einkommen von 100000 auf 140000:");
        System.out.println(einarr[0].getName()+ " zahlt " + fm.calcSteuern((Steuerpflichtig) einarr[0]));
        einarr[0].setEinkommen(140000);
        System.out.println(einarr[0].getName()+ " zahlt " + fm.calcSteuern((Steuerpflichtig) einarr[0]));

        System.out.println("\n" + fm.steuernausgeben() + "$ Steuern eingesammelt" + "\n");

        System.out.println("neue Bürger sind zugezogen!");
        einarr[temp++] = new Buerger("Maximiliane Mustermann", 243874);
        einarr[temp++] = new Buerger("Hansi ", 476477);
        System.out.println(fm.steuernausgeben() + "$ Steuern eingesammelt" + "\n");

        Schurke magneto = new Schurke("Magneto","Metal manipulation", 10000, new Superkraft("Plastik"));



        Schurke mystique = new Schurke("Mystique", "Gestaltwandlung", 1000000, new Superkraft("böse schauen"));
        Syndikat s = new Syndikat("Die Fantanstischen 5", magneto, mystique);
        s.getMitglieder();
        System.out.println(s.getName()+ " zahlt " + fm.calcSteuern(s) + " von: " + s.getEinkommen());

        System.out.println("\n" + fm.steuernausgeben() + "$ Steuern eingesammelt" + "\n");

        s.addMitglied(new Schurke("Logan", "Adamantium Skelet", 300000, new Superkraft("Metal manipulation")));
        s.getMitglieder();
        System.out.println(s.getName()+ " zahlt " + fm.calcSteuern(s) + " von: " + s.getEinkommen());

        System.out.println("\n" + fm.steuernausgeben() + "$ Steuern eingesammelt" + "\n");


        Personengesellschaft test = new Personengesellschaft("Test", 5,einarr[2]);
        System.out.println("neues Unternehmen" + test.getName());
        test.addMitglied(einarr[1]);
        test.getMitglieder();
        System.out.println(test.getName() + " Einkommen: " + test.getEinkommen());
        System.out.println("Steuern: " + fm.calcSteuern(test));
        test.setEinkommen(5400);
        System.out.println(test.getName() + " Einkommen: " + test.getEinkommen());
        System.out.println("Steuern: " + fm.calcSteuern(test));
        test.setEinkommen(1000000);
        System.out.println(test.getName() + " Einkommen: " + test.getEinkommen());
        System.out.println("Steuern: " + fm.calcSteuern(test));

        System.out.println("\n" + fm.steuernausgeben() + "$ Steuern eingesammelt" + "\n");

        Superheld ProfX = new Superheld("Proffessor X", "Mensch",
                new Superkraft("böse schauen"), new Superkraft("böse schauen"));

        System.out.println("Magneto kämpft gegen 2 Superhelden");
        magneto.kaempfe(new Superkraft("Schwert"));
        magneto.kaempfe(ProfX);
        System.out.println("");

        System.out.println("Mystique kämpft gegen 2 Superhelden");
        mystique.kaempfe(new Superkraft("Schwert"));
        mystique.kaempfe(ProfX);
        System.out.println("");

        System.out.println(ProfX.superkraefte());

    }
}