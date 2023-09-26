package TipeData;

public class TipeDataArray {
    public static void main(String[] args) {
        // array = used to storre multiple value in a single variable
    
        String[] cars = {"Camaro", "Tesla", "Civic", "Bmw"};

        cars[0] = "Mustang";
        
        System.out.println(cars[2]);
        
        String[] bycycle = new String[4];
        bycycle[0] = "Pacific";
        bycycle[1] = "Polygon";
        bycycle[2] = "BMX";
        bycycle[3] = "United";

        for(int i = 0; i < bycycle.length; i++){
            System.out.println(bycycle[i]);
        }



    }
}
