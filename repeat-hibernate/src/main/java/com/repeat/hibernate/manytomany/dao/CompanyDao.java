package com.repeat.hibernate.manytomany.dao;

import com.repeat.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CompanyDao extends CrudRepository<Company, Integer> {

}
