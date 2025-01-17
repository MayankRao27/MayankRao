object HollowPattern {
  def main(args: Array[String]): Unit = {
    val rows = 4
    val columns = 7
    for (i <- 1 to rows) {
      if (i == 1 || i == rows) {
        for (_ <- 1 to columns) {
          print("* ")
        }
      } else {
        print("* ") // Left border
        for (_ <- 2 to columns - 2) {
          print("  ")
        }
        print("*")
      }
      println()
    }
  }
}

