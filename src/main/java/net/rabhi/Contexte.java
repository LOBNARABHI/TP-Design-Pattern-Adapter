package net.rabhi;

public class Contexte {
    private Standard standard;

    public void operation(String message) {
        System.out.println("je suis le contexte.");
        standard.operation(message);
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }
}
