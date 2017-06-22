import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        University myUni = new University(50, "University of London", "UK");

        ArrayList<University>  uniArrayList = new ArrayList<University>();
        uniArrayList.add(myUni);

        for (University uni : uniArrayList){
            System.out.println(uni);
        }
    }
}