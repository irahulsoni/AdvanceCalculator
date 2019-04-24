package com.example.project;

import java.util.ArrayList;
import module.GenerateRandom;
public class Calculate {

 //   private ArrayList<Answer> answers;
    private int totalSeconds = 0;
    private int elapsedTime = 0;
    private float speed = 0;

        public boolean calculate(int number1, int number2, int userAnswer, String operation, ArrayList<GenerateRandom> list){
            boolean isCorrect=false;
            int result = 0;

            GenerateRandom calculatedResultObj = new GenerateRandom();
            calculatedResultObj.setNumber1(number1);
            calculatedResultObj.setNumber2(number2);
            calculatedResultObj.setOperation(operation);
            calculatedResultObj.setUserAnswer(userAnswer);
            switch (operation){
                case "+":
                    result = number1 + number2;
                    if (result == userAnswer)
                        isCorrect = true;
                    break;
                case "-":
                    result = number1 - number2;
                    if (result == userAnswer)
                        isCorrect = true;
                    break;
                case "*":
                    result = number1 * number2;
                    if (result == userAnswer)
                        isCorrect = true;
                    break;
            }
            calculatedResultObj.setCorrectAnswer(result);
            calculatedResultObj.setCorrect(isCorrect);
            list.add(calculatedResultObj);
            return isCorrect;
        }

        public String getDisplayString(ArrayList<GenerateRandom> list) {


            float duration = 10*list.size();

            float elapsedTime =  (duration / list.size())*10;
            float speed1 = (float) elapsedTime / (float) duration;
            String disp = "";
            float correct = 0;
            float incorrect = 0;
            int NotAns = 0;



            for(GenerateRandom element: list){
                if(element.getUserAnswer() == Integer.MAX_VALUE){
                    NotAns ++;
                }
                if(element.isCorrect()){
                    correct++;
                    disp = disp.concat("\n" + element.getNumber1() + element.getOperation() + element.getNumber2() + " = "+ element.getCorrectAnswer()+"\n" + "Your answer is correct" + "\n" + "----------------");
                }else{
                    incorrect++;
                    disp = disp.concat("\n" +  element.getNumber1() + element.getOperation() + element.getNumber2() + " = "+ element.getUserAnswer()+"\n"+ "Your answer is Incorrect" + "\n" + "Correct answer is "+element.getCorrectAnswer()+"\n"+"----------------");
                }
                elapsedTime += element.getTime();
            }
            String totalq = "\n "+ "Total Questions :" + list.size()+"\n";
            String NOTANS = "\n "+ "Total Questions Not Answered :" + NotAns+"\n";
            String correctString = "\n "+ "Correct answers :" + (correct/list.size())*100+" %"+"\n";
            String incorrectString = "\n "+ "Incorrect answers : "  + (incorrect/list.size())*100+" %"+"\n";
            String totalDuration  = "\n "+ "Total time taken : "+duration  +"Seconds \n";
            String elapsedTime1  = "\n "+ "Total Elapsed time : "+ elapsedTime  +" Seconds\n";
            String speed  = "\n"+"Speed : " + speed1+"\n";

            disp = disp.concat(totalq +NOTANS+ correctString+incorrectString + totalDuration +elapsedTime1 +speed );
            return disp;
        }
}

