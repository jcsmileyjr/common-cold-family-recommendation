import java.util.Scanner;

public class Visit {
    public String[] symptoms = {"coughing", "fever","fatigue", "body aches", "runny nose", "nausea", "congestion"}; //, "vomiting", "sneezing", "congestion", "runny nose", "fatigue", "body aches", "sore throat", "nausea", "diarrhea", "stomachache"
    public Diagnosis[] diagnoses = new Diagnosis[2];
    public String[] givenSymptoms = new String[5];

    public Visit(){
        String[] fluSymptoms = {"coughing", "fever","fatigue", "body aches", "nausea", "runny nose", "congestion"};
        Diagnosis flu = new Diagnosis("Flu", "Doctor visit with shot, plenty of rest & water, over the counter congestion medicene.", fluSymptoms);

        String[] commonColdSymptoms = {"coughing", "running nose", "congestion"};
        Diagnosis commonCold = new Diagnosis("common cold", "Over the counter Motrin and Tyonal, rest, plenty of water", commonColdSymptoms);

        diagnoses[0] = flu; // "coughing", "fever","fatigue", "body aches", "nausea", "runny nose", "congestion"
        diagnoses[1] = commonCold; // "coughing", "running nose", "congestion", 
    }
    
    public void testing() {
        diagnoses[0].test();
    }

    public void Determine_Illness() {
        int index = 0;
        double highestProbality = 0;
        double currentDiagnosisProbality = 0;
        int mostLikelyIllness = 0;
    
        for (Diagnosis illness : diagnoses) {
            currentDiagnosisProbality =  illness.Determine_Probability_Of_Illness(givenSymptoms);
            if(currentDiagnosisProbality > highestProbality) {
                highestProbality = currentDiagnosisProbality;
                mostLikelyIllness = index;
            }
            index ++;
        } 

        diagnoses[mostLikelyIllness].printDiagnosis();
        //System.out.println("Your illness is " + diagnoses[mostLikelyIllness] + ". The treatment is :");
        
    }

    public void list_Symptoms() {
        int count = 0;
        for (String symptom : symptoms) {
            System.out.println(count + ". " + symptom);
            count++;
        }
    }

    public void get_Symptoms() {
        System.out.println("Type a number and enter to add symptoms to your issues. You can add up to 5. Type '0' when finished.");
        Scanner input = new Scanner(System.in);
        int condition;
        int number_of_conditions = 0;

        while (input.hasNextInt()) {
            condition = input.nextInt();

            if(condition == -1) {
                break;
            } else {
                givenSymptoms[number_of_conditions] = symptoms[condition];
                number_of_conditions++;
            }

            System.out.println("You choose " + condition);
        }

        System.out.println("display syptoms given");
        for (String symptoms : givenSymptoms) {
            if(symptoms != null) {
                System.out.println(symptoms);
            }
        }
        input.close();
    }
}
