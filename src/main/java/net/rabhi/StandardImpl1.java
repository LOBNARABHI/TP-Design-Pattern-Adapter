package net.rabhi;

public class StandardImpl1 implements Standard {
    @Override
    public void operation(String message) {
        System.out.println("la 1ere implementation : "+message);
    }
}
