package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class Reference3 {
    public static void main(String[] args) {
        Map<String,BiFunction<String,String,Car>> carTypeMap= new HashMap<>();
        carTypeMap.put("Sedan",Sedan::new);
        carTypeMap.put("SUV",Suv::new);
        carTypeMap.put("Van",Van::new);


        User user = new User(1, "Alice");
        BiFunction<Integer,String,User> userCreator = User::new;
        User alice = userCreator.apply(1, "Alice");
        System.out.println(alice);

        String[][] inputs = new String[][]{
                {"Sedan","Sonata","Hyundai"},
                {"Van","Sienna","Toyota"},
                {"Sedan","Model S","Tesla"},
                {"SUV","Sorento","KIA"},
        };
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++){
            String[] input = inputs[i];
            String carType = input[0];
            String name = input[1];
            String brand = input[2];
            cars.add(carTypeMap.get(carType).apply(name,brand));

        }
        for (Car car : cars){
            car.drive();

        }

    }
}
