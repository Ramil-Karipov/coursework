package com.coursework.coursework.service;

import com.coursework.coursework.entity.Question;
import com.coursework.coursework.service.impl.ExaminerServiceImpl;
import com.coursework.coursework.service.impl.JavaQuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Collection;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class ExaminerServiceTest {
    @Mock
    JavaQuestionService javaQuestionService;
    @InjectMocks
    ExaminerServiceImpl examinerService;

    List<Question> javaQuestions = List.of(
            new Question("java_q1", "java_a1"),
            new Question("java_q2", "java_a2"),
            new Question("java_q3", "java_a3")
    );

    @Test
    void test_random_question() {
        Mockito.when(javaQuestionService.getAll()).thenReturn(javaQuestions);
        Mockito.when(javaQuestionService.getRandom())
                .thenReturn(javaQuestions.get(0))
                .thenReturn(javaQuestions.get(1))
                .thenReturn(javaQuestions.get(2));

        Collection<Question> actual = examinerService.getQuestions(1);
        Assertions.assertTrue(javaQuestions.containsAll(actual));

        actual = examinerService.getQuestions(2);
        for (Question question : actual) {
            Assertions.assertTrue(javaQuestions.contains(question));
        }
    }

}
