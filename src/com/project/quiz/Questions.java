package com.project.quiz;

public class Questions {
	private int questionId;
	private String question;
	private Options options;
	private String answer;
	
	
	public Questions(int questionId, String question, Options options, String answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.options = options;
		this.answer = answer;
	}


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


	public Options getOptions() {
		return options;
	}


	public void setOptions(Options options) {
		this.options = options;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	

}

