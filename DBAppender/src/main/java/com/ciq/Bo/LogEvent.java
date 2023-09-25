package com.ciq.Bo;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "log_events")
public class LogEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logLevel;
    private String message;
	public LogEvent() {
		super();
	}
	public LogEvent(Long id, String logLevel, String message) {
		super();
		this.id = id;
		this.logLevel = logLevel;
		this.message = message;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "LogEvent [id=" + id + ", logLevel=" + logLevel + ", message=" + message
				+ "]";
	}
	
	
    
}
