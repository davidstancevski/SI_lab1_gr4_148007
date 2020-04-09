class Canvas{
    private int x;
    private int y;

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

    public Canvas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Canvas() {
    }
}

 public static void main(String args[]){

 List<Point> points = new ArrayList<Point>();
 points.add(new Point(1, 2));
 points.add(new Point(60, 50));
 points.add(new Point(50, 3));
 Collections.sort(points,new Comparator<Point>() {

 public int compare(Point o1, Point o2) {
    return Integer.compare(o1.getX(), o2.getX());
}
});

}
