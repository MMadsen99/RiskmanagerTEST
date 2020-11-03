public class Risk {

    private  String description;
    private String consequence;
    private double probabilityPercent; // 1..100
    private Probability probabilityLevel;


    public static String hello() {
        return "Hello!";
    }

    Risk() {
        probabilityPercent = 0.001;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConsequence() {
        return consequence;
    }

    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }

    public double getProbabilityPercent() {
        return probabilityPercent;
    }

    public void setProbabilityPercent(double probabilityPercent) {
        this.probabilityPercent = probabilityPercent;
    }

    public Probability getProbabilityLevel() {
        return probabilityLevel;
    }

    public void setProbabilityLevel(Probability probabilityLevel) {
        this.probabilityLevel = probabilityLevel;
    }
}
