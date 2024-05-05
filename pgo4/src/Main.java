import java.sql.Array;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StudentGroup sg=new StudentGroup();
        sg.nazwa="12c";


        Student st=new Student();
        st.imie="Stefan";
        st.nazwisko="Legionowy";
        st.indexNumber="s28692";
        st.email="stefan.l@gmail.com";
        st.oceny= new ArrayList<>();
        st.oceny.add(4.5);
        st.oceny.add(3.5);
        st.oceny.add(4.0);
        double srednia= st.calculateAvarage();

        Student st2=new Student();
        st2.imie="Kacper";
        st2.nazwisko="Nadarzyn";
        st2.indexNumber="s30301";
        st2.email="kacper.n@gmail.com";
        st2.oceny= new ArrayList<>();
        st2.oceny.add(4.0);
        st2.oceny.add(5.0);
        st2.oceny.add(4.0);
        double srednia2= st2.calculateAvarage();

        Student st3=new Student();
        st3.imie="Tomasz";
        st3.nazwisko="Zelechow";
        st3.indexNumber="s31777";
        st3.email="tomasz.z@gmail.com";
        st3.oceny= new ArrayList<>();
        st3.oceny.add(5.0);
        st3.oceny.add(5.0);
        st3.oceny.add(5.0);
        double srednia3=st3.calculateAvarage();

        try {
            sg.addStudent(st);
            sg.addStudent(st2);
            sg.addStudent(st3);

            sg.addStudent(st);
        }
        catch (IllegalStateException blad){
            System.out.println(blad.getMessage());
        }



    }
}