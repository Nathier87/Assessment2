package com.capgemini.Assessment2.Assessment2.Model;

import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private Long id;
    private String contain;

    @ManyToOne
    private Account account;
    @ManyToOne
    private Topic topic;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
