class Point {
	String id;
	double x,y;

	//TODO add new variable
        String boja_na_tocka;

	//TODO constructor
        public Point(String id, double x, double y, String boja_na_tocka){
        this.id=id;
        this.x=x;
        this.y=y;
        this.boja_na_tocka=boja_na_tocka;
        }

	//TODO setters and getters
        public String getId(){
        return id;
        }

        public void setId(String id){
        this.id=id;
        }

        public double getX(){
        return x;
        } 

        public void setX(int x){
        this.x=x;
        }      
       
        public double getY(){
        return y;
        } 

        public void setY(int y){
        this.y=y;
        }  

        public String getBoja(){
        return boja_na_tocka;
        }

        public void setBoja(String boja_na_tocka){
        this.boja_na_tocka=boja_na_tocka;
        } 

	public void move (char xDirection, char yDirection) {
		//TODO
	}

	public void draw () {
		//TODO
	}

        void display(){
         System.out.println(id + " "+ x +" " + y +" " + boja_na_tocka);
         } 

 
        public static void main(String args[]){  
        Point p1 = new Point("1",2,2,"Blue");
        Point p2 = new Point("1",1,3,"Red");  
        
        p1.display();  
        p2.display();  
   }  

}