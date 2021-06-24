package com.calcolatrice.stepCucumber;

import com.calcolatrice.Operazioni;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalcolatriceStep {
    private float resultSum = 0;
    private float resultDif = 0;
    private float resultDiv = 0;
    private float resultMpy = 0;
    private float number1;
    private float number2;
    private Operazioni operazioni = new Operazioni();

    @Given("^number (\\d+) and (\\d+)$")
    public void setNumberDataTable(int a,int b) throws Throwable {
        resultSum = operazioni.somma(a,b);
        resultDif = operazioni.sottrazione(a,b);
        resultDiv = operazioni.divisione(a,b);
        resultMpy = operazioni.moltiplicazione(a,b);
    }

    @Then("result dif DataTable is (\\d+)")
    public void resultDifDataTable(float c) throws Throwable {
        assertThat(c,is(resultDif));
    }

    @Then("result div DataTable is (\\d+)")
    public void resultDivDataTable(float c) throws Throwable {
        assertThat(c,is(resultDiv));
    }

    @Then("result mpy DataTable is (\\d+)")
    public void resultMpyDataTable(float c) throws Throwable {
        assertThat(c,is(resultMpy));
    }
    @Then("result sum DataTable is (\\d+)")
    public void resultSumDataTable(float c) throws Throwable {
        assertThat(c,is(resultSum));
    }


    @Given("^two number (.*) and (.*)$")
    public void setNumber(int a,int b){
        number1 = a;
        number2 = b;
    }

    @Then("^result sum is (.*)$")
    public void resultSum(float c){
        assertThat(c,is(operazioni.somma(number1,number2)));
    }

    @Then("^result dif is (.*)$")
    public void resultDif(float c){
        assertThat(c,is(operazioni.sottrazione(number1,number2)));
    }

    @Then("^result mpy is (.*)$")
    public void resultMpy(float c){
        assertThat(c,is(operazioni.moltiplicazione(number1,number2)));
    }

    @Then("^result div is (.*)$")
    public void resultDiv(float c){
        assertThat(c,is(operazioni.divisione(number1,number2)));
    }
}
