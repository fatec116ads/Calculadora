import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FechaJanela extends WindowAdapter  {
	   
	public void windowClosing (WindowEvent evento)
	{
		 System.exit(0);
	}
}
