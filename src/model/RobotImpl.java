package model;
import util.Direction;

public class RobotImpl implements Robot{
    private Integer x;
    private Integer y;
    private Direction direction;
    public Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }
    public Integer getY() {
        return y;
    }
    public void setY(Integer y) {
        this.y = y;
    }
    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    @Override
    public void forward() {
        if (this.direction.equals(Direction.N) ){
            y++;
        } else if (this.direction.equals(Direction.S) ){
            y--;
        } else if (this.direction.equals(Direction.W)) {
            x--;
        } else if (this.direction.equals(Direction.E)){
            x++;
        }
    }

    @Override
    public void turnLeft() {
        if (this.direction.equals(Direction.N) ){
           this.direction = Direction.W;
        } else if (this.direction.equals(Direction.S) ){
            this.direction = Direction.E;
        } else if (this.direction.equals(Direction.W)) {
            this.direction = Direction.S;
        } else if (this.direction.equals(Direction.E)){
            this.direction = Direction.N;
        }
    }

    @Override
    public void turnRight() {

        if (this.direction.equals(Direction.N) ){
            this.direction = Direction.E;
        } else if (this.direction.equals(Direction.S) ){
            this.direction = Direction.W;
        } else if (this.direction.equals(Direction.W)) {
            this.direction = Direction.N;
        } else if (this.direction.equals(Direction.E)){
            this.direction = Direction.S;
        }

    }
}
