package com.map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	
	@Id
	@Column(name="question_id")
	private int questionId;
	private String question;
	
	@OneToMany(mappedBy ="question",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Answer> Answers;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	public Question(int questionId, String question, List<Answer> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		Answers = answers;
	}
	public List<Answer> getAnswers() {
		return Answers;
	}
	public void setAnswers(List<Answer> answers) {
		Answers = answers;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
