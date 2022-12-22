package reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Reference2 {
    public static void main(String[] args) {
        Function<String,Integer> strLength = String::length;
        int length = strLength.apply("hello world");
        System.out.println(length);

        BiPredicate<String, String> strEquals = String::equals;
        boolean helloEqualsWorld = strEquals.test("hello","world");

        List<User> users = new ArrayList<>();
        users.add(new User(3,"Alice"));
        users.add(new User(1,"Toy"));
        users.add(new User(4,"Solyi"));

        printUserField(users,User::getId);

    }
    public static void printUserField(List<User> users,Function<User,Object> getter){
        for (User user : users){
            System.out.println(getter.apply(user));
        }
    }
}
