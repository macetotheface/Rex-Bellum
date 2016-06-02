package CORE;

public class tile {

private int faction;//determines which factions owns the tile
private boolean containsUnit; // determines if thistile is occupied
private terrain ground; //determines the type of terrain on the tile
private boolean fogOfWar;
private int numberOfBuildings;
private boolean contested;


public int getFaction() {
	return faction;
}
public void setFaction(int faction) {
	this.faction = faction;
}
public boolean isContainsUnit() {
	return containsUnit;
}
public void setContainsUnit(boolean containsUnit) {
	this.containsUnit = containsUnit;
}
public terrain getGround() {
	return ground;
}
public void setGround(terrain ground) {
	this.ground = ground;
}
public boolean isFogOfWar() {
	return fogOfWar;
}
public void setFogOfWar(boolean fogOfWar) {
	this.fogOfWar = fogOfWar;
}
public int getNumberOfBuildings() {
	return numberOfBuildings;
}
public void setNumberOfBuildings(int numberOfBuildings) {
	this.numberOfBuildings = numberOfBuildings;
}
public boolean isContested() {
	return contested;
}
public void setContested(boolean contested) {
	this.contested = contested;
}


}
