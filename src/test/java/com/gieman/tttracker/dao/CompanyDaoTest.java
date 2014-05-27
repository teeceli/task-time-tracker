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

import com.gieman.tttracker.domain.Company;
import java.util.List;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class CompanyDaoTest extends AbstractDaoForTesting {
    public CompanyDaoTest(){}

    //private CompanyDao companyDao;
    
    @Test
    public void testFind() throws Exception {
        logger.debug("\nSTARTED testFind()\n");
        List<Company> allItems = companyDao.findAll();
        assertTrue(allItems.size() > 0);

        // get the first item in the list
        Company c1 = allItems.get(0);
        int id = c1.getId();
        Company c2 = companyDao.find(id);
        assertTrue(c1.equals(c2));
        logger.debug("\nFINISHED testFind()\n");
    }
    @Test
    public void testFindAll() throws Exception {
        logger.debug("\nSTARTED testFindAll()\n");
        int rowCount = countRowsInTable("ttt_company");
        if(rowCount > 0){
            List<Company> allItems = companyDao.findAll();
            assertTrue("Company.findAll list not equal to row count of table ttt_company", rowCount == allItems.size());
        } else {
            throw new IllegalStateException("INVALID TESTING SCENARIO:Company table is empty");
        }
    
        logger.debug("\nFINISHED testFindAll()\n");
    }
    
    @Test
    public void testPersist() throws Exception {
        logger.debug("\nSTARTED testPersist()\n");
        Company c = new Company();
        final String NEW_NAME = "Persist Test Company name";
        c.setCompanyName(NEW_NAME);
        companyDao.persist(c);
        //assertTrue(c.getId() != null);
        assertTrue(c.getCompanyName().equals(NEW_NAME));
        logger.debug("\nFINISHED testPersist()\n");
    }
    
    @Test
    public void testMerge() throws Exception {
        logger.debug("\nSTARTED testMerge()\n");
        final String NEW_NAME = "Merge Test Company New Name";
        Company c = companyDao.findAll().get(0);
        c.setCompanyName(NEW_NAME);
        c = companyDao.merge(c);
   
        assertTrue(c.getCompanyName().equals(NEW_NAME));
        logger.debug("\nFINISHED testMerge()\n");
    }
    
    @Test
    public void testRemove() throws Exception {
        System.out.println("here");
        logger.debug("\nSTARTED testRemove()\n");
        Company c = companyDao.findAll().get(0);
                System.out.println("here2");

        companyDao.remove(c);
                System.out.println("here3");

        List<Company> allItems = companyDao.findAll();
        assertTrue("Deleted company may not be in findAll List", !allItems.contains(c) );
        logger.debug("\nFINISHED testRemove()\n");
    }
    
    //@Required
    //@Autowired
    //public void setCompanyDao(CompanyDao companyDao) {
    //    this.companyDao = companyDao;
    //}
}