package com.xadmin.SpringBootCrud.service;

import com.xadmin.SpringBootCrud.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xadmin.SpringBootCrud.bean.Subject;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    public SubjectRepository subjectRepo;
    public List<Subject> getAllSubjects(){

        List<Subject> subjects = new ArrayList<>();
        subjectRepo.findAll().forEach(subjects::add);
        return subjects;
    }




    public void addSubject(Subject subject) {
        subjectRepo.save(subject);
    }

    public void updateSubject (String id,Subject subject){
        subjectRepo.save(subject);
    }


    public void deleteSubject(@PathVariable String id) {
        subjectRepo.deleteById(id);

    }
}
