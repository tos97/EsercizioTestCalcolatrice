package com.calcolatrice;

import com.calcolatrice.Operazioni;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.*;
import java.util.stream.IntStream;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class UnitDynamicTest {
    private final float a = 10, b = 2, somma = 12, differenza = 8,prodotto = 20,divisione = 5;

    @TestFactory
    @DisplayName("com.calcolatrice.Operazioni")
    Collection<DynamicTest> dynamicTestCollectionOp(){
        return Arrays.asList(
                dynamicTest("1 Somma", () -> Assertions.assertEquals(somma, new Operazioni().somma(a,b))),
                dynamicTest("1 Sottrazione", () -> Assertions.assertEquals(differenza, new Operazioni().sottrazione(a,b))),
                dynamicTest("1 Prodotto", () -> Assertions.assertEquals(prodotto, new Operazioni().moltiplicazione(a,b))),
                dynamicTest("1 Divisione", () -> Assertions.assertEquals(divisione, new Operazioni().divisione(a,b)))
        );
    }

    @TestFactory
    @DisplayName("Multiplo di 3")
    Collection<DynamicTest> dynamicTestCollectionMultiplo(){
        return (Collection<DynamicTest>) IntStream.of(0,2,4,8).mapToObj(valore -> dynamicTest(valore + "Multiplo?", () -> assertEquals(0,2%valore)));
    }
}
