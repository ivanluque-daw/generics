package org.generics.ejercicio7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperableTest {
    private Operable<Integer> operable;

    @BeforeEach
    public void setUp() {
        this.operable = new Operable<Integer>() {
            private final int n = 5;

            @Override
            public Integer sumar(Integer o) {
                return n + o;
            }

            @Override
            public Integer restar(Integer o) {
                return n - o;
            }

            @Override
            public Integer multiplicar(Integer o) {
                return n * o;
            }

            @Override
            public Integer dividir(Integer o) {
                if (o == 0) return 0;
                return n / o;
            }
        };
    }

    @Test
    public void testSumar() {
        assertEquals(10, operable.sumar(5));
    }

    @Test
    public void testRestar() {
        assertEquals(0, operable.restar(5));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(25, operable.multiplicar(5));
    }

    @Test
    public void testDividir() {
        assertEquals(1, operable.dividir(5));
    }
}
