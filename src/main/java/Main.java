import io.lacuna.bifurcan.List;
import io.lacuna.bifurcan.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> linearSet = new Set<Integer>().linear();
        linearSet.add(1);
        Set<Integer> forkedSet = linearSet.forked();
        linearSet.add(2);

        System.out.println("Linear set: " + linearSet);
        System.out.println("Forked set: " + forkedSet);

        List<Integer> linearList = new List<Integer>().linear();
        linearList.addLast(1);
        List<Integer> forkedList = linearList.forked();
        linearList.addLast(2);

        System.out.println("Linear list: " + linearList);
        System.out.println("Forked list: " + forkedList);
    }
}
