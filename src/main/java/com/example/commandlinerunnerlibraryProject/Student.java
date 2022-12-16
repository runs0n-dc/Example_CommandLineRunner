package com.example.commandlinerunnerlibraryProject;
import com.example.commandlinerunnerlibraryProject.LibCard;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
     int student_id;
    private String name;
    private int age;
    @CreationTimestamp
    private Date creationDate;
    @UpdateTimestamp
    private Date updatedDate;



    public Student() {
    }

    public Student( String name,int age) {
        this.name = name; this.age=age;// this.student_id=student_id;
    }


    @JoinColumn(name = "card_id")
    @OneToOne
    private LibCard card;

    public LibCard getCard() {
        return card;
    }

    public void setCard(LibCard card) {
        this.card = card;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
