package com.jsp.Crudoperationonetoonemappingrealation;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long>  {
Page<People> findAll(Pageable pageable);
}
