/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricochet.robots;



import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//This Implements the MenuButton of types start game, load game etc.
public class MenuButtons extends JButton implements ActionListener {
    
    public MenuButtons(){
        
        this.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent event){
        
        String name = event.getActionCommand();
        
        switch(name){
            
            case "Start Game":
                new Board( 16, 16,false);
                break;
                
            case "Load Game":
                new Board(16,16,true);
                break;
                
            case "Board Settings":
                new BoardSettings();
                break;
                
            case "Player Settings":
                new PlayerSettings();
                break;
                
            case "Quit Game":
                System.exit(0);
                break;
            
        }
        
    }
    
    
    
}
