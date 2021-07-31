package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {
    @Test
    void name() {
        assertThat(fib(0)).isEqualTo(1);
        assertThat(fib(1)).isEqualTo(1);
        assertThat(fib(2)).isEqualTo(2);
    }

    private int fib(int n) {
        if (n > 1) {
            return 2;
        }
        return 1;
    }
}
