//  makes book sql table columns into objects 
//  id and name

package com.db.grad.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * We will use this class to keep track of trades present in a book
 */
@Entity
@Table(name = "book")
public class Book {
    // Id and name of the book variables
    @Id
    private int id;
    private String name;

    //  primary key id to id object
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //  column name to name object
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
