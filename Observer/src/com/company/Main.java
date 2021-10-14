package com.company;

public class Main {

    public static void main(String[] args) {
	    Channel ch = new Channel();

	    Subscriber s1 = new Subscriber("Jarek");
        Subscriber s2 = new Subscriber("Iza");
        Subscriber s3 = new Subscriber("Radek");
        Subscriber s4 = new Subscriber("Agnieszka");
        Subscriber s5 = new Subscriber("Mikołaj");

        ch.subscribe(s1);
        ch.subscribe(s2);
        ch.subscribe(s3);
        ch.subscribe(s4);
        ch.subscribe(s5);

        s1.subscribeChannel(ch);
        s2.subscribeChannel(ch);
        s3.subscribeChannel(ch);
        s4.subscribeChannel(ch);
        s5.subscribeChannel(ch);

        ch.upload("Hi!");
    }
}
