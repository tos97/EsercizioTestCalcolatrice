package com.calcolatrice.stepCucumber;

import com.calcolatrice.nPrimo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class nPrimoStep {
    private boolean result;
    private nPrimo primo = null;

    @Given("^number (\\d+) for primo number$")
    public void setNumberDataTable(int a) throws Throwable {
        primo = new nPrimo(a);
        result = primo.calcola(2);
    }

    @Then("result DataTable primo number is (.*)")
    public void resultDataTable(boolean c) throws Throwable {
        assertThat(c,is(result));
    }
}
