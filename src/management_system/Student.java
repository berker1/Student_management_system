
package Inf102_170501002;


public class Student extends Person  {
    private String fach;
    private String matrikel;
    
        
    
    public Student(String matrikel, String name, String nachname, String age, String geschlecht, String email,  String telNummer,
            String geburtsDatum, String fach, String adresse) {
        this.setMatrikel(matrikel);
        super.setName(name);
        super.setNachname(nachname);
        super.setAge(age);
        super.setGeschlecht(geschlecht);
        super.setEmail(email);
        super.setTelNummer(telNummer);
        super.setDatum(geburtsDatum);
        super.setFach(fach);
        super.setAdresse(adresse);
    }
    public static boolean kontrol(String nummer) {
        int b = 0;
        boolean c = true;
        if (nummer.length() == 7 && nummer.charAt(0) != '0') {
            for (int i = 0; i < 7; i++) {
                if (Character.isDigit(nummer.charAt(i))) {
                    b++;
                }
            }
        }
        if (b != 7) c = false;

        return c;
    }
    
   
     public String getMatrikel() {
        return matrikel;
    }

    public void setMatrikel(String nummer) {
        this.matrikel = nummer;
    }
     public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }   
 
            
}
