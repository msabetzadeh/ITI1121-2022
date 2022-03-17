import java.util.Queue;
import java.util.LinkedList;

public class Solver {

    public static String solve(Labyrinth labyrinth) {

        /* NOTE: we do not have our own implementation
         * of a Queue yet. Instead, I use here one
         * provided by Java: java.util.Queue. That interface
         * defines the method "add" for what we
         * have called "enqueue" and the method "remove"
         * for what we have called "dequeue".
         *
         * We need a concrete implementation for that
         * interface, and we will use java.util.LinkedList
         * which implements java.util.Queue
         */

        Queue<String> q = new LinkedList<String>();
        q.add(""); // was: q.enqueue("");
        boolean found = false;
        while(!q.isEmpty()){
            String s = q.remove(); // was String s = q.dequeue();
            if(labyrinth.checkPath(s)){
            	if(labyrinth.reachesGoal(s)){
            		return s;
            	} else {
		            q.add(s+"U"); // was q.enqueue(s+"U");
                    q.add(s+"D"); // was q.enqueue(s+"D");
                    q.add(s+"L"); // was q.enqueue(s+"L");
                    q.add(s+"R"); // was q.enqueue(s+"R");            		
            	}
            }
        }
        return null;
    }

}
