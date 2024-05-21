import java.sql.SQLOutput;

public class Switch {
    public static void main(String args[]){
        String grade="D";
        switch (grade){
            case"A+": case"A": case"A-":
                System.out.println("Great Student");
                break;
            case "B+": case "B": case "B-":
                System.out.println("Good student");
                break;
            case"C+": case"C": case"C-":
                System.out.println("Ok Student");
                break;
            case"D+": case"D": case"D-":
                System.out.println("Poor Student");
                break;
            case "F":
                System.out.println("Failed");
                break;
            default:
                System.out.println("Wrong Grade");
                break;
        }
    }
}
