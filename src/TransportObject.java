public class TransportObject {

    public static void main(String[] args){

        Transport bmw = new Transport();
        bmw.speed = 250.5f;
        bmw.weight = 2500;
        bmw.color = "White";
        bmw.coordinate = new byte[] {0,0,0};

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "Red";
        truck.coordinate = new byte[] {100,0,100};

        System.out.println("Truck speed: " + truck.speed + ". BMW speed: " + bmw.speed);


        Transport hyundai = new Transport();
        hyundai.speed = 160.5f;
        hyundai.weight = 1900;
        hyundai.color = "Black";
        hyundai.coordinate = new byte[] {23,54,65};

        String res1 = hyundai.getValues();
        System.out.println(res1);


        Transport toyota = new Transport();
        toyota.setValues(230.5f, 2700, "Grey", new byte[] {43,65,12});
        String res2 = toyota.getValues();
        System.out.println(res2);


    }
}
