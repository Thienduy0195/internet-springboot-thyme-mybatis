package com.fsoft.internet.repositories;

import com.fsoft.internet.entities.Computer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class IComputerRepo {

  @Autowired
  private SessionFactory sessionFactory;

  public void save(Computer computer) {
    System.out.println("REPOSITORY" + computer.toString());
    Session session = this.sessionFactory.getCurrentSession();
    session.save(computer);
  }

}
