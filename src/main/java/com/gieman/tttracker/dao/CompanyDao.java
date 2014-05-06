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
public interface CompanyDao {
    
    public Company find(Integer idCompany);
    public List<Company> findAll();
    public void persist(Company company);
    public Company merge(Company company);
    public void remove(Company company);
    
}
