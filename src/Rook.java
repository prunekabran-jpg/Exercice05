class Rook extends Piece {
    Rook(int row, int column) {
        super(row, column);
    }

    @Override
    boolean isValidMove(Position newPosition) {
        return newPosition.column == this.column || newPosition.row == this.row;
    }
}

