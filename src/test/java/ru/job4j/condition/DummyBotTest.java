package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DummyBotTest {
    @Test
    void whenGreetBot() {
        String input = "Hi, Bot.";
        String result = DummyBot.answer(input);
        String expected = "Hi, SmartAss.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String input = "Bye.";
        String result = DummyBot.answer(input);
        String expected = "See you later.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String input = "Gud";
        String result = DummyBot.answer(input);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCytyBot() {
        String input = "what is by city";
        String result = DummyBot.answer(input);
        String expected = "Arhangelsk";
        assertThat(result).isEqualTo(expected);
    }
}