import java.util.*;
import java.util.stream.*;
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        // Step 2: Apply safety validation using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    // Rule: Cylindrical bogie must carry Petroleum only
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true;
                });
        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        System.out.println("\nSafety Status: " +
                (isSafe ? "SAFE" : "UNSAFE"));

        System.out.println("\nProgram continues...");
    }
}