/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gieman.tttracker.dao;

import com.gieman.tttracker.domain.Project;
import java.util.List;

/**
 *
 * @author Timur Celikel
 */
public interface ProjectDao extends GenericDao<Project, Integer> {
    public List<Project> findAll();
}
