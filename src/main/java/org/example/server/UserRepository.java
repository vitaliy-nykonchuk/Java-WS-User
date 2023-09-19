package org.example.server;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static final Map<String, User> users = new HashMap<>();

    static {
        initData();
    }

    private static void initData() {
        User bob = new User();
        bob.setName("Bob");
        bob.setPhone(333287557);
        bob.setAge(23);
        bob.setGender(Gender.Male);

        users.put(bob.getName(), bob);

        User mike = new User();
        mike.setName("Mike");
        mike.setPhone(84270625);
        mike.setAge(22);
        mike.setGender(Gender.Male);

        users.put(mike.getName(), mike);

        User kate = new User();
        kate.setName("Kate");
        kate.setPhone(608000000);
        kate.setAge(21);
        kate.setGender(Gender.Female);

        users.put(kate.getName(), kate);
    }

    public User findUser(String name) {
        return users.get(name);
    }
}
