
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 
 * ButtonDemo.java requires the following files:
 *   images/right.gif
 *   images/middle.gif
 *   images/left.gif
 */
public class ButtonDemo extends JPanel
                        implements ActionListener {
    protected JButton b1, b2, b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    protected JTextArea ta;
    protected JScrollPane sp;
    protected JFileChooser fc ;
    public ButtonDemo() {
    	fc=new JFileChooser("Minerals.json");
    	File file= fc.getSelectedFile();
    	Dimension d=new Dimension(1500,500);
    	setPreferredSize( d);
    	setLocation(0, 0);
    	setBorder(BorderFactory.createLineBorder(Color.black));
    	ta=new JTextArea(8,100);
    	ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setLocation(300, 300);
        sp = new JScrollPane(ta);  


        b1 = new JButton("MAHLI_Camera_ON");
        b1.setAlignmentX(LEFT_ALIGNMENT);
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
        b1.setMnemonic(KeyEvent.VK_D);
        b1.setActionCommand("MAHLI_Camera_ON");

        b2 = new JButton("MAHLI_NightIllumination_ON");
        b2.setAlignmentX(LEFT_ALIGNMENT);
        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
        b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setMnemonic(KeyEvent.VK_M);

        b3 = new JButton("MAHLI_NightIllumination_OFF");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setActionCommand("MAHLI_NightIllumination_OFF");
        //b3.setEnabled(false);
        
        b4 = new JButton("MAHLI_AutoFocus_ON");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b4.setMnemonic(KeyEvent.VK_E);
        b4.setActionCommand("MAHLI_AutoFocus_ON");
        //b4.setEnabled(false);
        
        b5 = new JButton("MAHLI_AutoFocus_OFF");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b5.setMnemonic(KeyEvent.VK_E);
        b5.setActionCommand("MAHLI_AutoFocus_OFF");
        //b5.setEnabled(false);
        
        b6 = new JButton("MAHLI_Video_ON");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b6.setMnemonic(KeyEvent.VK_E);
        b6.setActionCommand("MAHLI_Video_ON");
        //b6.setEnabled(false);
        
        b7 = new JButton("MAHLI_Video_OFF");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b7.setMnemonic(KeyEvent.VK_E);
        b7.setActionCommand("MAHLI_Video_OFF");
        //b7.setEnabled(false);
        
        b8 = new JButton("MAHLI_Image_Capture");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b8.setMnemonic(KeyEvent.VK_E);
        b8.setActionCommand("MAHLI_Image_Capture");
        //b8.setEnabled(false);
        
        b9 = new JButton("MAHLI_Image_store");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b9.setMnemonic(KeyEvent.VK_E);
        b9.setActionCommand("MAHLI_Image_store");
        //b9.setEnabled(false);
        
        b10 = new JButton("MAHLI_Image_read");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b10.setMnemonic(KeyEvent.VK_E);
        b10.setActionCommand("MAHLI_Image_read");
        //b10.setEnabled(false);
        
        b11 = new JButton("MAHLI_Camera_OFF");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b11.setMnemonic(KeyEvent.VK_E);
        b11.setActionCommand("MAHLI_Camera_OFF");
        //b11.setEnabled(false);
        
        b12 = new JButton("EXIT");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        b12.setMnemonic(KeyEvent.VK_E);
        b12.setActionCommand("EXIT");
        //b12.setEnabled(false);
        


        //Listen for actions on buttons 1 and 3.
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);

        b1.setToolTipText("Click this button to disable the middle button.");
        b2.setToolTipText("This middle button does nothing when you click it.");
        b3.setToolTipText("Click this button to enable the middle button.");
        

        //Add Components to this container, using the default FlowLayout.
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(sp);
        //add(ta);
    }

    public void actionPerformed(ActionEvent e) {
        if ("MAHLI_Camera_ON".equals(e.getActionCommand())) {
            System.out.println("MAHLI_Camera_ON");
            //ta.setText("MAHLI_Camera_ON");
            ta.append("MAHLI_Camera_ON");
            ta.append("\n");
        }
        else if("MAHLI_Camera_OFF".equals(e.getActionCommand()))
        {
        	System.out.println("MAHLI_Camera_OFF");
        	ta.append("MAHLI_Camera_OFF");
        }
        else if("MAHLI_NightIllumination_ON".equals(e.getActionCommand())){
        	System.out.println("MAHLI_NightIllumination_ON");
        	ta.append("MAHLI_NightIllumination_ON");
        }
        else if("MAHLI_NightIllumination_OFF".equals(e.getActionCommand())){
        	System.out.println("MAHLI_NightIllumination_OFF");
        	
        }else if("MAHLI_AutoFocus_ON".equals(e.getActionCommand())){
        	System.out.println("MAHLI_AutoFocus_ON");
        	
        }
        else if("MAHLI_AutoFocus_OFF".equals(e.getActionCommand())){
        	System.out.println("MAHLI_AutoFocus_OFF");
        	
        }
        else if("MAHLI_NightIllumination_ON".equals(e.getActionCommand())){
        	System.out.println("MAHLI_AutoFocus_OFF");
        	
        }
        else if("MAHLI_Video_ON".equals(e.getActionCommand())){
        	System.out.println("MAHLI_Video_ON");
        	
        }
        else if("MAHLI_Video_OFF".equals(e.getActionCommand())){
        	System.out.println("MAHLI_Video_OFF");
        	
        }
        else if("MAHLI_Image_Capture".equals(e.getActionCommand())){
        	System.out.println("MAHLI_Image_Capture");
        	
        }
        else if("MAHLI_Image_store".equals(e.getActionCommand())){
        	System.out.println("MAHLI_Image_store");
        	
        }
        else if("MAHLI_Image_read".equals(e.getActionCommand())){
        	System.out.println("MAHLI_Image_read");
        	
        }
        else if("EXIT".equals(e.getActionCommand())){
        	System.out.println("EXIT");
        	
        }
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = ButtonDemo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it.  For thread safety, 
     * this method should be invoked from the 
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("ButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        ButtonDemo newContentPane = new ButtonDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }
    
    static String generateTransactions(String input) {
        HashMap<String,Integer> map = new HashMap<String,Integer>(); 
        String[] stringParts = input.split(":");     
        String newString = new String();
        for(String s : stringParts[0].split("\\|")){
               String[] sElements = s.split(","); 
                map.put(sElements[0],Integer.parseInt(sElements[2]));
            }
        
        
        String[] strElemnts= stringParts[1].split("\\|");
        ArrayList<String> newList = new ArrayList<String>();
        for(String obj : strElemnts){
            newList.add(obj);
        }
        Collections.sort(newList);
        for(String s : newList){
        	String[] sElements = s.split(","); 
             if(map.containsKey(sElements[0])){
            	 if(map.get(sElements[0])>Integer.parseInt(sElements[2])){
            		 Double diff = map.get(sElements[0]) - Double.parseDouble(sElements[2]); 
            		 newString = newString + "[SELL, " + sElements[0]+", "+ diff +"], ";
            	 }
            	 else{
            		 Double diff = Double.parseDouble(sElements[2])-map.get(sElements[0]);
            		 newString = newString + "[Buy, " + sElements[0]+", "+ diff +"], ";
            	 }
             }
         }
        
        return null;
    }
	
	static int countHoldings(String input) {
        int count = 0;
        String[] stringParts = input.split("\\|"); 
        for(String obj : stringParts){
            String [] elements = obj.split(",");
            System.out.println(elements);
            count =count + Integer.parseInt(elements[2]);
        }
        return count;

    }
	
	
	
	
	public String reverseVowels(String s) {
	    ArrayList<Character> vowList = new ArrayList<Character>();
	    vowList.add('a');
	    vowList.add('e');
	    vowList.add('i');
	    vowList.add('o');
	    vowList.add('u');
	    vowList.add('A');
	    vowList.add('E');
	    vowList.add('I');
	    vowList.add('O');
	    vowList.add('U');
	 
	    char[] arr = s.toCharArray();
	 
	    int i=0; 
	    int j=s.length()-1;
	 
	    while(i<j){
	        if(!vowList.contains(arr[i])){
	            i++;
	            continue;
	        }
	 
	        if(!vowList.contains(arr[j])){
	            j--;
	            continue;
	        }
	 
	        char t = arr[i];
	        arr[i]=arr[j];
	        arr[j]=t;
	 
	        i++;
	        j--; 
	    }
	 
	    return new String(arr);
	}
	
	
	void convertToChar(String s){
		for(char c:s.toCharArray()){
			System.out.println(c);
		}
		
	}

}