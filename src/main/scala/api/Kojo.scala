package api

import net.kogics.kojo.lite.KojoFrame

object Kojo:
  def createFrame(): Frame =
    Frame(950, 700, false)

  def createFrame(width: Int, height: Int): Frame =
    Frame(width, height, false)

  def createFrame(showLoading: Boolean): Frame =
    Frame(950, 700, showLoading)

  def createFrame(width: Int, height: Int, showLoading: Boolean): Frame =
    Frame(width, height, showLoading)

  class Frame(width: Int, height: Int, showLoading: Boolean):
    val realFrame = KojoFrame.create(width, height, showLoading)
    val builtins = realFrame.builtins
    export builtins.*
    export CanvasAPI.*
    export TurtleAPI.*
