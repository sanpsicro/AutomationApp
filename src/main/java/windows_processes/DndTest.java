package windows_processes;

/*
Java Swing, 2nd Edition
By Marc Loy, Robert Eckstein, Dave Wood, James Elliott, Brian Cole
ISBN: 0-596-00408-7
Publisher: O'Reilly 
*/
// DragTest.java
//A simple (?) test of the DragSource classes to see if we
//can create a draggable object in a Java application. This version
//works with 1.3 and higher SDKs.
//

import java.awt.BorderLayout;
import java.awt.datatransfer.StringSelection;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragGestureRecognizer;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

public class DndTest extends JFrame {

    JList<String> myList;
    DefaultListModel<String> myListModel;

    public DndTest() {
        myListModel = createStringListModel();
        myList = new JList<String>(myListModel);
        MyMouseAdaptor myMouseAdaptor = new MyMouseAdaptor();
        myList.addMouseListener((MouseListener) myMouseAdaptor);
        myList.addMouseMotionListener((MouseMotionListener) myMouseAdaptor);

        JPanel content = new JPanel();
        content.add(myList);
        this.add(content);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    private class MyMouseAdaptor extends MouseInputAdapter {
        private boolean mouseDragging = false;
        private int dragSourceIndex;

        @Override
        public void mousePressed(MouseEvent e) {
            if (SwingUtilities.isLeftMouseButton(e)) {
                dragSourceIndex = myList.getSelectedIndex();
                mouseDragging = true;
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            mouseDragging = false;
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if (mouseDragging) {
                int currentIndex = myList.locationToIndex(e.getPoint());
                if (currentIndex != dragSourceIndex) {
                    int dragTargetIndex = myList.getSelectedIndex();
                    String dragElement = myListModel.get(dragSourceIndex);
                    myListModel.remove(dragSourceIndex);
                    myListModel.add(dragTargetIndex, dragElement);
                    dragSourceIndex = currentIndex;
                }
            }
        }
    }

    private DefaultListModel<String> createStringListModel() {
        final String[] listElements = new String[] { "Cat", "Dog", "Cow", "Horse", "Pig", "Monkey" };
        DefaultListModel<String> listModel = new DefaultListModel<String>();
        for (String element : listElements) {
            listModel.addElement(element);
        }
        return listModel;
    }

    public static void main(String[] args) {
        new DndTest();
    }
}
           