package com.klu;
import javax.persistence.*;

@Entity
@Table(name="student")
public class student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String name;
	
	public student() {}
		public student(String name) {
			this.name=name;
		}
}