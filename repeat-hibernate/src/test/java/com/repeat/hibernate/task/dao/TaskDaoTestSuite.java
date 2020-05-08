package com.repeat.hibernate.task.dao;

import com.repeat.hibernate.task.Task;
import com.repeat.hibernate.task.TaskFinancialDetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {

    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Im learning Hibernate";

    @Test
    public void testTaskDaoSave() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        //When
        taskDao.save(task);
        //Then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());

        //clean up
        taskDao.deleteById(id);
    }

    @Test
    public void testFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 6);
        taskDao.save(task);
        int duration = task.getDuration();
        //When
        List<Task> readTask = taskDao.findByDuration(6);


        //Then
        assertEquals(1, readTask.size());

        //clean up
        //int id = readTask.get(0).getId();
        taskDao.deleteAll();
    }

    @Test
    public void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION,30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(100), true));
        //When
        taskDao.save(task);
        int id = task.getId();
        //Then
        assertNotEquals(0,id);
        //clean up
        taskDao.deleteAll();
    }
}