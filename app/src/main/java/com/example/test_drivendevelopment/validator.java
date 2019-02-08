package com.example.test_drivendevelopment;

public class validator {
    public int validate (String password) {
        int rule = 0;

        if (password.length()>=8) {
            rule  = rule+1;
        }
        if (!password.equalsIgnoreCase("password")) {
            rule = rule +1;
        }
        return rule;
    }
}
