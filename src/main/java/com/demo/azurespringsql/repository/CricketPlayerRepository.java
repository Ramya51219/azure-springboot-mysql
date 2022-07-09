package com.demo.azurespringsql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.azurespringsql.entity.CricketPlayer;


@Repository
public interface CricketPlayerRepository extends JpaRepository<CricketPlayer,Integer>{

}
