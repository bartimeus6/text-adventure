public class game{
    public static void main(String[] args) {
	tool t = new tool();
	player plyr = new player();
	System.out.println("System: Hello dear player, and welcome to text-adveture!\n        To start playing just type a command!");
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
		    System.exit(0);
                default:
                    System.out.println("System: Unknown command!");
            }
        }
    }
}
