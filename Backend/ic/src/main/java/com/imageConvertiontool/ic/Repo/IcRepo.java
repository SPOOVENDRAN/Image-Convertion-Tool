package com.imageConvertiontool.ic.Repo;

import com.imageConvertiontool.ic.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IcRepo extends JpaRepository<Employee,Long> {

    @Query("select name from Employee where empid = :empid ")
    public String getNameOnlyByEmpid(String empid);

}
