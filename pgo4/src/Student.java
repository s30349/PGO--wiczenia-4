import java.util.ArrayList;

public class Student {
    public String imie;
    public String nazwisko;
    public int indexNumber;
    public String email;
    public String adres;

    public StudentGroup groups;

    public ArrayList<Double>oceny;
    public double calculateAvarage(){
        double avg=0;
        for(int i=0; i<oceny.size();i++){
            avg+=oceny.get(i);
        }
        avg/=oceny.size();

        if (oceny.isEmpty()){
            throw new IllegalArgumentException("Student nie ma zadnej oceny");

        }return avg;
    }
}



