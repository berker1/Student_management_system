

package Inf102_170501002;

import java.util.ArrayList;


public class Universitaet {
    
    private String name;
    
    Universitaet(String name) {  
        this.name = name;
    }
    
     private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Dozent> dozents = new ArrayList<>();
    private ArrayList<LVA> lvas = new ArrayList<>();
    
    public boolean studentExistiert(String input) {
        boolean c = false;         
        for (int j = 0; j < students.size(); j++) {            
            if (input.equals(students.get(j).getMatrikel())) {                       
                c = true;
            }
        }
        return c;
    }
    public boolean dozentExistiert(String input) {
        boolean c = false;
        for (int j = 0; j < dozents.size(); j++) {
            if (input.equals(dozents.get(j).getNummerTC())) {                
                c = true;
            }
        }
        return c;
    }
    
 public boolean lvaExistiert ( String lvaInput){
        boolean c = false;
        for (int j = 0; j < lvas.size(); j++) {
            if (lvaInput.equals(lvas.get(j).getLvCode())) {                
                c = true;                
            }
        }

        return c;
    }
 public int studentSuche(String std){
        int c = -2;
        for(int i = 0; i < students.size(); i++){
            if(std.equals(students.get(i).getMatrikel())){
                c = i;
            }
        }
        return c;
    }
 public int dozentSuche(String doz){
        int c = -2;
        for(int i = 0; i < dozents.size(); i++){
            if(doz.equals(dozents.get(i).getNummerTC())){
                c = i;
                break;
            }
        }
        return c;
    }
 public int lvaSuche(String lvCode){
        int c = -2;
        for(int i = 0; i < lvas.size(); i++){
            if(lvCode.equals(lvas.get(i).getLvCode())){
                c = i;
                break;
            }
        }
        return c;
    }
    public int anmeldenStudent(String nummer, String code){
        if(studentSuche(nummer) != -2 && lvaSuche(code) != -2) {
            boolean xteStudent = getLvas().get(lvaSuche(code)).getLVAstudents().contains(students.get(studentSuche(nummer)));
            if (!xteStudent) {
                lvas.get(lvaSuche(code)).getLVAstudents().add(getStudents().get(studentSuche(nummer)));               
                return 1;
            }
            else {               
                return 0;
            }
        }
        else {
        return -1;
        }
    }
    public int abmeldenStudent(String nummer, String code){
        if(studentSuche(nummer) != -2 && lvaSuche(code) != -2){
            lvas.get(lvaSuche(code)).getLVAstudents().remove(getStudents().get(studentSuche(nummer)));           
            return 1;
        }
        else 
        return 0;
        
    }
    public int abmeldenDozent(String dozentTC, String lvaCode){
        if(dozentSuche(dozentTC) != -2 && lvaSuche(lvaCode) != -2){
            lvas.get(lvaSuche(lvaCode)).getLVAdozent().remove(getDozents().get(dozentSuche(dozentTC)));            
              return 1;
        }
        else
            return 0;
    }
    
    public int lvasVonEinemStudent(String matrikelNummer, int i) {
        int n = -2;
        if (studentSuche(matrikelNummer) == -2) {          
        } else {
            boolean k = true;        
            for (int j = 0; j < lvas.get(i).getLVAstudents().size(); j++) {
                if (getLvas().get(i).getLVAstudents().get(j).getMatrikel().equals(matrikelNummer)) {                   
                    k = false;  
                    n = i;
                }
            }                 
        }
return n;

    }
    public int lvasVonEinemDozent(String dozentTC, int i){
        int n =-2;
        if(dozentSuche(dozentTC) == -2){          
        }
        else {
            boolean k = true;            
                for (int j = 0; j < lvas.get(i).getLVAdozent().size(); j++) {
                    if (getLvas().get(i).getLVAdozent().get(j).getNummerTC().equals(dozentTC)) {                      
                        k = false;
                        n = i;
                    }
                }
            }
        return n;
    }
    
    public int zuweisenDozent(String dozentTC, String lvaCode){
        if(dozentSuche(dozentTC) != -2 && lvaSuche(lvaCode) != -2) {
            boolean xteDozent = getLvas().get(lvaSuche(lvaCode)).getLVAdozent().contains(dozents.get(dozentSuche(dozentTC)));
            if (!xteDozent) {
                lvas.get(lvaSuche(lvaCode)).getLVAdozent().add(getDozents().get(dozentSuche(dozentTC)));               
                return 1;
            }
            else{               
                return 0;
            }
        }
        else {
        return -1;
        }
    }
     public int alleStudentenVonEinemLva(String lvaNum, int i){
        boolean k = true; int n = -2;
        if(lvaSuche(lvaNum) != -2) {            
                boolean stdVarMi = getLvas().get(lvaSuche(lvaNum)).getLVAstudents().contains(students.get(i));
                if (stdVarMi) {
                   n = welcheStudent(students.get(i).getMatrikel());
                    k = false;
                } 
        }            
        return n;
    }

    public int welcheStudent(String matrikelNummer){
        int xteStudent = studentSuche(matrikelNummer);        
        return xteStudent;
    }

    public int  alleDozentenVonEinemLva(String lvaNum, int i) {
        boolean k = true; int n = -2;
        if (lvaSuche(lvaNum) != -2) {            
                boolean dozentVarMi = getLvas().get(lvaSuche(lvaNum)).getLVAdozent().contains(dozents.get(i));
                if (dozentVarMi) {
                    n = welcheDozent(dozents.get(i).getNummerTC());
                    k = false;
                }
        }        
        return n;
    }
    
    public int welcheDozent(String dozentTC){
        int xteDozent = dozentSuche(dozentTC);       
        return xteDozent;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public ArrayList<Dozent> getDozents() {
        return dozents;
    }
    public ArrayList<LVA> getLvas() {
        return lvas;
    }
}
