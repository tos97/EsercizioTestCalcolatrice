package com.calcolatrice.stepCucumber;

import com.calcolatrice.Fattoriale;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FattorialeStep {
    private BigInteger result;
    private Fattoriale fattoriale = new Fattoriale();

    @Given("^number (.*) for factorial$")
    public void setNumberDataTable(int a) throws Throwable {
        result = fattoriale.calcola(a);
    }

    @Then("result DataTable factorial is (\\d+)")
    public void resultDataTable(BigInteger c) throws Throwable {
        assertThat(c,is(result));
    }
}
