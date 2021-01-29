
package paneldemo;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PanelDemo extends JFrame implements ActionListener{
    
    public static final int WIDTH = 400;
    public static final int HEIGHT =400;
    
    private JPanel blackPan;
    private JPanel redPan;
    private JPanel whitePan;
    private JPanel colorPan;
    private JPanel btnPan;
    private JButton black,red,white;
    private JMenuBar colorBar;
    private JMenu colorMenu;
    private JMenuItem blacky,whitey,redd;
    
    
     public static void main(String[] args) {
        
        PanelDemo panD = new PanelDemo();
        panD.setVisible(true);
        
    }
    
    
    public PanelDemo(){
        setTitle("Flag Of Kenya");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.cyan);
        setLayout(new BorderLayout());
        
        
        JPanel colorPan = new JPanel();
        colorPan.setLayout(new GridLayout(1,3));
        
        JPanel btnPan = new JPanel();
        btnPan.setLayout(new FlowLayout());
        
        
        JPanel blackPan = new JPanel();
        blackPan.setBackground(Color.gray);
        colorPan.add(blackPan);
        
        JPanel redPan = new JPanel();
        redPan.setBackground(Color.pink);
        colorPan.add(redPan);
        
        JPanel whitePan = new JPanel();
        whitePan.setBackground(Color.gray);
        colorPan.add(whitePan);
        
        
        
        JButton black = new JButton("Black");
        black.setBackground(Color.black);
        black.setForeground(Color.green);
        black.addActionListener(this);
        btnPan.add(black);
        
        JButton red = new JButton("Red");
        red.setBackground(Color.red);
        red.setForeground(Color.green);
        red.addActionListener(this);
        btnPan.add(red);
        
        JButton white = new JButton("White");
        white.setBackground(Color.WHITE);
        white.setForeground(Color.green);
        white.addActionListener(this);
        btnPan.add(white);
        
        
        JMenuBar colorBar = new JMenuBar();
        JMenu colorMenu = new JMenu("Color Changer");
        colorBar.add(colorMenu);
        JMenuItem blacky = new JMenuItem("Blacky");
        blacky.addActionListener(this);
        JMenuItem redd = new JMenuItem("Redy");
        redd.addActionListener(this);
        JMenuItem whitey = new JMenuItem("Whitey");
        whitey.addActionListener(this);
        colorMenu.add(blacky);colorMenu.add(redd);colorMenu.add(whitey);
        
        
        setJMenuBar(colorBar);
        add(colorPan,BorderLayout.CENTER);
        add(btnPan,BorderLayout.SOUTH);
    }

    /**
     *
     * @param e
     */
    @Override
     public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Black"))
            blackPan.setBackground(Color.BLACK);
        else if(e.getActionCommand().equals("White"))
            whitePan.setBackground(Color.white);
        else if(e.getActionCommand().equals("Red"))
            redPan.setBackground(Color.RED);
        else if(e.getActionCommand().equals("Blacky"))
            blackPan.setBackground(Color.BLACK);
        else
            System.out.print("Oooooopss!!!!");
        
    }
   
    

   
    
}

 
