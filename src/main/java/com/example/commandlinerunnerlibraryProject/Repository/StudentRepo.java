package com.example.commandlinerunnerlibraryProject.Repository;

import com.example.commandlinerunnerlibraryProject.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
