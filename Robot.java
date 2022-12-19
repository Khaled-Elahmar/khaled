package exercice;

public class Robot {
	private String nom;
	private int x, y;
	private String direction;
	public Robot(String nom) {
	 this.nom = nom;
	this.x = this.y = 0;
	this.direction = "Nord";
	}
	 public void avance()
	    {
	        switch(this.direction)
	        {
	            case "Nord":this.y++;break;
	            case "Est":this.x++;break;
	            case "Sud":this.y--;break;
	            case "Ouest":this.x--;break;
	        }
	    }
	    public void droite()
	    {
	        switch(this.direction)
	        {
	            case "Nord": this.direction="Est";break;
	            case "Est":this.direction="Sud";break;
	            case "Sud":this.direction="Ouest";break;
	            case "Ouest":this.direction="Nord";break;
	        }
	    }
	    public String getPosition() {
			 return
			"("+this.getX()+","+this.getY()+")"+this.direction;
			 }
	// ajouter les getters & setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
	 
	} 
