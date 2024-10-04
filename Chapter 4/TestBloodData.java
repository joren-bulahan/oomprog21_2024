import java.util.*;

public class TestBloodData {
    public static void main(String[] args) {
        String blood_Type;
        String rh_factor;
        BloodData blood_data = new BloodData();
        Scanner scan;
            scan = new Scanner(System.in);

            System.out.println("Enter your Blood Type: ");
            blood_Type = scan.nextLine();
            blood_data.setBloodType(blood_Type);

            System.out.println("Enter your Rh Factor: ");
            rh_factor =scan.nextLine();
            blood_data.setRhFactor(rh_factor);
            

        scan.close();
        blood_data.displayBloodInfo();
        System.out.println(" ");
        blood_data.defaultPatient();
        
        
    }
}
