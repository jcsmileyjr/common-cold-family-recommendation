
class Diagnosis {
    private String type;
    private String treatment;

    public Diagnosis(String type, String treatment) {
        this.type = type;
        this.treatment = treatment;
    }

    public void printDiagnosis(){
        System.out.println("I am of type " + type + ". With this treatement" + treatment);
    }
}