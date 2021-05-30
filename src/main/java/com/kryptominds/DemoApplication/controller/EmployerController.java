package com.kryptominds.DemoApplication.controller;

import com.kryptominds.DemoApplication.dao.EmployerDocumentDao;
import com.kryptominds.DemoApplication.dao.EmployerProfileDao;
import com.kryptominds.DemoApplication.dto.EmployerDocuments;
import com.kryptominds.DemoApplication.dto.EmployerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployerController {

    @Autowired
    EmployerProfileDao employerProfileDao;
    @Autowired
    EmployerDocumentDao employerDocumentDao;

    @PostMapping("/save/employer")
    String save(@RequestBody EmployerProfile employerProfile) {
        employerProfileDao.save(employerProfile);

        System.out.println("Employee saved successfully");
        return "Done";
    }

    @GetMapping("/getData/{id}")
    public Optional<EmployerProfile> getEmployerDetails(@PathVariable long id) {
        Optional<EmployerProfile> one = employerProfileDao.findById(id);
        return one;
    }

    @DeleteMapping("/getData/{id}")
    public String removeData(@PathVariable long id) {
        employerProfileDao.deleteById(id);
        return "deleted successfully";
    }

    @PutMapping("/update/employer")
    String updateName(@RequestBody EmployerProfile employerProfile) {
        Optional<EmployerProfile> byId = employerProfileDao.findById(employerProfile.getId());
        byId.get().setEmployerName(employerProfile.getEmployerName());
        employerProfileDao.save(byId.get());
        return "Updated";
    }

}
