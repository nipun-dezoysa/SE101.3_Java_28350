public class Main {
    public static void main(String[] args) {
        System.out.println("Regular player");
        Player player = new Player();
        player.down();
        player.up();
        player.up();
        player.right();
        player.right();
        player.left();

        System.out.println("opposite player");
        OPlayer player1 = new OPlayer();
        player1.down();
        player1.up();
        player1.up();
        player1.right();
        player1.right();
        player1.left();

        System.out.println("jump player");
        JPlayer player2 = new JPlayer();
        player2.down();
        player2.up();
        player2.up();
        player2.right();
        player2.right();
        player2.left();
        player2.crouch();
        player2.down();
        player2.up();
        player2.up();
        player2.right();
        player2.right();
        player2.left();
    }
}
