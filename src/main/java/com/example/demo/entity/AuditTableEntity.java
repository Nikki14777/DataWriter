package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AuditTableEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long Id;
	    

	    private String corelationId;
	    private int duration;
	    private String url;
	    private String request;
	    private String response;
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		public String getCorelationId() {
			return corelationId;
		}
		public void setCorelationId(String corelationId) {
			this.corelationId = corelationId;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getRequest() {
			return request;
		}
		public void setRequest(String request) {
			this.request = request;
		}
		public String getResponse() {
			return response;
		}
		public void setResponse(String response) {
			this.response = response;
		}
		
		
	    
	    
}
