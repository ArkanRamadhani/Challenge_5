package com.admin.Challenge_5.service;

import com.admin.Challenge_5.bean.Subject;
import com.admin.Challenge_5.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    public SubjectRepository subjectRepo;

    public List<Subject> getAllSubjects() {
        List<Subject> subjects = new ArrayList<>();
        subjectRepo.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjectRepo.save(subject);
    }

    public void updateSubject(Subject subject) {
        subjectRepo.save(subject);
    }

    public void deleteSubject(String id) {
        subjectRepo.deleteById(id);
    }

    public void updateSubject(String id, Subject subject) {
    }

    public void createSubject(Subject subject) {
    }

    public void readSubject(String id, Subject subject) {
    }
}
