
package Inf102_170501002;


public class Dozent extends Person  {

    private String nummerTC = " ";
    private String zimmerNummer = " ";


Dozent(String TC, String name, String nachname){
    this.setNummerTC(TC);
    super.setName(name);
    super.setNachname(nachname);
}

Dozent (String name, String nachname, String TC, String age,String gender,String geburtsdatum, String mail,String zimmer, String adresse, String telNo){
    
        setNummerTC(TC);
        super.setName(name);
        super.setNachname(nachname);
        super.setAge(age);
        super.setGeschlecht(gender);
        super.setDatum(geburtsdatum);
        super.setEmail(mail);
        setZimmerNummer(zimmer);
        super.setAdresse(adresse);
        super.setTelNummer(telNo);        
        
}
    @Override
    public boolean equals(Object input2) {
        if (input2.equals(this.getNummerTC())) {
            return true;
        } else return false;

    }

    @Override
    public String toString() {
        return "-TC Nummer von Dozent/in : " + getNummerTC() + " -Name von Dozent : " + getName() +
           " -Nacname von Dozent/in : " + getNachname().toUpperCase() ;
    }


    public static boolean kontrolTC ( String TC){
        int b = 0;
        boolean c = true;
        if (TC.length() == 11) {
            for (int i = 0; i < 11; i++) {
                if (Character.isDigit(TC.charAt(i))) {
                    b++;
                }
            }
        }
        if (b != 11) c = false;

        return c;
    }



    public String getNummerTC() {
        return nummerTC;
    }
    public void setNummerTC(String nummerTC) {
        this.nummerTC = nummerTC;
    }


    public String getZimmerNummer() {
        return zimmerNummer;
    }
    public void setZimmerNummer(String zimmerNummer) {
        this.zimmerNummer = zimmerNummer;
    }

}
