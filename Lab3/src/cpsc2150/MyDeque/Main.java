package cpsc2150.MyDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*You will add in code here to ask the user whether they want an
        array implementation or a list implementation. Then use their answer to
        initialize q appropriately*/
        IDeque q = null;
        int input = 0;
        Scanner myObj = new Scanner(System.in);
        while (input == 0) {
            System.out.println("List or Array Implementation?");
            String Imp = myObj.nextLine();
            Imp = Imp.toLowerCase();
            if (Imp.contains("array")) {
                q = new ArrayDeque();
                input = 1;

            } else if (Imp.contains("list")) {
                q = new ListDeque();
                input = 1;
            }
            else{
                System.out.println("Invalid response: type 'array' or 'list'");
            }
        }


        Character x = 'a';
        q.enqueue(x);
        x = 'k';
        q.enqueue(x);
        x = 'j';
        q.enqueue(x);
        x = '1';
        q.enqueue(x);
        x = 'f';
        q.enqueue(x);
        /* EXTRA TESTING
        x = 'y';
        q.dequeue();
        q.removeLast();
        q.inject(x);
        System.out.println(q.length());
        q.print();
        q.clear();
        q.print();
         */

        //Add the code to print the deque. After the code is finished, the deque
        // should still contain all its values in order
        q.print();
    }
}
