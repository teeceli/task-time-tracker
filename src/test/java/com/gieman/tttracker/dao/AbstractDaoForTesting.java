/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gieman.tttracker.dao;

/**
 *
 * @author Timur Celikel
 */
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.

AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-app-context.xml")
public abstract class AbstractDaoForTesting extends AbstractTransactionalJUnit4SpringContextTests {
    
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired(required = true)
    protected CompanyDao companyDao;
    
    @Autowired(required = true)
    protected ProjectDao projectDao;
    
    @Autowired(required = true)
    protected TaskDao taskDao;
    
    @Autowired(required = true)
    protected UserDao userDao;
    
    @Autowired(required = true)
    protected TaskLogDao taskLogDao;
}