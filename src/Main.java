import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();
        System.out.println("\nTrain ID: " + trainId +
                " -> " + (isTrainValid ? "Valid" : "Invalid"));

        System.out.println("Cargo Code: " + cargoCode +
                " -> " + (isCargoValid ? "Valid" : "Invalid"));

        System.out.println("\nProgram continues...");
    }
}