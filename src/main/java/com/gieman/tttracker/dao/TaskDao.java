/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gieman.tttracker.dao;

import com.gieman.tttracker.domain.Task;
import java.util.List;

/**
 *
 * @author Timur Celikel
 */
public interface TaskDao extends GenericDao<Task, Integer> {
        public List<Task> findAll();    
}
