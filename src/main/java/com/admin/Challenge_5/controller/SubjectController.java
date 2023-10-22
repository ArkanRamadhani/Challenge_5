package com.admin.Challenge_5.controller;

import com.admin.Challenge_5.bean.Subject;
import com.admin.Challenge_5.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjects")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }
    @RequestMapping(method = RequestMethod.GET, value = "/subjects/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject)
    {
        subjectService.updateSubject(id, subject);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/subjects")
    public void createSubject(@RequestBody Subject subject) {
        subjectService.createSubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/subjects/{id}")
    public void readSubject(@PathVariable String id, @RequestBody Subject subject)
    {
        subjectService.readSubject(id, subject);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/subjects/{id}")
    public void deleteSubject(@PathVariable String id) {
        subjectService.deleteSubject(id);
    }
}






