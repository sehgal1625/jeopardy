package jeopardy;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class BackEndGarbo {
	public JPanel questionPanel(ArrayList<Question> questionList, String category, String pointValue) {
		JPanel questionPanel = new JPanel();
		for(int i = 0; i<questionList.size(); i++) {
			Question questionStats = questionList.get(i);
			if(questionStats.getCategory().equals(category) && questionStats.getPoints() == pointValue) {
				
			}
		}
		
		JLabel cat1 = new JLabel(category);
		JLabel points = new JLabel(pointValue);
		
		questionPanel.add(cat1);
		questionPanel.add(points);
	}
	public boolean enterAnswer(String userAnswer, ArrayList<Question> questionList, String category, int pointValue) {
		for(int i = 0; i<questionList.size(); i++) {
			Question questionStats = questionList.get(i);
			if(questionStats.getCategory.equals(category)) {
				
			}
		}
		
	public boolean
	}
}
