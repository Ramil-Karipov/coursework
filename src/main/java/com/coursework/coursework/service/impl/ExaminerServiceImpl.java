package com.coursework.coursework.service.impl;

import com.coursework.coursework.entity.Question;
import com.coursework.coursework.exception.QuestionsAmountExceededException;
import com.coursework.coursework.service.ExaminerService;
import com.coursework.coursework.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (questionService.getAll().size() < amount) {
            throw new QuestionsAmountExceededException();
        }
        return Stream.generate(questionService::getRandom)
                .distinct()
                .limit(amount)
                .collect(Collectors.toList());
    }
}
