//  makes counter_party sql table columns into objects
//  id, role, and email

package com.db.grad.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users
{
    @Id
    //  creates variables
     private int id;
     private String role;
     private String email;


    @Id

    //  primary key id to id object
    @Column(name = "id", nullable = false)
     public int getId() {
         return id;
     }
     public void setId(int id) {
         this.id = id;
     }


     //  column  role to  role object
     @Column(name = " role", nullable = false)
     public String getRole() {
         return  role;
     }
     public void setRole(String  role) {
         this. role =  role;
     }


     //  column  email to  email object
     @Column(name = " email", nullable = false)
     public String getEmail() {
         return  email;
     }
     public void setEmail(String  email) {
         this. email =  email;
     }
    }