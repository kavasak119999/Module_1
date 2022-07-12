package main.max.tasks.level1.TaskSecond;

public class TaskSecond {

    public static void main(String[] args) {
        Cell cell = new Cell(1, 7);
        Cell target = new Cell(2, 9);
        Horse horse = new Horse(cell);

        if(ableToMoveHorse(horse, target)){
            System.out.println("Horse can be moved");
        } else{
            System.out.println("Horse cannot be moved");
        }
    }

    public static boolean ableToMoveHorse(Horse horse, Cell target){
        return horse.ableToMove(target);
    }
}
