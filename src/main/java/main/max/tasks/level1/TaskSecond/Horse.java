package main.max.tasks.level1.TaskSecond;

public class Horse {
    private final Cell cell;

    public boolean ableToMove(Cell target) {
        int x = Math.abs(cell.getX() - target.getX());
        int y = Math.abs(cell.getY() - target.getY());

        if(target.getX() < 1 || target.getY() < 1){
            return false;
        }
        return (x == 2 && y == 1) || (x == 1 && y == 2);
    }



    public Horse(Cell cell) {
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "Horse {" +
                "x = " + cell.getX() +
                ", y = " + cell.getY() + '}';
    }
}
