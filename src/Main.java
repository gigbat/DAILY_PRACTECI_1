import java.util.*;

public class Main {
    Queue<Integer> queue = new LinkedList<>();
    Comparator<Integer> comparator = new MainComparator();
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(comparator);

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        System.out.println("Checking how to work method (POLL)");
        main.printElementAndDelete();
        // =============================================================================================================
        Thread.sleep(10000);
        // =============================================================================================================
        System.out.println("Checking how to work method (PEEK)");
        main.printElementAndNotDelete();
        // =============================================================================================================
        System.out.println("Interface Comparable");
        Person person1 = new Person("Vasya", 10);
        Person person2 = new Person("Petya", 9);
        Map<Person, String> map = new TreeMap<>();
        map.put(person1, "person1");
        map.put(person2, "person2");

        for (Person person : map.keySet()) {
            System.out.println(person.getNAME());
        }
        // =============================================================================================================
    }

    private void putElement() {
        for (int i = 5; i > 0; i--) {
            queue.add(i);
            priorityQueue.add(i);
        }
    }

    public void printElementAndDelete() throws InterruptedException {
        if (queue.isEmpty() && priorityQueue.isEmpty()) {
            System.out.println("Queues are - empty");
        } else {
            System.out.println("Queues aren't - empty");
        }

        putElement();

        System.out.println("Print elements of interface Queue. FIFO / LIFO");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
            Thread.sleep(500);
        }
        System.out.println("Object \"queue\" is - " + queue.isEmpty() + "\n");

        System.out.println("Print elements of class PrintQueue. FIFO");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
            Thread.sleep(500);
        }
        System.out.println("Object \"queue\" is - " + priorityQueue.isEmpty() + "\n");
    }

    public void printElementAndNotDelete() throws InterruptedException {
        if (queue.isEmpty() && priorityQueue.isEmpty()) {
            System.out.println("Queues are - empty");
        } else {
            System.out.println("Queues aren't - empty");
        }

        putElement();

        System.out.println("Print elements of interface Queue. FIFO / LIFO");
        if (!queue.isEmpty()) {
            System.out.println(queue.peek());
            Thread.sleep(500);
        }
        System.out.println("Object \"queue\" is - " + queue.isEmpty() + "\n");

        System.out.println("Print elements of class PrintQueue. FIFO");
        if (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.peek());
            Thread.sleep(500);
        }
        System.out.println("Object \"queue\" is - " + priorityQueue.isEmpty() + "\n");
    }

    public void clearElementOfQueue(Queue<Integer> queue) {
        queue.clear();
    }

    public void printComparator(PriorityQueue<Integer> priorityQueue) {
        System.out.println(priorityQueue.comparator());
    }

    public boolean searchSpecificElement(Queue<Integer> queue, int o) {
        if (queue.contains(o)) {
            System.out.println("Queue has number - " + o);
            return true;
        } else {
            System.out.println("Queue hasn't number - " + o);
            return false;
        }
    }

    public void bruteForceIterator(Queue<Integer> queue) {
        Iterator<Integer> iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void removeData(Queue<Integer> queue, int o) {
        if (searchSpecificElement(queue, o)) {
            System.out.println("Element - " + queue.remove(o) + " was deleted");
        } else {
            System.out.println("Element not found");
        }
    }

    public int size(Queue<Integer> queue) {
        return queue.size();
    }
}
