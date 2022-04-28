package com.dlithe.repository;

import com.dlithe.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface AgentDAO extends JpaRepository<Agent, Integer> {


}
