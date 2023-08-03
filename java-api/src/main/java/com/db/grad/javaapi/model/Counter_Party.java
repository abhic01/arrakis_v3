//  makes counter_party sql table columns into objects 
//  id and name

package com.db.grad.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Counter_Party")
public class Counter_Party
{
    @Id

    //  creates variables
     private int id;
     private String name;

    //  primary key to id object
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