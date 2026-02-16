
package com.project.quiz;

import java.util.Scanner;

public class QuestionsService {
	
	Questions questions[] = new Questions[5];
	String[] userAnswers = new String[5];
	int score = 0;
	
	public QuestionsService() {
		questions[0] = new Questions(1, "What is the size of an int in Java?", new Options("2 bytes", "4 bytes", "8 bytes", "Depends on OS"), "4 bytes");
		questions[1] = new Questions(2, "Which keyword is used to inherit a class in Java?", new Options("implement", "extends", "inherits", "super"), "extends");
		questions[2] = new Questions(3, "Which method is called automatically when an object is created?", new Options("main()", "constructor", "start()", "init()") , "constructor");
		questions[3] = new Questions(4, "What is method overloading?", new Options("Same method name with different parameters",
                "Same method name with same parameters",
                "Different method names",
                "Using inheritance") , "Same method name with different parameters");
		questions[4] = new Questions(5, "Which class is the parent of all classes in Java?", new Options("String", "Object", "Class", "Main") , "Object");
		
	}
	
	public void startQuiz() {
		int i = 0;
		for(Questions que: questions) {
			System.out.println("Question: " + que.getQuestionId());
			System.out.println(que.getQuestion());
			que.getOptions().printOptions();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your answer: ");
			userAnswers[i] = sc.nextLine();
			i++;
			for(String userChoice: userAnswers)
				if(que.getAnswer().equalsIgnoreCase(userChoice)) {
					score++;
				}
			
		}
		
		
		
			
	}
	public void getScore() {
		System.out.println("Your Score: " + score);
	}
	
}
