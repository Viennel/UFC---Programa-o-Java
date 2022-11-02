package tecProg;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class RoboCaçador_Vinicius extends AdvancedRobot
{
	public void run() 
	{	
		setColors(Color.BLACK, Color.PINK, Color.WHITE, Color.YELLOW, Color.PINK);
		
		while(true) 
		{
			setAhead(100);
			setTurnRadarLeft(360);
			execute();
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) 
	{
		setTurnRight(e.getBearing());

		if (e.getDistance() >= 75 && e.getDistance() < 100)
		{
			setFire(1);
		}
		else if (e.getDistance() >= 50 && e.getDistance() < 75)
		{
			setFire(2);
		}
		else if (e.getDistance() < 50)
		{
			setFire(3);
		}
	
		execute();
		
	}
	
public void onHitWall(HitWallEvent e) 
	{
		turnLeft(e.getBearing());
	}	
}
