import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;
    String type;

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 40, "Passenger"));
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("Rectangular", 100, "Goods"));
        bogies.add(new Bogie("Cylindrical", 120, "Goods"));
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));
        System.out.println("\nGrouped Bogies:");

        for (String key : grouped.keySet()) {
            System.out.println("\nType: " + key);
            for (Bogie b : grouped.get(key)) {
                System.out.println("  " + b);
            }
        }

        System.out.println("\nProgram continues...");
    }
}