package chap3.item9;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class PhoneBook {

    private final Map<PhoneNumber, String> registry = ImmutableMap.of(
            new PhoneNumber(615, 618, 7299), "Jim",
            new PhoneNumber(773, 456, 2847), "John");

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        String name = pb.registry.get(new PhoneNumber(615, 618, 7299));
        System.out.println(name);

    }
}
