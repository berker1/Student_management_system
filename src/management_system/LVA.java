
package Inf102_170501002;

import java.util.ArrayList;


public class LVA {
    private String lvName = " ";
    private String lvKredit = " ";
    private String lvCode = " ";

    private ArrayList<Student> LVAstudents = new ArrayList<>();
    private ArrayList<Dozent> LVAdozent = new ArrayList<>();



    public LVA (String lvName, String lvCode, String lvKredit){
        this.setLvName(lvName);
        this.setLvKredit(lvKredit);
        this.setLvCode(lvCode);

    }


   public static boolean kontrolCode( String inputLvaCode){
       int b = 0;
       if (inputLvaCode.length() == 6 ) {
           for (int i = 0; i < 6; i++) {
               if ((i < 3) && ((inputLvaCode.charAt(i) >= 65) && (inputLvaCode.charAt(i) <= 90))) {
                   b++;
               }
               if (i >= 3 && Character.isDigit(inputLvaCode.charAt(i))) {
                   b++;
               }
           }
       }
       if (b == 6) {
           return true;
       } else {
           return false;
       }

   }

    @Override
    public boolean equals(Object input2) {
        if (input2.equals(this.getLvCode())) {
            return true;
        } else return false;

    }


    @Override
    public String toString() {
        return "-Code von LVA : " + getLvCode() + " -name von LVA : " + getLvName() + " -Kredit von LVA :" + getLvKredit();
    }


    public String getLvName() {
        return lvName;
    }
    public void setLvName(String lvName) {
        this.lvName = lvName;
    }


    public String getLvKredit() {
        return lvKredit;
    }
    public void setLvKredit(String lvKredit) {
        this.lvKredit = lvKredit;
    }


    public String getLvCode() {
        return lvCode;
    }

    public void setLvCode(String lvCode) {
        this.lvCode = lvCode;
    }

    public ArrayList<Student> getLVAstudents() {
        return LVAstudents;
    }
    public void setLVAstudents(ArrayList<Student> LVAstudents) {
        this.LVAstudents = LVAstudents;
    }


    public ArrayList<Dozent> getLVAdozent() {
        return LVAdozent;
    }
    public void setLVAdozent(ArrayList<Dozent> LVAdozent) {
        this.LVAdozent = LVAdozent;
    }
}
