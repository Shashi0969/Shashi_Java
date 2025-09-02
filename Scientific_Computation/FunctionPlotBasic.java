import java.awt.*;
import javax.swing.*;

public class FunctionPlotBasic extends JPanel 
{
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        // Draw axes
        g2.drawLine(0, height/2, width, height/2); // x-axis
        g2.drawLine(width/2, 0, width/2, height); // y-axis

        // Plot y = sin(x)
        g2.setColor(Color.RED);
        for (int x = -width/2; x < width/2; x++) 
        {
            double scale = 50; // zoom factor
            double rad = x / scale; // convert to radians
            int y = (int) (Math.sin(rad) * scale);

            int screenX = x + width/2;
            int screenY = height/2 - y;

            g2.fillRect(screenX, screenY, 2, 2);
        }
    }
    
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Function Plot: y = sin(x)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new FunctionPlotBasic());
        frame.setVisible(true);
    }
}
