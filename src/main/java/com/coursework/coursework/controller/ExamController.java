package com.coursework.coursework.controller;

import com.coursework.coursework.entity.Question;
import com.coursework.coursework.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amout}")
    public Collection<Question> getRandomQuestion(@PathVariable("amount") int amount) {
        return examinerService.getQuestions(amount);
    }
}
