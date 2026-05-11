class Queen extends Piece {
    Queen(int row, int column) {
        super(row, column);
    }

    @Override
    boolean isValidMove(Position newPosition) {
        if (newPosition.column == this.column || newPosition.row == this.row) {
            return true; // comme une tour
        } else if (Math.abs(newPosition.column - this.column) ==
                Math.abs(newPosition.row - this.row)) {
            return true; // comme un fou
        } else {
            return false;
        }
    }
}

