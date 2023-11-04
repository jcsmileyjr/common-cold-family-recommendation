

public class Main {
    public static void main(String[] args) {
        // Testing
        // Diagnosis common_cold = new Diagnosis("common_cold", "Rest, lots of water, Tyenol, vitamins");
        // common_cold.printDiagnosis();

        System.out.println("Sorry to see that you are sick. Choose from this list of symptoms to let me know what is bothering you.");

        Visit session = new Visit();
        session.list_Symptoms();
        session.get_Symptoms();
    }
}