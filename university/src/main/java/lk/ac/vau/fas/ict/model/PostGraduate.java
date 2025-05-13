package lk.ac.vau.fas.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class PostGraduate extends Person {
	@Id
	private String id;
	private String institute;
	private String research_interest;
	private String second_degree;
	
	@ManyToMany
	@JoinTable(name = "post_gaduate_sessions",
				joinColumns = @JoinColumn(name = "post_graduate_id"),
				inverseJoinColumns = @JoinColumn(name = "session_id"))
	private List<Session> sessions;
}
