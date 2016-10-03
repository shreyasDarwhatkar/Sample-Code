import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class SimpleEx extends JFrame {
	 public SimpleEx() {

	        initUI();
	    }

	    private void initUI() {
	        
	    	JButton Button1 = new JButton("Camera On");
	    	
	    	JButton Button2 = new JButton("Captured Image");

	        Button1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent event) {
	                System.out.println("Button 1 clicked");
	            }
	        });
	        Button2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent event) {
	                System.out.println("Button 2 clicked");
	            }
	        });
	        
	        add(Button1);
	        add(Button2);

	        //createLayout(Button1);
	        //createLayout(Button2);
	        //getContentPane().add(Button2);
	        //getContentPane().add(Button1);
	        

	        setTitle("Mahli");
	        setSize(300, 200);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	    }
	    private void createLayout(JComponent... arg) {

	        Container pane = getContentPane();
	        GroupLayout gl = new GroupLayout(pane);
	        pane.setLayout(gl);

	        gl.setAutoCreateContainerGaps(true);

	        gl.setHorizontalGroup(gl.createSequentialGroup()
	                .addComponent(arg[0])
	        );

	        gl.setVerticalGroup(gl.createSequentialGroup()
	                .addComponent(arg[0])
	        );
	    }

	public static void main(String[] args) {
		 EventQueue.invokeLater(new Runnable() {
		        
	            @Override
	            public void run() {
	                SimpleEx ex = new SimpleEx();
	                ex.setVisible(true);
	            }
	        });
	}

}
