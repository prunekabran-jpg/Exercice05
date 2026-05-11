class Piece {
    int row;
    int column;

    Piece(int row, int column) {
        this.row = row;
        this.column = column;
    }

    boolean isValidMove(Position newPosition) {
        // Par défaut : aucun mouvement valid
        return false;
    }
}

