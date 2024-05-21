package from0up;

public class baozi {
    public static void main(String args[]) {
        double price = -1;
        int quantity;
        if (price < 0) {
            System.out.println("no");
        } else {
            if (price < 0.5) {
                quantity = 10;
                System.out.println(quantity);
            } else if (price < 1.0) {
                System.out.println("buy 8.");
            } else if (price < 2.0) {
                System.out.println("buy 5.");
            } else if (price < 3.0) {
                System.out.println("buy 3.");
            } else {
                System.out.println("buy 0.");
            }
        }
    }
}