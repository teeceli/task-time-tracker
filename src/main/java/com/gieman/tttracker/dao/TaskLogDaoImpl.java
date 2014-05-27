/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gieman.tttracker.dao;

import com.gieman.tttracker.domain.Task;
import com.gieman.tttracker.domain.TaskLog;
import com.gieman.tttracker.domain.User;
import java.util.Date;
import java.util.List;
import javax.persistence.TemporalType;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Timur Celikel
 */

@Repository("taskLogDao")
public class TaskLogDaoImpl extends GenericDaoImpl<TaskLog, Integer> implements TaskLogDao {

    public TaskLogDaoImpl() {
        super(TaskLog.class);
    }

    @Override
    public List<TaskLog> findByUser(User user, Date startDate, Date endDate) {
        return em.createNamedQuery("TaskLog.findByUser")
                 .setParameter("user", user)
                 .setParameter("startDate", startDate, TemporalType.DATE)
                 .setParameter("endDate", endDate, TemporalType.DATE)
                 .getResultList();
    }
    
    @Override
    public long findTaskLogCountByTask(Task task) {
        Long count = (Long)
        em.createNamedQuery("TaskLog.findTaskLogCountByTask")
          .setParameter("task", task)
          .getSingleResult();
   
        return count;
    }
    
    @Override
    public long findTaskLogCountByUser(User user) {
        Long count = (Long)
        em.createNamedQuery("TaskLog.findTaskLogCountByUser")
          .setParameter("user", user)
          .getSingleResult();
        return count;
    }
}