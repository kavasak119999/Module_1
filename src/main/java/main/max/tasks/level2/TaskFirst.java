package main.max.tasks.level2;

public class TaskFirst {

    private static final String example1 = "(hi[(we)lcome])";
    private static final String example2 = "(hi[welcome)]";
    private static final char[] chars = new char[]{'(', ')', '{', '}', '[', ']'};
    private static int indexToAdd = 0;
    private static boolean theOne = false;

    public static void main(String[] args) {
        System.out.println(isCorrectly(example1, false)); // true
        System.out.println(isCorrectly(example2, false)); // false
    }

    public static boolean isCorrectly(String text, boolean innerText) {
        boolean isCorrectly = false;
        char[] textChars = text.toCharArray();
        boolean isFound = false;
        int index = 0;

        for (int i = 0; i < textChars.length; i++) {
            indexToAdd = 0;
            if (isFound) {
                if ((textChars[i] == chars[1] || textChars[i] == chars[3] || textChars[i] == chars[5])
                        && textChars[i] != chars[index] && !isCorrectly) {
                    return false;
                }
                if (textChars[i] == chars[index]) {
                    if (theOne) {
                        theOne = false;
                        indexToAdd = i;
                    }
                    isFound = false;
                    if (innerText) {
                        return true;
                    }
                } else {
                    if (textChars[i] == chars[0] ||
                            textChars[i] == chars[2] ||
                            textChars[i] == chars[4]) {
                        theOne = true;
                        isCorrectly = isCorrectly(text.substring(i), true);
                        i = i + indexToAdd;
                        if (!isCorrectly) {
                            return false;
                        }
                    }
                }
            } else {
                if (textChars[i] == chars[0]) {
                    isFound = true;
                    index = 1;
                } else if (textChars[i] == chars[2]) {
                    isFound = true;
                    index = 3;
                } else if (textChars[i] == chars[4]) {
                    isFound = true;
                    index = 5;
                }
            }
        }


        return !isFound;
    }
}
