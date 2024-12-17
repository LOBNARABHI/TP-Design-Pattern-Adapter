package net.rabhi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Contexte contexte = new Contexte();
        contexte.setStandard(new StandardImpl1());
        contexte.operation("hello");


        System.out.println("---------------->");
        AdapteteurPourStandard adapteteurPourStandard = new AdapteteurPourStandard();
        adapteteurPourStandard.setHdmi(new TV());
        contexte.setStandard(adapteteurPourStandard);
        contexte.operation("je suis le message que je vais afficher dans TV lors de l'utilisation de l'adaptateur pour un HDMI dans un Contexte qui connaitre juste Standard");
    }
}