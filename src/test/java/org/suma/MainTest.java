package org.suma;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getNumeroAcarreo_veintisiete_mas_cincuentaynueve_ok() {
        // Given
        Integer numeroA = 27;
        Integer numeroB = 59;
        Integer resultadoEsperado = 1;

        // When
        Integer resultado = Main.getNumeroAcarreo(numeroA, numeroB);

        // Then
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void getNumeroAcarreo_3456_mas_3544_ok() {
        // Given
        Integer numeroA = 3456;
        Integer numeroB = 3544;
        Integer resultadoEsperado = 3;

        // When
        Integer resultado = Main.getNumeroAcarreo(numeroA, numeroB);

        // Then
        assertEquals(resultadoEsperado, resultado);
    }
}