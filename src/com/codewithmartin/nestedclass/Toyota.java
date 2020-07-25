package com.codewithmartin.nestedclass;

public class Toyota {
    private String type;
    private int age;

    public Toyota(String type, int age) {
        this.type = type;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    public Movement doSomething() {
        return new Util(this);
    }

    public class Util implements Movement {
        private Toyota toyota;

        public Util(Toyota toyota) {
            this.toyota = toyota;
        }

        @Override
        public String toString() {
            return "Util{" +
                    "toyota=" + toyota +
                    '}';
        }

        @Override
        public void move() {
            System.out.println(this + " moving");
        }
    }
}
