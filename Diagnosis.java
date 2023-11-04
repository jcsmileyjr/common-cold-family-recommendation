
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
}