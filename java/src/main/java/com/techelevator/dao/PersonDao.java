package com.techelevator.dao;

import com.techelevator.model.Person;

import java.util.List;

public interface PersonDao {
    List<Person> getAllActorsFromMovie(int id);
    Person getPersonById(int id);
    Person getPersonByDirectorId(int id);
    Person getPersonByActorId(int id);

    List<Person> getAllPeople();

}
