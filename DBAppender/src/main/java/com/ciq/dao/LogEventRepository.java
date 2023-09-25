package com.ciq.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ciq.Bo.LogEvent;

@Repository
public interface LogEventRepository extends CrudRepository<LogEvent, Long> {
}
