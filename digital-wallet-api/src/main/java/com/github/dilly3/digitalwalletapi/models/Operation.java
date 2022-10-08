package com.github.dilly3.digitalwalletapi.models;

public enum Operation {
    FAIL("failed transaction"),
    SUCCESS("successful transaction");

    private String state;

    Operation(String state) {
        this.state = state;
    }

    public String getValue(){
        return this.state;
    }


}
