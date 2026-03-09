package com.imageConvertiontool.ic.Repo;

import com.imageConvertiontool.ic.Entity.IC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IcRepo extends JpaRepository<IC,Long> {

}
