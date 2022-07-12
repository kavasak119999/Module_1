package main.max.tasks.level1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskThirdTest {

    @Test
    public void getSquare() {
        int A = 5, B = 4, C = 8;
        assertEquals(8, TaskThird.getSquare(A,B,C));
    }
}