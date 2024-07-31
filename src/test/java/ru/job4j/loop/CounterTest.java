package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class CounterTest {

    @Test
    void Start0finish15() {
        int start = 0;
        int finish = 15;
        int output = Counter.sum(start, finish);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void Start3finish8() {
        int start = 3;
        int finish = 8;
        int output = Counter.sum(start, finish);
        int expected = 18;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void Start1finish1() {
        int start = 1;
        int finish = 1;
        int output = Counter.sum(start, finish);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void Start8finish1() {
        int start = 8;
        int finish = 1;
        int output = Counter.sum(start, finish);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }
}