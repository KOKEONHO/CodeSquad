package precourse.week_01.shine;

import java.io.BufferedWriter;

public class Human {

    private String name;
    private int age;
    private int height;
    private int weight;

    BufferedWriter bw;

    Human(String name, int age, int height, int weight, BufferedWriter bw) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.bw = bw;
    }


}
