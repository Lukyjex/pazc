package org.example;

import java.util.Set;

public class AService {

    public int sameName (String name, Set<Student> students) {

        int count = 0;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                count++;
            }
        }

        return count;
    }


}
