public class Player {
    private static String name;

    public Player(String inName) {
        name = inName;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Player.name = name;
    }
}
