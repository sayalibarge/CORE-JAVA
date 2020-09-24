/*
42.Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
*/
/////////////////////////////////////////////////////////
import java.util.Scanner;
import java.util.*;

class Tile{
	public float Edge_length ;
	Tile(){}
	Tile(float Edge_length){
		this.Edge_length=Edge_length;
	}
	
}
class Floor{
	private float length;
	private float width;
	Floor(){}
	Floor(float length , float width){
		this.length = length;
		this.width=width;
	}
	float totalTiles(Tile t){
		float total=0;
		float area_tile = t.Edge_length * t.Edge_length;
		float area_floor = length * width;
		total = area_floor/area_tile;
		return total;
	}
	
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the tile edge length");
		float el= sc.nextFloat();
		Tile t = new Tile(el);
		System.out.println("enter the floor length and width");
		float length = sc.nextFloat();
		float width = sc.nextFloat();
		Floor f = new Floor(length,width);
		float result = f.totalTiles(t);
		System.out.println("total no of tilles  : "+result);
	}
	
}