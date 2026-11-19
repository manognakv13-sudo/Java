
import java.util.*;

class NoOfRecntCalls {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        // Add current request
        queue.add(t);

        // Remove requests older than 3000 ms
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        // Return number of recent requests
        return queue.size();
    }
}
