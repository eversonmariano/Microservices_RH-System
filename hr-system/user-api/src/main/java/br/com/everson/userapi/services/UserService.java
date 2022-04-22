package br.com.everson.userapi.services;

import br.com.everson.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();



}
