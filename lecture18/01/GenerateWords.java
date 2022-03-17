import java.util.Queue;
import java.util.LinkedList;

public class GenerateWords {

    public static void main( String[] args ) {

        String[] series = new String[]{"0","1"};
//        String[] series = new String[]{"U","D","L","R"};
        
        Queue<String> queue;
        queue = new LinkedList<String>();

        queue.add(""); // was queue.enqueue(""); with our definition
        int j =0;
        while(j++ < 255) {
//        while(true) {
            String s = queue.remove();// was queue.dequeue(); with our definition
            System.out.println(s);
            for(int i =0; i< series.length; i++){
                //queue.enqueue(s+series[i]);
                queue.add(s+series[i]);
            }
        }
    }
}
