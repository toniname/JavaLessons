package com.homeworks.lessons6;

public class ScannerOne {
    String Digital;
    String Literal;
    String Char;
    String DigitalDouble;
    String value;

    public String getDigitalDouble() {
        return DigitalDouble;
    }

    public void setDigitalDouble(String digitalDouble) {
        DigitalDouble = digitalDouble;
    }

    public String getDigital() {
        return Digital;
    }

    public void setDigital(String digital) {
        Digital = digital;
    }

    public String getLiteral() {
        return Literal;
    }

    public void setLiteral(String literal) {
        Literal = literal;
    }

    public String getChar() {
        return Char;
    }

    public void setChar(String aChar) {
        Char = aChar;
    }

    public String homeRegexOne() {
        if (getDigital().equals("numeral")) {
            value = "\\d";
        } else if (getLiteral().equals("letter")) {
            value = "[a-zA-z]";
        }else if ( getDigitalDouble().equals("double")) {
            value = "\\d{2}\\W\\d{2}";
        } else if (getChar().equals("char")) {
            value = "\\W";
        } else
            value = "nothing";
        return value;
    }


}


