package com.example.commandlinerunnerlibraryProject;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Library_Card")
public class LibCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    private int fine;
    @CreationTimestamp
     Date creationDate;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public LibCard() {
    }

    public LibCard( int fine) {
      // this.id = id;
        this.fine = fine;
    }

    public int getId() {
        return id;
    }

    public int getFine() {
        return fine;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }
}
