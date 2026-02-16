package com.project.quiz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuestionsService questionService = new QuestionsService();
		questionService.startQuiz();
		questionService.getScore();

	}

}
