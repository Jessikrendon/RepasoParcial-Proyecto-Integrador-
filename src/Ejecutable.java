import processing.core.PApplet;

public class Ejecutable extends PApplet {
	

 Logica log;

	public Ejecutable(){
		
	}


	public static void main(String[] args) {
		PApplet.main("Ejecutable");
	}
	
	
	public void settings(){
		size (500,500);
	}
	
	
	public void setup(){
		log= new Logica (this);
	}
	

	public void draw(){
		background(255);
	}
}
