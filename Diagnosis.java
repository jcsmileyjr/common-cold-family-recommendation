
class Diagnosis {
    private String type;
    private String treatment;
    private String[] symptoms;

    public Diagnosis(String type, String treatment, String[] symptoms) {
        this.type = type;
        this.treatment = treatment;
        this.symptoms = symptoms;
    }

    public void printDiagnosis(){
        System.out.println("I am of type " + type + ". With this treatement" + treatment);
    }

    public void test() {
        System.out.println(type + " diagnosis has treatment " + treatment + ". The following is the symptoms: ");
        for (String symptom : symptoms) {
            System.out.println(symptom);
        }
    }

    /*
     * Create number to be return
     * Take in an array of strings symptoms
     * Take in an array of string given_symptoms
     * Loop through both to determine how many of the given symptoms are found in the illness symptoms.
     * Return that number
     */
    public double Determine_Probability_Of_Illness(String[] given_symptoms) {
        double matches = 0;
        double probability = 0.0;

        for (String issue : given_symptoms) {
            for (String symptom : symptoms) {
                if(issue == symptom) {
                    matches ++;
                }
            }
        }

        probability = (matches / symptoms.length) * 100;

        System.out.println("number of illness systems are " + symptoms.length + " divide by number of matches " + matches + " is the probability is " + probability);

        return probability;
    }
}