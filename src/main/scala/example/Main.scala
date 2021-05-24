package example

import api.Kojo

@main def main =
  val kf = Kojo.createFrame(600, 600)
  import kf._

  cleari()
  originBottomLeft()
  setSpeed(superFast)
  setBackground(white)
  setPenColor(black)

  val tileCount = 10
  val tileSize = cwidth / tileCount

  def shape() = 
      repeat(4) {
          forward(tileSize)
          right(90)
      }

  def block(posX: Double, posY: Double) = 
      setPosition(posX, posY)
      shape()
  

  for 
    posY <- rangeTill(0, cheight, tileSize)
    posX <- rangeTill(0, cwidth, tileSize)
  do
    block(posX, posY)

