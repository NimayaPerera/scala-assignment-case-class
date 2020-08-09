case class Point(a : Int , b : Int)
{

  def x : Int  = a;
  def y : Int = b;


  def +( r : Point) = Point(this.x + r.x , this.y + r.y)

  def move ( dx : Int , dy : Int) = Point(this.x + dx , this.y + dy)

  def inverse()  = Point(this.y , this.x)

  def finddistance(r : Point) : Double= scala.math.sqrt((scala.math.pow(this.x - r.x,2) + scala.math.pow(this.y - r.y,2) ))


}
object case_class extends App {

  val  x = Point(1,2)
  val y = Point(2,3)

  val add = x + y
  val move = x.move(5,5)
  val inverse1 =  x.inverse()
  val inverse2 = y.inverse()
  val distance = x.finddistance(y)

  println("addition of x & y  : " +add )
  println("The result after moving 5 points each :" +move)
  println("The inverse of x :" +inverse1)
  println("The inverse of y :" +inverse2)
  println("The distance between x & y :" +distance)


}


