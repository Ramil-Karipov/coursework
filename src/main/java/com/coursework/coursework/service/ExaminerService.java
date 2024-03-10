package com.coursework.coursework.service;

import com.coursework.coursework.entity.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);

}

