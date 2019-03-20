/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
/**
 *
 * @author r34g4n
 */
public class Person {

    private String name, gender;
    int yob, choice;
    
    public Person(){
        name = JOptionPane.showInputDialog("What's your name? ");
        gender = JOptionPane.showInputDialog("Hi " + name +"! What's your gender? " );
        yob = Integer.parseInt(JOptionPane.showInputDialog("Almost there "+ name + ". What's your year of birth? "));
        JOptionPane.showMessageDialog(null, "Person created successfully!");
    }
    
    public void getName(){
        JOptionPane.showMessageDialog(null, "The person's name was " + name);
    }
    
    public void setName(){
		name = JOptionPane.showInputDialog("What's your new name?");
		JOptionPane.showMessageDialog(null, "Okay, " + name + "!");
	}
    public void exitApp(){
        int x = JOptionPane.showConfirmDialog(null, "Hey Buddy! You really want to exit? ");
        if(x == 0){
            JOptionPane.showMessageDialog(null, "Goodbye, buddy!");
            System.exit(0);
        }
    }
    public void showMenu(){
        choice = Integer.parseInt(JOptionPane.showInputDialog("Hey there, what are you up to?"
                + "\n\t1)View name.\n\t"
                + "2)Change name.\n\t"
                + "3)Change year of birth.\n\t"
                + "4)Check if I can qualify for an ID.\n\t"
                + "99)Exit"));
                applyChoice();
    }

    public void setYob(){
		yob = Integer.parseInt(JOptionPane.showInputDialog("What's your new Year of Birth?"));
		JOptionPane.showMessageDialog(null, "Okay, " + name + "! Your new YOB is " + yob);
    }

    public void checkEligibility(){
        if(2019 - yob >= 18){
            JOptionPane.showMessageDialog(null, "Congrats " + name + "! You're qualified for an ID.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry," + name + ". You are not qualified for an ID.");
        }
    }
    public void applyChoice(){
        switch(choice){
            case 1:
				getName();
				break;
            case 2:
				setName();
				break;
            case 3:
                setYob();
                break;
            case 4:
                checkEligibility();
                break;
            case 99:
                exitApp();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Incorrect choice. Please Try again!");
                showMenu();
        }
    }
    public static void main(String[] args) {
         Person person1 = new Person();
         person1.showMenu();
    }
}
