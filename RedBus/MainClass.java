


import java.util.Scanner;

public class MainClass {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     
        RedBus redBus = new RedBus(40);

        redBus.Booking(22, "Vikas");
        redBus.Display();
        redBus.Find("Vikas");
        redBus.cancelTheTicket("Abc");
    }
}

