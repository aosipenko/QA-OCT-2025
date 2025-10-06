package org.prog.session3;

public class Mazda implements ICar {

    public String color;

    public void turnLeft() {
        System.out.println("Mazda turns left");
    }

    public void turnRight() {
        System.out.println("Mazda turns right");
    }

    public void accelerate() {
        System.out.println("Mazda accelerate");
    }

    public void brake() {
        System.out.println("Mazda Brake");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Mazda) {
            Mazda otherMazda = (Mazda) obj;
            if (this.color == null && otherMazda.color == null) {
                return true;
            } else {
                return this.color != null && this.color.equals(otherMazda.color);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }
}
