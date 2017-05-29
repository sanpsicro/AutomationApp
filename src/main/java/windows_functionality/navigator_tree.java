package windows_functionality;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

public class navigator_tree {
	
	public DefaultMutableTreeNode top = new DefaultMutableTreeNode("Escenario");
	
	
	public navigator_tree(){
		
		this.createNodes(top);
		
		
	}


	private void createNodes(DefaultMutableTreeNode top2) {
		
		 DefaultMutableTreeNode category = null;
		    DefaultMutableTreeNode book = null;
		    
		    category = new DefaultMutableTreeNode("Caso");
		    top.add(category);
		    
		    //original Tutorial
		    book = new DefaultMutableTreeNode(new escenario("paso","1").toString());
		    category.add(book);
		
	}

}
	

	



