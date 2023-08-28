object q2{

    def countLetterOccurrences(wordList: List[String]): Int = {
        val wordLength = wordList.map((word: String) => word.length)
        val totalletterCount = wordLength.reduce(_ + _)
        totalletterCount
    }

    def main(args: Array[String]): Unit = {
        val wordList = List("apple", "banana", "cherry", "date")
        val total = countLetterOccurrences(wordList)
        println(s"Total letter count : $total")
    }
}