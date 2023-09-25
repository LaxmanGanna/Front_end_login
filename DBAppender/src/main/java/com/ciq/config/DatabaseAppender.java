package com.ciq.config;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import com.ciq.Bo.LogEvent;
import com.ciq.dao.LogEventRepository;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

@Component
public class DatabaseAppender extends AppenderBase<ILoggingEvent> {

	@Autowired
	LogEventRepository eventRepository;
	
    static {
    	System.out.println("11111111111");
    }

    @Override
    @Transactional
    protected void append(ILoggingEvent eventObject) {
    	System.out.println("hi  ");
    	 LogEvent logEvent = new LogEvent();
    	 System.out.println("jai ganesha");
    	    logEvent.setLogLevel("info");
    	    logEvent.setMessage("userlogged in");
    	    System.out.println(logEvent);
    	    // Save the LogEvent to the database using the repository
    	    try {
    	    LogEvent save = eventRepository.save(logEvent);
    	    }catch(Exception e) {
    	    	e.printStackTrace();
    	    }
    	   
    }

    }
