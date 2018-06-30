package guiTTT;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GUIframeTTT extends JFrame
{
	//Attributes
	private GUIpanelTTT m_GUIpanelTTT;
	
	public GUIframeTTT()
	{
		//Customize
		super.setTitle("Tic Tac Toe!");
		setLayout(new GridLayout(1, 1));
		setSize(1300, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Initialize
		m_GUIpanelTTT = new GUIpanelTTT();
		
		//Add
		add(m_GUIpanelTTT);
		
		//SetVisibility
		setVisible(true);
	}
}
