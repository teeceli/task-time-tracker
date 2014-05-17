/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gieman.tttracker.dao;

import com.gieman.tttracker.domain.User;
import java.util.List;

/**
 *
 * @author Timur Celikel
 */
public interface UserDao extends GenericDao<User, String> {
    public List<User> findAll();  
    public User findByUsernamePassword(String username, String password);
    public User findByUsername(String username);
    public User findByEmail(String email);
}
