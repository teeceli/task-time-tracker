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

/**
 *
 * @author Timur Celikel
 */
public interface TaskLogDao extends GenericDao<TaskLog, Integer> {
    public List<TaskLog> findByUser(User user, Date startDate, Date endDate);
    public long findTaskLogCountByTask(Task task);
    public long findTaskLogCountByUser(User user);
}
