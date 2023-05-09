package com.xadmin.SpringBootCrud.controller;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjects")
    public List<Subject> getAllSubjects(){

           return subjectService.getAllSubjects();
    }

    @RequestMapping( value="/subjects/{id}", method = RequestMethod.PUT)
    public void updateSubject(@PathVariable String id,@RequestBody Subject subject){

        subjectService.updateSubject(id,subject);
    }


    @RequestMapping( value="/subjects",method = RequestMethod.POST )
    public void addSubject( @RequestBody Subject subject){

        subjectService.addSubject(subject);
    }

    @RequestMapping( value="/subjects",method = RequestMethod.DELETE)
    public void DeleteSubject(@PathVariable String id ){
        subjectService.deleteSubject(id);
    }

}
