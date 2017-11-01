
package risk;

import java.awt.Graphics2D;

public class Sector {
private static String name;
private static int xvals[];
private static int yvals[];
private static int xpos;
private static int ypos;


Sector(String _name,int _xpos,int _ypos,int _xvals[],int _yvals[]){
name=_name;
xpos=_xpos;
ypos=_ypos;
for(int i=0;i<=xvals.length;i++){
yvals[i]=_yvals[i];
xvals[i]=_xvals[i];
}   
}
public static void draw(Graphics2D g){
drawOutline(xpos,ypos,0.0,1,1,g);    
} 
private static void drawOutline(int xpos,int ypos,double rot,double xscale,double yscale,Graphics2D g) {
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );
        
        g.drawPolyline(xvals, yvals, xvals.length);
        
        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
        }

    
}
