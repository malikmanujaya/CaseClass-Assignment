object Assignment extends App{

  println("Addition of (0,3) and (0,4) is : "+(Point(0,3)+Point(0,4)))
  println("\nMove (1,3) to (0,3) is : "+(Point(0,3).move(1,3)))
  println("\nDistance between (0,3) and (0,4) is : "+(Point(0,3).distance(Point(0,4))))
  println("\nThe invert of (0,4) is : "+(Point(0,4).invert()))

}
case class Point(x:Int,y:Int){

  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  def distance(that:Point)={
    Math.sqrt(((this.x-that.x)*(this.x-that.x))+((this.y-that.y)*(this.y-that.y)))
  }
  def invert() = Point(y,x)
  override def toString = "("+x+","+y+")"
}
