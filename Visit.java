import java.util.Scanner;

public class Visit {
    public String[] Symptoms = {"coughing", "fever","fatigue", "body aches", "runny nose", "nausea", "congestion"}; //, "vomiting", "sneezing", "congestion", "runny nose", "fatigue", "body aches", "sore throat", "nausea", "diarrhea", "stomachache"
    public Diagnosis[] Diagnoses = new Diagnosis[2];
    public String[] Given_Symptoms = new String[5];

    public Visit(){
        Diagnosis Flu = new Diagnosis("Flu", "Doctor visit with shot, plenty of rest & water, over the counter congestion medicene.");
        Diagnosis Common_Cold = new Diagnosis("common cold", "Over the counter Motrin and Tyonal, rest, plenty of water");

        Diagnoses[0] = Flu; // "coughing", "fever","fatigue", "body aches", "nausea", "runny nose", "congestion"
        Diagnoses[1] = Common_Cold; // "coughing", "running nose", "congestion", 

    }

    public void list_Symptoms() {
        int count = 1;
        for (String symptom : Symptoms) {
            System.out.println(count + ". " + symptom);
            count++;
        }
    }

    public void get_Symptoms() {
        System.out.println("Type a number and enter to add symptoms to your issues. You can add up to 5. Type '0' when finished.");
        Scanner input = new Scanner(System.in);
        int condition;
        while (input.hasNextInt()) {
            condition = input.nextInt();
            System.out.println("You choose" + condition);
            if(condition == 0) {
                break;
            }
        }
        input.close();
    }
}
