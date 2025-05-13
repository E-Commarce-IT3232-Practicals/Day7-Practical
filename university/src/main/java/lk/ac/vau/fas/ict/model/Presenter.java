package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class Presenter extends Person {
	@Id
	private String id;
	private String affiliation;
	private String country;
	private String job_title;
	
	@ManyToMany
	@JoinTable(name="presenter_sessions",
	           joinColumns = @JoinColumn(name="presenter_id"),
	           inverseJoinColumns  = @JoinColumn(name="session_id"))
	
	private List<Session> sessions;
}
