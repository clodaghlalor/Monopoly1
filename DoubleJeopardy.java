import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DoubleJeopardy{
	public static void main(String[] args){
		
		FRAME myFRAME = new FRAME();
		myFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    myFRAME.setSize(275,180);
		myFRAME.setVisible(true);
		myFRAME.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        myFRAME.setUndecorated(true);
        myFRAME.setVisible(true);
	}
	
	
}

 class FRAME extends JFrame{
	
	private JLabel myJLabel;
	
	public FRAME(){
		super("Monopoly");
		setLayout(new FlowLayout());
		
		myJLabel = new JLabel("GAME BACKGROUND");
		myJLabel.setToolTipText("blah blah blah");
		add(myJLabel);
	}
	
}
