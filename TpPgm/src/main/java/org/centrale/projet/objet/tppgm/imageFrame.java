/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.projet.objet.tppgm;
import java.awt.Graphics;
import javax.swing.JFrame;
/**
 *
 * @author Asmaa
 */
public class imageFrame extends JFrame{

    
    PGMImage img;
    
    public imageFrame(PGMImage img){
        setSize(800, 800);
        setVisible(true);
        this.img=img;
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        img.drawImage(g);
    }
    
    
    
}
 
