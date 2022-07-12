package main.max.tasks.level2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFirstTest {

    @Test
    public void isCorrectlyClosed() {
        assertTrue(TaskFirst.isCorrectly("(hi[(we)lcome])", false));
    }

    @Test
    public void isNotCorrectlyClosed() {
        assertFalse(TaskFirst.isCorrectly("(hi[welcome)]", false));
    }

    @Test
    public void closingBrackets(){
        assertTrue(TaskFirst.isCorrectly("(())", false));
    }

    @Test
    public void notClosingBrackets(){
        assertFalse(TaskFirst.isCorrectly("(()", false));
    }

    @Test
    public void lineWithoutBracketsWorking(){
        assertTrue(TaskFirst.isCorrectly("Hi NIX!", false));
    }






}