//  makes cook_user sql table columns into objects 
//  book_id and user_id

package com.db.grad.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "book_user")
public class book_user 
{
    @Id

    //  creates variables
    private int book_id;
    private int user_id;

    //  primary key book_id to book_id object

    @Id
    @Column(name="book_id", nullable=false)
    public int getbook_id() {
        return book_id;
    }
    public void setbook_id(int book_id) {
        this.book_id = book_id;
    }
    
    //  primary key user_id to user_id object
    @Column public int getuser_id() {
        return user_id;
    }
    public void setuser_id(int user_id) {
        this.user_id = user_id;
    }


}