package com.coursework.coursework.service;

import com.coursework.coursework.entity.Question;
import com.coursework.coursework.exception.NotUniqueQuestionException;
import com.coursework.coursework.service.impl.JavaQuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaQuestionServiceTest {

    JavaQuestionService service = new JavaQuestionService();

    @Test
    void test_service() {
        Question expected = new Question("q1", "a1");
        service.add(expected);

        Assertions.assertTrue(service.getAll().contains(expected));

        service.remove(expected);

        Assertions.assertTrue(service.getAll().isEmpty());
    }

    @Test
    void unique_check() {
        Question expected = new Question("q1", "a1");
        service.add(expected);
        Assertions.assertThrows(NotUniqueQuestionException.class, () -> {
            service.add(expected);
        });
    }
}
