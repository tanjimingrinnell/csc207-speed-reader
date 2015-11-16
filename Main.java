
import java.awt.*;
import java.io.FileNotFoundException;

public class Main {

	private static String fileName;
	private static int width;
	private static int height;
	private static int fontSize;
	private static int wpm;
	
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		fileName = args[0];
		width = Integer.parseInt(args[1]);
		height = Integer.parseInt(args[2]);
		fontSize = Integer.parseInt(args[3]);
		wpm = Integer.parseInt(args[4]);
		DrawingPanel panel = new DrawingPanel(width, height);
	    Graphics g = panel.getGraphics();
	    Font f = new Font("Courier", Font.BOLD, fontSize);
	    g.setFont(f);

		WordGenerator wg = new WordGenerator(fileName);
	    while (wg.hasNest()) {
		    g.setColor(Color.BLACK);
		    g.drawString(wg.next(), 10, 150);
		    Thread.sleep(60000 / wpm);
		    g.setColor(Color.WHITE);
		    g.fillRect(0, 0, width, height);
	    }
	}
	
	
}
