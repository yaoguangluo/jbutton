package button;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class demo extends Applet {
	 cfxbutton button;
    public void init(){    
    	cfxbutton button= new cfxbutton("click me",100,40); 
	    button.addActionListener(new ActionListener() 
		   	 	{
		   		 	public void actionPerformed(ActionEvent e) 
		   		 	{
		   		 		System.out.println(1);
		   		 	}
		   	 	});
	    add(button);  

	    cfxbutton button1= new cfxbutton("click me",100,100); 
	    button1.addActionListener(new ActionListener() 
		   	 	{
		   		 	public void actionPerformed(ActionEvent e) 
		   		 	{
		   		 		System.out.println(1);
		   		 	}
		   	 	});
	    add(button1); 

    }
}
