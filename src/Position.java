public class Position {
    byte x, y;

    public boolean isEqual(byte x, byte y) {
        return this.x == x && this.y == y;
    }

    public boolean sameX(byte x, byte y) {
        return this.x == x;
    }

    public boolean sameY(byte x, byte y) {
        return this.y == y;
    }

    public boolean sameDiagonal(byte x, byte y) {
        return Math.abs(this.x - x) == Math.abs(this.y - y);
    }

    public boolean isEqualPos(Position pos) {
        return this.x == pos.x && this.y == pos.y;
    }

    public Position(byte x, byte y) {
        this.x = x;
        this.y = y;
    }
}
