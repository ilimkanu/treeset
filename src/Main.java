import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Workers> workers = new TreeSet<>();

        workers.add(new Workers("Mike", "Sovetskaya", 80000, false));
        workers.add(new Workers("James", "Sovetskaya", 120000, true));
        workers.add(new Workers("John", "Bokombaeva", 75000, false));
        workers.add(new Workers("Linda", "Bokombaeva", 90000, false));
        workers.add(new Workers("Johny", "Bokombaeva", 110000, true));
        workers.add(new Workers("Paul", "Moskovskaya", 85000, false));

        System.out.println(workers.size());
        workers.remove(5);
        workers.clear();
        System.out.println("-------------------------");
    }
}
