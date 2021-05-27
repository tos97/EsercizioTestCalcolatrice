import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Test_UNIT_01 {
    @BeforeAll
    static void beforeAll(){
    }

    @BeforeEach
    void beforeEach(){
    }

    @ParameterizedTest(name = "N ricercato: {0}")
    @DisplayName("Fattotiale")
    @CsvSource({"5,120", "7,5040"})
    void Test_001_Fattoriale(int value, int risultato){
        assertEquals(BigInteger.valueOf(risultato), new Fattoriale().calcola(value));
    }

    @ParameterizedTest(name = "N ricercato: {0}")
    @DisplayName("Numero Primo")
    @CsvSource({"5,true", "7,true", "10,false", "15,false"})
    void Test_002_nPrimo(int value, boolean risultato){
        assertEquals(risultato, new nPrimo(value).calcola(2));
    }

    @ParameterizedTest(name = "N righe: {0}")
    @DisplayName("Piramide")
    @CsvSource({"5", "7", "10", "15"})
    void Test_003_Piramide(int value){
        new Piramide(value).stampa();
    }

    @ParameterizedTest(name = "Calcolo: {0} + {1} = {2}")
    @DisplayName("Controllo Somma")
    @CsvSource({"5,2,7", "4,3,7", "4,6,10", "10,5,15"})
    void Test_004_OpSomma(float a, float b, float c){
        Assertions.assertEquals(c, new Operazioni().somma(a,b));
    }

    @ParameterizedTest(name = "Calcolo: {0} - {1} = {2}")
    @DisplayName("Controllo Sottrazione")
    @CsvSource({"5,2,3", "4,3,1", "4,6,-2", "10,5,5"})
    void Test_005_OpSottrazione(float a, float b, float c){
        Assertions.assertEquals(c, new Operazioni().sottrazione(a,b));
    }

    @ParameterizedTest(name = "Calcolo: {0} * {1} = {2}")
    @DisplayName("Controllo Prodotto")
    @CsvSource({"5,2,10", "4,3,12", "4,6,24", "10,5,50"})
    void Test_006_OpProdotto(float a, float b, float c){
        Assertions.assertEquals(c, new Operazioni().moltiplicazione(a,b));
    }

    @ParameterizedTest(name = "Calcolo: {0} / {1} = {2}")
    @DisplayName("Controllo Divisione")
    @CsvSource({"5,2,2.5", "4,2,2", "6,3,2", "10,5,2"})
    void Test_007_Divisione(float a, float b, float c){
        Assertions.assertEquals(c, new Operazioni().divisione(a,b));
    }

    @ParameterizedTest(name = "Matrice: [{0}][{1}]")
    @DisplayName("Matrice")
    @CsvSource({"5,2,0", "4,3,1", "4,6,0", "10,5,0"})
    void Test_008_Matrice(int a, int b, int c){
        Matrice m = new Matrice(new int[a][b]);
        m.carica();
        if(c > 0)
            m.verticale();
        else{
            m.orizzontale();
        }
    }

    @AfterEach
    void afterEach(){}

    @AfterAll
    static void afterAll(){}
}
