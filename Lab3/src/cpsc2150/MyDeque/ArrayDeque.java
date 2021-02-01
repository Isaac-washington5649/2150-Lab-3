package cpsc2150.MyDeque;

public class ArrayDeque implements IDeque {
    // where the data is stored. myQ[0] is the front of the deque
    private Character[] myQ;
    // tracks how many items in the deque
// also used to find the end of the deque
    private int myLength;

    ArrayDeque(){
        myQ = new Character[MAX_LENGTH];
        for(int i = 0; i < MAX_LENGTH; i++){
            myQ[i] = 0;
        }
        myLength = 0;
    }

    public void enqueue(Character x) {
        if (myLength < MAX_LENGTH) {
            myQ[myLength++] = x;
        }
        else{
            System.out.println("overflow error");
        }
    }


    public Character dequeue() {
        Character c = myQ[0];
        for (int i = 0; i < (MAX_LENGTH - 1); i++){
            myQ[i] = myQ[i+1];
        }
        myQ[MAX_LENGTH - 1] = 0;
        return c;
    }

    public void inject(Character x) {
        for(int i = MAX_LENGTH - 1; i > 0; i--){
            myQ[i] = myQ[i-1];
        }
        myQ[0] = x;
    }

    public Character removeLast() {
        Character c = myQ[myLength];
        myQ[myLength] = 0;
        myLength--;
        return c;
    }

    public int length() {
        return myLength;
    }

    public void clear() {
        for(int i = 0; i <= myLength; i++){
            myQ[i] = 0;
        }
        myLength = 0;
    }
    public void print(){
        for (int i = 0; i < myLength; i++){
            System.out.println(myQ[i]);
        }
    }
}
