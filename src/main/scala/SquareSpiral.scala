import api.Kojo

object SquareSpiral:
  def main(args: Array[String]) = 
    val kf = Kojo.createFrame()
    import kf._

    def spiral(size: Int, angle: Int): Unit =
      if size <= 300 then
        forward(size)
        right(angle)
        spiral(size + 2, angle)
    
    clear()
    setPenColor(darkGray)
    setFillColor(green)
    setBackgroundH(red, yellow)
    setPenThickness(1)
    setSpeed(fast)
    spiral(0, 91)
