// This class defines I/O variables and functions used by lexical analyzers and parsers.

import java.io.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class BMEC extends JFrame implements ActionListener, WindowListener, ItemListener{
	private JButton btn = new JButton("Done");
	private JPanel pnl = new JPanel();
	private JFrame frame = new JFrame();

	private boolean m202 = false, m203 = false, p208 = false,
					bm22 = false, m391 = false, c229 = false, me24 = false,
					bm20 = false, m392 = false, c341 = false, bm30 = false,
					me33 = false, b321 = false, bm501 = false, bm503 = false,
					bm40 = false, bm31 = false, b229 = false, bm502 = false,
					bm505 = false, e3 = false, bm45 = false, bm46 = false;

	private JCheckBox m202check = new JCheckBox("Math 20200"),
					m203check = new JCheckBox("Math 20300"), p208check = new JCheckBox("Phys 20800"),
					bm22check = new JCheckBox("BME 22000"), m391check = new JCheckBox("Math 39100"),
					c229check = new JCheckBox("ChE 22900"), me24check = new JCheckBox("ME 24600"),
					bm20check = new JCheckBox("BME 20500"), m392check = new JCheckBox("Math 39200"),
					c341check = new JCheckBox("ChE 34100"), bm30check = new JCheckBox("BME 30500"),
					me33check = new JCheckBox("ME 33000"), b321check = new JCheckBox("Bio 32100"),
					bm501check = new JCheckBox("BME 50100"),	bm503check = new JCheckBox("BME 50300"),
					bm40check = new JCheckBox("BME 40500"), bm31check = new JCheckBox("BME 31000"),
					b229check = new JCheckBox("Bio 22900"), bm502check = new JCheckBox("BME 50200"),

					bm505check = new JCheckBox("BME 50500"), e3check = new JCheckBox("Engr 30000"),
					bm45check = new JCheckBox("BME 45000"), bm46check = new JCheckBox("BME 46000");

	public BMEC(){
		setLayout(new GridLayout(7,5));

		add(m202check);		m202check.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange() == ItemEvent.SELECTED){
					m203check.setEnabled(m202check.isSelected());
				}
			}
		});

		add(m203check);		m203check.setEnabled(false);
		m203check.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange() == ItemEvent.SELECTED){
					p208check.setEnabled(m203check.isSelected());
					bm22check.setEnabled(m203check.isSelected());
					m391check.setEnabled(m203check.isSelected());
					m392check.setEnabled(m203check.isSelected());
				}
			}
		});


		add(p208check);		p208check.setEnabled(false);
		add(bm22check);		bm22check.setEnabled(false);

		add(m391check);		m391check.setEnabled(false);
		add(c229check);		c229check.setEnabled(false);
		add(me24check);
		add(bm20check);		bm20check.setEnabled(false);

		add(m392check);		m392check.setEnabled(false);
		add(c341check);		c341check.setEnabled(false);
		add(bm30check);		bm30check.setEnabled(false);
		add(me33check);		me33check.setEnabled(false);
		add(b321check);

		add(bm501check);	bm501check.setEnabled(false);
		add(bm503check);	bm503check.setEnabled(false);
		add(bm40check);		bm40check.setEnabled(false);
		add(bm31check);		bm31check.setEnabled(false);
		add(b229check);

		add(bm502check);	bm502check.setEnabled(false);
		add(bm505check);	bm505check.setEnabled(false);
		add(e3check);			e3check.setEnabled(false);
		add(bm45check);		bm45check.setEnabled(false);
		add(bm46check);		bm46check.setEnabled(false);

		Panel pnl = new Panel();

		add(pnl);
		pnl.add(btn);

		btn.addActionListener(this);
		addWindowListener(this);
		setTitle("Biomedical Engineering Curriculum Checklist");
		setSize(450, 350);
		setVisible(true);
	}


	public static void main(String[] args){
			new BMEC();
	}

	@Override
	public void actionPerformed(ActionEvent evt){
		System.out.println("Hey");
	}

	@Override
	public void windowClosing(WindowEvent evt){
		System.exit(0);
	}

	@Override public void itemStateChanged(ItemEvent e){}

	@Override public void windowOpened(WindowEvent evt){}
	@Override public void windowClosed(WindowEvent evt){}
	@Override public void windowIconified(WindowEvent evt){}
	@Override public void windowDeiconified(WindowEvent evt){}
	@Override public void windowActivated(WindowEvent evt){}
	@Override public void windowDeactivated(WindowEvent evt){}

}
