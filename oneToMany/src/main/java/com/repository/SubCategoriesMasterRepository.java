package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.SubCatagoriesMaster;

@Repository
@Transactional
public interface SubCategoriesMasterRepository extends JpaRepository<SubCatagoriesMaster, Integer> {

}
