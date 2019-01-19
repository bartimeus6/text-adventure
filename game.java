import tools.*;
import entities.*;
public class game{
    public static void main(String[] args) {
	tools.tool t = new tool();
	player plyr = new player();
	System.out.println("System: Hello dear player, and welcome to text-adveture!\n        To start playing just type a command! \n        (type help for a list of commands)");
        while (true) {
            String cmd = t.nextLine();
            switch (cmd) {
		case "new character":
		    plyr.create();
		    break;
		case "stats":
		    plyr.stats();
		    break;
		case "quit":
		    System.out.println("System: See you later!");
		    System.exit(0);
		case "help":
			System.out.println("System: Available commands are:");
			System.out.println("        \'new character\'; \'stats\'; \'quit\'");
			break;
                default:
                    System.out.println("System: Unknown command!");
            }
        }
    }
}
