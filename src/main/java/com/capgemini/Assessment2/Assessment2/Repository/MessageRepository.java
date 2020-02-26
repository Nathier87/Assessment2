package com.capgemini.Assessment2.Assessment2.Repository;

import com.capgemini.Assessment2.Assessment2.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
