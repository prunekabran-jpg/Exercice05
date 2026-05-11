class Bishop extends Piece {
    Bishop(int row, int column) {
        super(row, column);
    }

    @Override
    boolean isValidMove(Position newPosition) {
        return Math.abs(newPosition.column - this.column) ==
                Math.abs(newPosition.row - this.row);
    }
}
