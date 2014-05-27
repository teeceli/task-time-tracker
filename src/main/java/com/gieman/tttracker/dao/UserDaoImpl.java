/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gieman.tttracker.dao;

import com.gieman.tttracker.domain.User;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Timur Celikel
 */

@Repository("userDao")
@Transactional
public class UserDaoImpl extends GenericDaoImpl<User, String> implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        return em.createNamedQuery("User.findAll").getResultList();
    }
    
    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public User findByUsernamePassword(String username, String password) {
        User user = null;
        
        user = (User) em.createNamedQuery("User.findByUsernamePassword")
                 .setParameter("username", username)
                 .setParameter("password", password)
                 .getSingleResult();
        
        return user;
    }
    
    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public User findByUsername(String username) {
        User user = null;
        user = (User) em.createNamedQuery("User.findByUsername")
                             .setParameter("username", username)
                             .getSingleResult();
        
        return user;
    }
    
    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public User findByEmail(String email) {
        
        User user = null;
        
        user = (User) em.createNamedQuery("User.findByEmail")
                             .setParameter("email", email)
                             .getSingleResult();
    
        return user;
    }
}
