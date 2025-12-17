import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(6);
        list.add(5);

        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size()-i; j++) {
                if(list.get(j) > list.get(j+1)) {

                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }

        list.forEach(result -> System.out.print(result + " "));
    }
}