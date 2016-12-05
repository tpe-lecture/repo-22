package tpe.oo.metropolis;
/**
 * Metropolis ist eine Stadt mit Superhelden, Schurken,
 *  normalen Bürgern und Richtern.
 *
 */
public class Metropolis {
    /**
     * main.
     * @param args nüscht
     */
    public static void main(String[] args) {

        Finanzamt fm = Finanzamt.createFA();
        Einwohner[] einarr = new Einwohner[10];

        int temp = 0;
        einarr[temp++] = new Buerger("Max Mustermann", 100000);

        System.out.println("Max ändert Einkommen von 100000 auf 140000:");
        System.out.println(einarr[0].getName() + " zahlt "
                + fm.calcSteuern((Steuerpflichtig) einarr[0]));
        einarr[0].setEinkommen(140000);
        System.out.println(einarr[0].getName() + " zahlt "
                + fm.calcSteuern((Steuerpflichtig) einarr[0]));

        System.out.println("\n" + fm.steuernausgeben()
            + "$ Steuern eingesammelt" + "\n");

        System.out.println("neue Bürger sind zugezogen!");
        einarr[temp++] = new Buerger("Maximiliane Mustermann", 243874);
        einarr[temp++] = new Buerger("Hansi ", 476477);
        System.out.println(fm.steuernausgeben()
                + "$ Steuern eingesammelt" + "\n");

        Schurke magneto = new Schurke("Magneto",
                "Metal manipulation", 10000, new Superkraft("Plastik"));



        Schurke mystique = new Schurke("Mystique",
                "Gestaltwandlung", 1000000, new Superkraft("böse schauen"));
        Syndikat s = new Syndikat("Die Fantanstischen 5", magneto, mystique);
        s.getMitglieder();
        System.out.println(s.getName() + " zahlt "
                + fm.calcSteuern(s) + " von: " + s.getEinkommen());

        System.out.println("\n" + fm.steuernausgeben()
            + "$ Steuern eingesammelt" + "\n");

        s.addMitglied(new Schurke("Logan", "Adamantium Skelet",
                300000, new Superkraft("Metal manipulation")));
        s.getMitglieder();
        System.out.println(s.getName() + " zahlt "
                + fm.calcSteuern(s) + " von: " + s.getEinkommen());

        System.out.println("\n" + fm.steuernausgeben()
            + "$ Steuern eingesammelt" + "\n");


        Personengesellschaft pers = new Personengesellschaft("Test", 5,
                einarr[2]);
        System.out.println("neues Unternehmen" + pers.getName());
        pers.addMitglied(einarr[1]);
        pers.getMitglieder();
        System.out.println(pers.getName() + " Einkommen: "
                + pers.getEinkommen());
        System.out.println("Steuern: " + fm.calcSteuern(pers));
        pers.setEinkommen(5400);
        System.out.println(pers.getName() + " Einkommen: "
                + pers.getEinkommen());
        System.out.println("Steuern: " + fm.calcSteuern(pers));
        pers.setEinkommen(1000000);
        System.out.println(pers.getName() + " Einkommen: "
                + pers.getEinkommen());
        System.out.println("Steuern: " + fm.calcSteuern(pers));

        System.out.println("\n" + fm.steuernausgeben()
            + "$ Steuern eingesammelt" + "\n");

        System.out.println("neue Kapitalges. mit gleichem Einkommen");
        Kapitalgesellschaft kap = new Kapitalgesellschaft("AG", pers.getEinkommen(), einarr[2]);
        kap.getMitglieder();
        fm.calcSteuern(kap);
        System.out.println("Steuern der Personengesellschaft: " + fm.calcSteuern(pers));
        System.out.println("Steuern der Kapitalgesellschaft: " + fm.calcSteuern(kap));

        Superheld profX = new Superheld("Proffessor X", "Mensch",
                new Superkraft("Gedankenkontrolle"),
                new Superkraft("die Zeit anhalten"),
                new Superkraft("böse schauen"));

        System.out.println("Magneto kämpft gegen 2 Superhelden");
        magneto.kaempfe(new Superkraft("Schwert"));
        magneto.kaempfe(profX);
        System.out.println("");

        System.out.println("Mystique kämpft gegen 2 Superhelden");
        mystique.kaempfe(new Superkraft("Schwert"));
        mystique.kaempfe(profX);
        System.out.println("");

        System.out.println(profX.superkraefte());

        Richter hold = new Richter("Alexander Hold", 5, true);
        hold.verurteilen(magneto);
        Richter salesch = new Richter("Barbara Salesch", 100, false);
        salesch.verurteilen(magneto);
        salesch.setKorrupt(true);
        salesch.verurteilen(magneto);
    }
}
