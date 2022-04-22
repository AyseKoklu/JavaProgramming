package day42_Exceptions;

import day39_Recap.shapeTask.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

        throw new NoSuchElementException("There is no such element");

        // throw new InterruptedException(); this is unreachable because of throw

        // System.out.println("hello world"); this is unreachable because of throw

        // throw new Rectangle(5,7);
        // throw is only used for creating Exception manually


    }

}
