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
	
	public void setWindowLocations(JFrame window, JPanel panel) {
		window.setContentPane(panel);
		window.setSize(310, 125);
		window.setLocationByPlatform(true);
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
			  myPanel.setVisible(false);
			  JPanel questionPanel = beg.questionPanel(questions,"AP Java", 100);
			  window.add(questionPanel);
			  questionPanel.setVisible(true);
			  
			  setWindowLocations(window, questionPanel);
			  
			  window.setVisible(true);
			  //myPanel.setVisible(true);
		  }
		});
		first2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    first2.setVisible(false);
		  }
		});
		first3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    first3.setVisible(false);
		  }
		});
		first4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    first4.setVisible(false);
		  }
		});
		second1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    second1.setVisible(false);
		  }
		});
		second2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    second2.setVisible(false);
		  }
		});
		second3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    second3.setVisible(false);
		  }
		});
		second4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    second4.setVisible(false);
		  }
		});
		third1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			
		    third1.setVisible(false);
		  }
		});
		third2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    third2.setVisible(false);
		  }
		});
		third3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    third3.setVisible(false);
		  }
		});
		third4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    third4.setVisible(false);
		  }
		});
		fourth1.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    fourth1.setVisible(false);
		  }
		});
		fourth2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    fourth2.setVisible(false);
		  }
		});
		fourth3.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    fourth3.setVisible(false);
		  }
		});
		fourth4.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  fourth4.setVisible(false);
		  }
		});
	}
}
