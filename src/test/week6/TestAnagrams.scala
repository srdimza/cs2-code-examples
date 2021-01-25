package week6

import org.scalatest.funsuite.AnyFunSuite
import week6.recursion.Anagrams

class TestAnagrams extends AnyFunSuite {
  test("Test Anagrams") {

    val testCases: Map[String, List[String]] = Map(
      "" -> List(),
      "a" -> List("a"),
      "me" -> List("me", "em"),
      "zz" -> List("zz"),
      "you" -> List("you", "yuo", "oyu", "ouy", "uyo", "uoy"),
      "all" -> List("all", "lal", "lla"),
      "nana" -> List("nana", "nnaa", "naan", "anan", "aann", "anna")
    )

    for ((input, expectedOutput) <- testCases) {
      assert(Anagrams.anagrams(input).sorted == expectedOutput.sorted, input)
    }

  }
}
