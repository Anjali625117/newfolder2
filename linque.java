import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

class linque {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4);
        ArrayList<Integer> squaredArr = new ArrayList<>();

        // for (int i = 0; i < arr.size(); i++) {
        //     squaredArr.add(arr.get(i) * arr.get(i));
        // }

        System.out.println(arr.stream().map(n -> n * n).collect(Collectors.toList()));
        System.out.println(arr.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
        arr.stream().forEach(n -> System.out.println(n));

        System.out.println("Local change");
        System.out.println("Server change");
    }
}
