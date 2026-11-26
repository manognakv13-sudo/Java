
import java.util.*;

public class NumberUnableEat{

    public static int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q = new LinkedList<>();

        // Add all students to queue
        for (int student : students) {
            q.offer(student);
        }

        int index = 0;
        int count = 0;

        while (!q.isEmpty() && count < q.size()) {

            if (q.peek() == sandwiches[index]) {

                q.poll();
                index++;
                count = 0;

            } else {

                q.offer(q.poll());
                count++;
            }
        }

        return q.size();
    }

    public static void main(String[] args) {

        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};

        System.out.println(countStudents(students, sandwiches));
    }
}
