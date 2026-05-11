class Piece {
    int row;
    int column;

    // Constructeur par défaut
    Piece() {
        this.row = 0;
        this.column = 0;
    }

    // Constructeur avec paramètres
    Piece(int row, int column) {
        this.row = row;
        this.column = column;
    }

    boolean isValidMove(Position newPosition) {
        return false; // par défaut
    }
}


