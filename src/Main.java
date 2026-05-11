public class Main {
    public static void main(String[] args) {
        Queen q = new Queen(1, 1);

        Position p1 = new Position(1, 5); // horizontal
        Position p2 = new Position(4, 4); // diagonal
        Position p3 = new Position(2, 3); // invalide

        System.out.println("Test 1 (horizontal): " + q.isValidMove(p1)); // true
        System.out.println("Test 2 (diagonal): " + q.isValidMove(p2));   // true
        System.out.println("Test 3 (invalide): " + q.isValidMove(p3));   // false
    }
}
