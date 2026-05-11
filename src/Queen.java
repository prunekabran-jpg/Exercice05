class Queen extends Piece {
    @Override
    boolean isValidMove(Position newPosition) {
        // Déplacement comme une tour
        if (newPosition.column == this.column || newPosition.row == this.row) {
            return true;
        }
        // Déplacement comme un fou
        else if (Math.abs(newPosition.column - this.column) ==
                Math.abs(newPosition.row - this.row)) {
            return true;
        }
        else {
            return false;
        }
    }
}
