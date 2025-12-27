package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Book extends Item {

    private String actor;
    private String isbn;

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
