import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println(person);
            person.setTicketsAmount(person.getTicketsAmount() - 1);
            if (person.getTicketsAmount() != 0) {
                queue.offer(person);
            }
        }
    }

    static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Алексей", "Непомнящий", 3));
        clients.add(new Person("Анастасия", "Куницкая", 8));
        clients.add(new Person("Анна", "Устинова", 5));
        clients.add(new Person("Егор", "Коршунов", 1));
        clients.add(new Person("Котя", "Красивый", 2));
        return clients;
    }
}
