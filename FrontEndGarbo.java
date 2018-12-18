package jeopardy;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class FrontEndGarbo {
	BackEndGarbo beg = new BackEndGarbo();
	public void inputQuestions(String file, ArrayList<Question> a) throws IOException, FileNotFoundException {
        Scanner inF = new Scanner(new File(file));
        while (inF.hasNextLine()) {
			String category = inF.nextLine();
			int points = inF.nextInt();
			inF.nextLine();
			String question = inF.nextLine();
			String answer = inF.nextLine();
			a.add(new Question(category, points, question, answer));
		}
        inF.close();
	}
	public void startWindow(ArrayList<Question> questions) {
		
		JFrame window = new JFrame();
		window.setSize(600,400);
		window.setTitle("Jeopardy");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel myPanel = new JPanel();
		
		JButton first1 = new JButton("100");
		JButton first2 = new JButton("200");
		JButton first3 = new JButton("300");
		JButton first4 = new JButton("400");
		JButton second1 = new JButton("100");
		JButton second2 = new JButton("200");
		JButton second3 = new JButton("300");
		JButton second4 = new JButton("400");
		JButton third1 = new JButton("100");
		JButton third2 = new JButton("200");
		JButton third3 = new JButton("300");
		JButton third4 = new JButton("400");
		JButton fourth1 = new JButton("100");
		JButton fourth2 = new JButton("200");
		JButton fourth3 = new JButton("300");
		JButton fourth4 = new JButton("400");
		
		//JLabel title = new JLabel("Jeopardy");
		JLabel cat1 = new JLabel("Java");
		JLabel cat2 = new JLabel("Pokemon");
		JLabel cat3 = new JLabel("Oranges");
		JLabel cat4 = new JLabel("Minecraft");
		
		//myPanel.add(title);
		myPanel.add(cat1);
		myPanel.add(cat2);
		myPanel.add(cat3);
		myPanel.add(cat4);
		myPanel.add(first1);
		myPanel.add(second1);
		myPanel.add(third1);
		myPanel.add(fourth1);
		myPanel.add(first2);
		myPanel.add(second2);
		myPanel.add(third2);
		myPanel.add(fourth2);
		myPanel.add(first3);
		myPanel.add(second3);
		myPanel.add(third3);
		myPanel.add(fourth3);
		myPanel.add(first4);
		myPanel.add(second4);
		myPanel.add(third4);
		myPanel.add(fourth4);

		myPanel.setLayout(new GridLayout(5,4));

		window.add(myPanel);
		window.setVisible(true);
		
		first1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  first1.setVisible(false);
			  myPanel.setVisible(false);
			  JPanel questionPanel = beg.questionPanel(questions,"AP Java", 100, myPanel, window);
			  window.add(questionPanel);
			  questionPanel.setVisible(true);
			  questionPanel.setLayout(new GridLayout(5,1));			  
		  }
		});
		first2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    first2.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"AP Java", 200, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		first3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    first3.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"AP Java", 300, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		first4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    first4.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"AP Java", 400, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		second1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    second1.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"Pokemon", 100, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		second2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    second2.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"Pokemon", 200, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		second3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    second3.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"Pokemon", 300, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		second4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    second4.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"Pokemon", 400, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		third1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			
		    third1.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"Oranges", 100, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		third2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    third2.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"Oranges", 200, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		third3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    third3.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"Oranges", 300, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		third4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    third4.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"Oranges", 400, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		fourth1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    fourth1.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"Minecraft", 100, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		fourth2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    fourth2.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"Minecraft", 200, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		fourth3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    fourth3.setVisible(false);
		    myPanel.setVisible(false);
			JPanel questionPanel = beg.questionPanel(questions,"Minecraft", 300, myPanel, window);
			window.add(questionPanel);
			questionPanel.setVisible(true);
			questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
		fourth4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  fourth4.setVisible(false);
			  myPanel.setVisible(false);
			  JPanel questionPanel = beg.questionPanel(questions,"Minecraft", 400, myPanel, window);
			  window.add(questionPanel);
			  questionPanel.setVisible(true);
			  questionPanel.setLayout(new GridLayout(5,1));		
		  }
		});
	}
}
