public class BMI{
    
    private static double poundsConversion = 0.45359237, inchesConversion = 0.0254;

    private double pounds, inches, bmiValue;

    public BMI(double pounds, double inches) {
        this.pounds = pounds;
        this.inches = inches;
    }
    
    public double getPounds() {
        return pounds;
    }
    public void setPounds(double pounds) {
        this.pounds = pounds;
    }
    public double getInches() {
        return inches;
    }
    public void setInches(double inches) {
        this.inches = inches;
    }

    public double calculateBMI(){
        bmiValue = (pounds*poundsConversion)/(Math.pow(inches*inchesConversion, 2));
        return bmiValue;
    }

    public String bmiInterpretation(){
        if (bmiValue<18.5){
            return "Underweight";
        }else if(18.5<=bmiValue && bmiValue<25.0){
            return "Normal";
        }else if(25.0<=bmiValue && bmiValue<30.0){
            return "Overweight";
        }else{
            return "Obese";
        }
    }
}
