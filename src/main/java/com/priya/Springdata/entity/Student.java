package com.priya.Springdata.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	private int StudId;
	private String Name;
	private int Score;
	public int getStudId() {
		return StudId;
	}
	public void setStudId(int studId) {
		StudId = studId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	
	public Student()
	{
		
	}
	public Student(int StudId, String Name, int Score) {
		super();
		this.StudId=StudId;
	   	this.Name=Name;
	   	this.Score=Score;
	}
	

}
