public class ArrayList {
    private int[] array;
    private int numElements;
    private int numToGrow = 5;

//    Getters and setters
    public int size(){
        return numElements;
    }

//    Constructor
    public ArrayList(){
        this.array = new int[10];
    }


//    Other methods

    public boolean add(int num){
        if (numElements<array.length){
            grow(numToGrow);
        }

        array[numElements] = num;
        numElements++;

        return true;
    }

    private void grow(int numToGrow){
        int[] grownArr = new int[numToGrow+this.size()];

        for (int i = 0; i < array.length; i++) {
            grownArr[i] = array[i];
        }
        this.array = grownArr;
    }






}
