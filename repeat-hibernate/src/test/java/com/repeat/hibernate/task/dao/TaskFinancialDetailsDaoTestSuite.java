package com.repeat.hibernate.task.dao;

import com.repeat.hibernate.task.TaskFinancialDetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {

    @Autowired
    private TaskFinancialDetailsDao financialDetailsDao;

    @Test
    public void testFindByPaid() {
        //Given
        TaskFinancialDetails financialDetails = new TaskFinancialDetails(new BigDecimal(100),true);
        financialDetailsDao.save(financialDetails);
        boolean paid = financialDetails.isPaid();
        //When
        List<TaskFinancialDetails> financialDetailsList = financialDetailsDao.findByPaid(true);
        //Then
        assertEquals(1,financialDetailsList.size());
        //Clean up
        financialDetailsDao.deleteAll();
    }
}