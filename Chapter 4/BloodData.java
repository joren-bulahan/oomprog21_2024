public class BloodData {
    private String bloodType;
    private String rhFactor;

    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
    public void setRhFactor(String rh_Factor){
        this.rhFactor = rh_Factor;
    }

    public String getBloodType(){
        return bloodType;
    }

    public String getRhFactor(){
        return rhFactor;
    }

    public void defaultPatient(){
        bloodType = "A";
        rhFactor = "-"; 
    }

    public void displayBloodInfo(){
        System.out.println("Your Blood Type: " + bloodType);
        System.out.println("Your RH Factor: " + rhFactor);
    }



}
