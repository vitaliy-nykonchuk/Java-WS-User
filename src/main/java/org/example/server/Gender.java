package org.example.server;

public enum Gender {
    Male, Female;

    public String gender() {
        return name();
    }

    public static Gender fromGender(String g) {
        return valueOf(g);
    }
}
