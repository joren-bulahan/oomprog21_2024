public class MathTest {
    public static void main(String[] args) {
        
        double sqrtValue = 36.0;
        double sqrtResult = Math.sqrt(sqrtValue);
        System.out.println("SQRT: " + sqrtResult);

      
        double angleInRadians = 3.14159;
        double sinResult = Math.sin(angleInRadians);
        System.out.println("SIN: " + sinResult);

      
        double cosResult = Math.cos(angleInRadians);
        System.out.println("COS: " + cosResult);

      
        double floorValue = 22.7;
        double floorResult = Math.floor(floorValue);
        System.out.println("FLOOR: " + floorResult);

      
        double ceilValue = 22.3;
        double ceilResult = Math.ceil(ceilValue);
        System.out.println("CEIL: " + ceilResult);

      
        double roundValue = 22.5;
        long roundResult = Math.round(roundValue);
        System.out.println("ROUND: " + roundResult);

        
        int maxValue1 = 71;
        int maxValue2 = 68;
        int maxResult = Math.max(maxValue1, maxValue2);
        System.out.println("MAX: " + maxResult);

        
        int minValue1 = 71;
        int minValue2 = 68;
        int minResult = Math.min(minValue1, minValue2);
        System.out.println("MIN: " + minResult);

        
        double randomResult = Math.random();
        System.out.println("RANDOM: " + randomResult);
    }
}
