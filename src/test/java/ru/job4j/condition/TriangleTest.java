package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    void whenExist() {
        assertThat (Triangle.exist(2.0, 2.0, 2.0)).isTrue();
    }
    @Test
    void whenNotExist() {
        assertThat (Triangle.exist(1.0, 6.0, 2.0)).isFalse();
    }
}