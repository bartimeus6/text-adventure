import java.util.*;
public class game{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String cmd = scan.nextLine();
            switch (cmd) {
		case "new character":
		    player plyr = new player();
		    plyr.create();
                default:
                    System.out.println("System: Unknown command!");
            }
        }
    }
}
