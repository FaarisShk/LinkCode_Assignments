import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


	public class KeyListenerEvent extends Frame implements MouseListener{  
	      Label l;
	      KeyListenerEvent(){  
	        addMouseListener(this);  
	        
		l=new Label();  
	        l.setBounds(20,50,100,20);  
	        add(l);  
	        setSize(300,300);  
	        setLayout(null);  
	        setVisible(true);  
	    }  


	    public void mouseClicked(MouseEvent e) {  
	        l.setText("Mouse Clicked");  
	    }  

	    public void mouseEntered(MouseEvent e) {  
	    	l.setText("Mouse Entered");  
	    }  

	    public void mouseExited(MouseEvent e) {  
	        l.setText("Mouse Exited"); 
	        setVisible(false); 
	    }  

	    public void mousePressed(MouseEvent e) {  
	        l.setText("Mouse Pressed");  
	    }  

	    public void mouseReleased(MouseEvent e) {  
	        l.setText("Mouse Released");  
	    }  

	public static void main(String[] args) {  
	    KeyListenerEvent m1= new KeyListenerEvent();  
	}  

	}  

}
