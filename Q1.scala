object TemperatureConverter {
  def calculateAverage(temp: List[Double]): Double = {
    val avg= temp.map(celsius => (celsius * 9/5) + 32).reduce(_ + _) / temp.length
    avg
  }

  def main(args: Array[String]): Unit = {
    val temp = List(0.0, 10.0, 20.0, 30.0)
    val avgFah = calculateAverage(temp)
    println(s"Average Fahrenheit temperature: $avgFah")
  }
}
