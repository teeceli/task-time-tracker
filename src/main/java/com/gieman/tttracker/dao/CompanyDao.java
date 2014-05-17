/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gieman.tttracker.dao;

import com.gieman.tttracker.domain.Company;
import java.util.List;

/**
 *
 * @author Timur Celikel
 */
public interface CompanyDao extends GenericDao<Company, Integer>{
    // I'm assuming any class that implements this interface will still have to declare the persist, merge, and remove methods
    public List<Company> findAll();
  
}
