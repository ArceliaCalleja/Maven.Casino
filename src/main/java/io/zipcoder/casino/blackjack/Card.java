package io.zipcoder.casino.blackjack;

public class Card {

    private Suite suite;
    private FaceValue faceValue;

    public Suite getSuite() {
        return suite;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public void setFaceValue(FaceValue faceValue) {
        this.faceValue = faceValue;
    }

    //declare a field of type Suite named suite
    //declare a field of type FaceValue named faceValue

    //create a getter and setter for both fields

}
