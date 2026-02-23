package com.imageConvertiontool.ic.Service;

import com.imageConvertiontool.ic.Entity.Employee;
import com.imageConvertiontool.ic.Repo.IcRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IcService {

    @Autowired
    IcRepo icRepo;

    public Employee getName(String empid) {
        return icRepo.getNameOnlyByEmpid(empid);
    }
}
