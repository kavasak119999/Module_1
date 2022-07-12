package main.max.tasks.level1.TaskSecond;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskSecondTest {

    @Test
    public void ableToMoveHorse() {
        Cell cell = new Cell(1, 7);
        Cell target = new Cell(2, 9);
        Horse horse = new Horse(cell);

        assertTrue(TaskSecond.ableToMoveHorse(horse, target));
    }

    @Test
    public void notAbleToMoveHorse() {
        Cell cell = new Cell(1, 7);
        Cell target = new Cell(5, 9);
        Horse horse = new Horse(cell);

        assertFalse(TaskSecond.ableToMoveHorse(horse, target));
    }
}