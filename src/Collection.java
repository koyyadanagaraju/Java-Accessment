import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		System.out.println("######### List #########");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list + " size - " + list.size());
        System.out.println(list.get(0));
        list.add(0, 4);
        System.out.println(list + " size - " + list.size());
        list.set(0, 5);
        System.out.println(list + " size - " + list.size());
        list.remove(3);
        System.out.println(list + " size - " + list.size());

        System.out.println("######### Set #########");
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set + " size - " + set.size());
        set.add(4);
        set.add(5);
        System.out.println(set + " size - " + set.size());
        set.remove(3);
        System.out.println(set + " size - " + set.size());
    }

}
