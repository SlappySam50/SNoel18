
public class Drone {
	
	private String name;
	private int xPos;
	private int yPos;
	private int zPos;
	private String direction;
	
	public Drone(String name, int xPos, int yPos, int zPos, String direction) {
		super();
		this.name = name;
		this.xPos = xPos;
		this.yPos = yPos;
		this.zPos = zPos;
		this.direction = direction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getzPos() {
		return zPos;
	}

	public void setzPos(int zPos) {
		this.zPos = zPos;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	//Public Drone Functions
	//Drone Movement Functions
	public int droneXleft(Drone drone) {
		drone.xPos--;
		if (drone.xPos == -2) {
			drone.xPos = 2;
		}//This make sure the drone is only 1 of 4 possible numbers
		
		return xPos;
	}
	public int droneXright(Drone drone) {
		drone.xPos++;
		
		if (drone.xPos == 3) {
			drone.xPos = -1;
		}//This make sure the drone is only 1 of 4 possible numbers
		
		
		return xPos;
	}
	public int droneYforward(Drone drone) {
		drone.yPos++;
		return yPos;
	}//Moves Drone forward
	public int droneYBack(Drone drone) {
		drone.yPos--;
		return yPos;
	}//Moves Drone Back
	public int droneZUp(Drone drone) {
		drone.zPos++;
		return zPos;
	}//Moves Drone Up
	public int droneZDown(Drone drone) {
		drone.zPos--;
		return zPos;
	}//Moves Drone Down
	public String getCompass(Drone drone) {
		if (drone.xPos == 0) {
			direction = "North";
		}
		else if (drone.xPos == -1) {
			direction = "West";
		}
		else if (drone.xPos == 2) {
			direction = "South";
		}
		else {
			direction = "East";
		}
		return direction;
	}//Grabs the X-Pos to see which direction drone is facing
	
	@Override
	public String toString() {//Drone object formatted
		return "Drone Name: " +name + ", X-Position= " + xPos + ", Y-Position= " + yPos + ", Z-Position= " + zPos + ", Direction Facing= "
				+ direction +".";
	}
	
	

}
