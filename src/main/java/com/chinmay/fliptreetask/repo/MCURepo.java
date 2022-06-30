package com.chinmay.fliptreetask.repo;

import com.chinmay.fliptreetask.model.MCUModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MCURepo extends JpaRepository<MCUModel,Integer> {

    @Query("select count(movie_id) from MCUModel")
    public Integer checkDataExist();
}
