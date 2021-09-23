package com.example.basics.data;

import java.math.*;


public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        BigInteger bigInt = new BigInteger( "8798589354398390309943594758475");
        bigInt = bigInt.add(new BigInteger("543985743897539875984739"));
        System.out.println("Wynik:" + bigInt.toString());

        BigDecimal decimal = new BigDecimal("34324322.2345342");
        decimal = decimal.pow(3);
        decimal = decimal.subtract(new BigDecimal("3432.4324323342"));
        System.out.println("Wynik:" + decimal.toString());
    }
}
