package main.max.tasks.level1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFirstTest {

    @Test
    public void getCountUniqueSymbols() {
        int[] example = new int[] {1,4,5,1,1,3};
        assertEquals(4, TaskFirst.getCountUniqueSymbols(example));
    }
}