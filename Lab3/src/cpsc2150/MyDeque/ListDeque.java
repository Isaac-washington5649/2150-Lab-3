package cpsc2150.MyDeque;

import java.util.*;
public class ListDeque implements IDeque {
    // this time store the deque in a list
// myQ.get(0) is the front of the deque
    private List<Character> myQ;
    ListDeque(){
       myQ = new ArrayList<Character>();
    }

    @Override
    public void enqueue(Character x) {
        myQ.add(x);
    }

    @Override
    public Character dequeue() {

        Character c = myQ.get(0);
        for (int i = 0; i < (myQ.size() - 1); i++){
            myQ.set(i, myQ.get(i+1));
        }
        myQ.remove(myQ.size() - 1);
        return c;
    }

    @Override
    public void inject(Character x) {
        myQ.add(myQ.get(myQ.size()-1));
        for(int i = (myQ.size() - 1); i > 0; i--){
            myQ.set(i, myQ.get(i-1));
        }
        myQ.set(0, x);

    }

    @Override
    public Character removeLast() {
        Character c = myQ.get(myQ.size()-1);
        myQ.remove(myQ.size()-1);
        return c;
    }

    @Override
    public int length() {
        return myQ.size();
    }

    @Override
    public void clear() {
    myQ.subList(0, myQ.size()).clear();
    }

    public void print(){
        for (int i = 0; i < myQ.size(); i++){
            System.out.println(myQ.get(i));
        }
    }
// complete the class

}