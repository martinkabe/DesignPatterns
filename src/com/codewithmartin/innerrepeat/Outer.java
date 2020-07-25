package com.codewithmartin.innerrepeat;

public class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    public Inner outerMethod() {
        return new Inner(this);
    }

    public class Inner {
        private Outer outer;

        public Inner(Outer outer) {
            this.outer = outer;
        }

        public void innerMethod() {
            System.out.println("Hello from inner class - " + outer.name);
        }
    }
}
