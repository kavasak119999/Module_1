package main.max.tasks.level1;

public class TaskFirst {
    static int[] example = new int[] {1,4,5,1,1,3};

    public static void main(String[] args) {
        System.out.println(getCountUniqueSymbols(example));
    }

    public static int getCountUniqueSymbols(int[] symbols){
        int result = 0;
        int[] temp = new int[symbols.length];
        boolean alreadyHas;

        for(int i = 0; i < symbols.length; i++){
            alreadyHas = false;
            for(int j = 0; j < temp.length; j++) {
                if (symbols[i] == temp[j]) {
                    alreadyHas = true;
                    break;
                }
            }
            if(!alreadyHas){
                temp[result++] = symbols[i];
            }
        }

        return result;
    }
}
