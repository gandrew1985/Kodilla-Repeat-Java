package com.repeat.hibernate.tasklist.dao;

import com.repeat.hibernate.task.Task;
import com.repeat.hibernate.task.TaskFinancialDetails;
import com.repeat.hibernate.tasklist.TaskList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "new list";
    private static final String LISTNAME = "TODO";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("ToDo", DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        //Then
        assertEquals(5, readTaskList.size());
        //clean up
        taskListDao.deleteAll();
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tdf = new TaskFinancialDetails(new BigDecimal(200),false);
        TaskFinancialDetails tdf2 = new TaskFinancialDetails(new BigDecimal(130),false);
        task.setTaskFinancialDetails(tdf);
        task2.setTaskFinancialDetails(tdf2);
        TaskList taskList = new TaskList(LISTNAME,"to do tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //When
        taskListDao.save(taskList);
        int id = taskList.getID();
        //Then
        assertNotEquals(0,id);
        //clean up
        //taskListDao.deleteAll();


    }
}