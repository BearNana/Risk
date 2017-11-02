
package risk;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

public class Board {
private static final Image boardImage=Toolkit.getDefaultToolkit().getImage("./Board.jpg");
private static Sector sectors[][]=new Sector[14][7];
public static void Intilize(){
int xvals[]={-53,4,59,68,41,6,-39,-50,-67,-54};
int yvals[]={-61,-22,-47,-4,52,65,51,-9,-12,-51,-61};
sectors[0][0]=new Sector("Alaska",298,252,xvals,yvals);    
    
    
}
public static void draw(Graphics2D g,Risk obj){
drawBoard(Window.getX(Window.getWidth2()/2),Window.getYNormal(Window.getHeight2()/2),0.0,1,1,g,obj);    
} 
private static void drawBoard(int xpos,int ypos,double rot,double xscale,double yscale,Graphics2D g,Risk obj) {
        int width = boardImage.getWidth(obj);
        int height = boardImage.getHeight(obj);
        
        for (int i=0;i<sectors.length;i++){
        if(sectors[i]!=null){
            sectors[i].draw(g);     }
        }
        
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );
   
        g.drawImage(boardImage,-width/2,-height/2,
        width,height,obj);
        
        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
        }
    
    
}
