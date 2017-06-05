package button;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.SortedSet;

import javax.swing.JFrame;

public class main
{
	
  public static void main(String []argv)
  {
	  ///*\
	 
	  demo d=new demo();
	  JFrame frame = new JFrame("comforx");
	   frame.addWindowListener(new WindowAdapter() {
	     public void windowClosing(WindowEvent e){
	       System.exit(0);
	     }
	   });
	   frame.getContentPane().add(
	     d, BorderLayout.CENTER);
	   frame.setSize(650,520);
	   d.init();
	   d.start();
	   Toolkit kit = Toolkit.getDefaultToolkit();
	   frame.setUndecorated(false);
	   Dimension dimension = kit.getScreenSize();
       frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       frame.setBounds(0, 0, dimension.width, dimension.height);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
      // */
	 /* String txt="dsadskcvdfdsfdsgsgfdsfdsfdsfgfsgdsfdsfdssfdsfgfsgdsfdsfdsdsadsadsadasdgfheyhretgretretdsfgfsgdsfdsfdsdsadsadsadasdgfheyhretgretretsadsadsadasdgfheyhretgretretretretsadsadsadasdgfheyhretgretret"	
	  		;
	      
	          Scanner in = new Scanner(System.in);
	          int n =Integer.parseInt(in.nextLine().split(" ")[0]) ;
	          while(in.hasNext())
	          {
	              String a00 = in.nextLine();    
	              SortedSet<Integer> a0_list = new TreeSet<Integer>();
	              int r0 = Integer.parseInt(a00.split(" ")[0]);
	             //  String txt=a00.split(" ")[1]+" ";
	               for(int i=2;i<a00.split(" ").length;i++)
	                   {
	                  // txt+=a00.split(" ")[i];
	               }
	               System.out.println(txt);  
	               begin();
	              for(int i=0;i<txt.length();i++)
	              {
	                  for(int j=i+1;j<txt.length();j++)
	                  {
	                      if(txt.charAt(i) == txt.charAt(j))
	                      {
	                          compare(txt,txt,i,j,i,j,r0,a0_list);              
	                      }   
	                  } 
	              }
	              
	              System.out.println(a0_list.size()==0?0:a0_list.last());  
	              end();
	          } 
	          */
	      }
	      private static  int compare(String a0,String b0, int i,int j,int i_end, int j_end,int r,SortedSet<Integer> a0_list)
	      {
	                      if(i_end>=j)
	                      {
	                             return 0;    
	                      }
	          
	                      if(i>=j)
	                      {
	                             return 0;    
	                      }
	          
	                              int unsame = 0;
	                              if(i-1>0 && j-1>0)
	                              {
	                                  if(a0.charAt(i-1) != b0.charAt(j-1))   
	                                  {
	                                      unsame +=1;
	                                      if(unsame > r)
	                                      {
	                                           a0_list.add(i_end-i+1+1);
	                                          return 2;
	                                      }
	                                      if(2==prefix(a0,b0,i-1,j-1,i_end,j_end,unsame,r,a0_list)) {
	                                    	     return 2;
	                                       };               
	                                  }else{
	                                      if(unsame > r)
	                                      {
	                                           a0_list.add(i_end-i+1+1);
	                                          return 2;
	                                      }
	                                     if(2== prefix(a0,b0,i-1,j-1,i_end,j_end,unsame,r,a0_list)){
                                    	     return 2;
                                       };       
	                                  }   
	                              }
	                              if(i_end+1<a0.length() && j_end+1<b0.length())
	                              {
	                                  if(a0.charAt(i_end+1) != b0.charAt(j_end+1))   
	                                  {
	                                      unsame +=1;
	                                      if(unsame > r)
	                                      {
	                                           a0_list.add(i_end+1-i+1);
	                                          return 2;
	                                      }
	                                         if(2== prefix(a0,b0,i,j,i_end+1,j_end+1,unsame,r,a0_list)){
	                                    	     return 2;
	                                       };       
	                                  }else{
	                                       if(unsame > r)
	                                      {
	                                            a0_list.add(i_end+1-i+1);
	                                          return 2;
	                                      }
	                                     if(2== prefix(a0,b0,i,j,i_end+1,j_end+1,unsame,r,a0_list)){
                                    	     return 2;
                                       };       
	                                  }   
	                              }
	          return 1;
	      }
	       private static int prefix(String a0,String b0, int i,int j,int i_end, int j_end,int unsame,int r, SortedSet<Integer> a0_list)
	       {
	                      if(i_end>=j)
	                      {
	                             return 0;    
	                      }
	                      if(i>=j)
	                      {
	                             return 0;    
	                      }
	                              if(i-1>0 && j-1>0)
	                              {
	                                  if(a0.charAt(i-1) != b0.charAt(j-1))   
	                                  {
	                                      unsame +=1;
	                                      if(unsame >= r)
	                                      {
	                                          a0_list.add(i_end-i+1+1);
	                                          return 2;
	                                      }
	                                       if(prefix(a0,b0,i-1,j-1,i_end,j_end,unsame,r,a0_list)==2)
	                                       {
	                                    	     return 2;
	                                       };     
	                                          
	                                  }else{
	                                      if(unsame >= r)
	                                      {
	                                          a0_list.add(i_end-i+1+1);
	                                          return 2;
	                                      }     
	                                      if(2== prefix(a0,b0,i-1,j-1,i_end,j_end,unsame,r,a0_list))
	                                    	  {
		                                    	     return 2;
		                                       };
	                                    	    
	                                  }
	                               }
	           
	                              if(i_end+1<a0.length() && j_end+1<b0.length())
	                              {
	                                  if(a0.charAt(i_end+1) != b0.charAt(j_end+1))   
	                                  {
	                                      unsame +=1;
	                                      if(unsame >= r)
	                                      {
	                                          a0_list.add(i_end+1-i+1); 
	                                          return 2;
	                                      }
	                                         if(2== prefix(a0,b0,i,j,i_end+1,j_end+1,unsame,r,a0_list)) {
	                                    	     return 2;
	                                       };           
	                                  }else{
	                                     if(unsame >= r)
	                                      {
	                                         a0_list.add(i_end+1-i+1);  
	                                          return 2;
	                                      }  
	                                      if(2==prefix(a0,b0,i,j,i_end+1,j_end+1,unsame,r,a0_list)) {
	                                    	     return 2;
	                                       };       
	                                  }   
	                              }
	           return 1;
	       }
	  
	    public static long before;
	   	public static long now;
	   	public static void begin()
	   	{
	   	    System.out.println("start: " + (new Date()));
	   	    before = System.currentTimeMillis();
	   	}
	   	public static void end()
	   	{
	   		now = System.currentTimeMillis();
	   		System.out.println("time: " + duration() + " ms");
	   	}
	   	public static long duration()
	   	{
	   		return now-before;
	   	}
}