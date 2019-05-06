package com.zterry.javadesignpattern;

import com.zterry.javadesignpattern.adapter.IPhone;
import com.zterry.javadesignpattern.adapter.NormalAndroidPhone;
import com.zterry.javadesignpattern.bridge.BlackColor;
import com.zterry.javadesignpattern.bridge.Circle;
import com.zterry.javadesignpattern.bridge.Rectangle;
import com.zterry.javadesignpattern.bridge.Shape;
import com.zterry.javadesignpattern.bridge.Triangle;
import com.zterry.javadesignpattern.bridge.WhiteColor;
import com.zterry.javadesignpattern.command.PlayCommand;
import com.zterry.javadesignpattern.visitor.demo1.demo2.Computer;
import com.zterry.javadesignpattern.visitor.demo1.demo2.ComputerPart;
import com.zterry.javadesignpattern.visitor.demo1.demo2.ComputerPartDisplayVisitor;
import com.zterry.javadesignpattern.visitor.demo1.demo4.BankVisitorA;
import com.zterry.javadesignpattern.visitor.demo1.demo4.BankWindowA;
import com.zterry.javadesignpattern.visitor.demo1.demo4.BankWindowB;
import com.zterry.javadesignpattern.visitor.demo1.demo4.BankWindowC;

public class Main {

    private static PlayCommand command;

    public static void main(String[] args) {
        System.out.println("hello world !");


//        command = new PlayCommand();
//        command.setAudioPlayer(new AudioPlayer());
//
//        Invoker invoker = new Invoker(command);
//        invoker.invoke();




        // visitor
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
        testVisitorDemo4();

        // bridge
        testBridge();

        // test adapter
        testAdapter();
    }

    private static void testVisitorDemo4() {
        System.out.println();
//        BankVisitorA bankVisitorA =new BankVisitorA();
//        bankVisitorA.visit(new BankWindowA());
//        bankVisitorA.visit(new BankWindowB());
//        bankVisitorA.visit(new BankWindowC());

        BankWindowC bankWindowC = new BankWindowC();
        bankWindowC.accept(new BankVisitorA());

        BankWindowB bankWindowB = new BankWindowB();
        bankWindowB.accept(new BankVisitorA());

        BankWindowA bankWindowA = new BankWindowA();
        bankWindowA.accept(new BankVisitorA());

    }

    private static void testAdapter() {
        System.out.println();

        NormalAndroidPhone androidPhone = new NormalAndroidPhone();
        androidPhone.charge("xiaomi_note");
        androidPhone.charge("xiaomi9");

        IPhone iPhone = new IPhone();
        iPhone.charge("");
    }

    private static void testBridge() {
        System.out.println();

        Shape shape =new Rectangle();
        shape.draw(new WhiteColor());

        Shape rectangle =new Triangle();
        rectangle.draw(new WhiteColor());

        Shape white =new Circle();
        white.draw(new BlackColor());
    }
}
