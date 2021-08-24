package com.homeworks.lessons6;

public class ScannerOne {
    private String digital;
    private String literal;
    private String Symbol;
    private String DigitalDouble;
    private String value;

    public String getDigitalDouble() {
        return DigitalDouble;
    }

    public void setDigitalDouble(String digitalDouble) {
        DigitalDouble = digitalDouble;
    }

    public String getDigital() {
        return digital;
    }

    public void setDigital(String digital) {
        digital = digital;
    }

    public String getLiteral() {
        return literal;
    }

    public void setLiteral(String literal) {
        literal = literal;
    }

    public String getSymbol(String symbol) {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String homeRegexOne() {
        if (getDigital().equals("numeral")) {
            value = "\\d*";
        } else if (getLiteral().equals("letter")) {
            value = "[a-zA-zа-яА-Я]*";
        }else if ( getDigitalDouble().equals("double")) {
//            value = "\\d{2}\\W\\d{2}";
            value = "[0-9]*?[.][0-9]+";
        } else if (getSymbol("").equals("char")) {
            value = "[a-zA-Z]{1}";
        } else
            value = "nothing";
        return value;
    }


}


