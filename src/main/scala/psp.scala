import psp.std.StdShow._
import psp.std._

class AA {
  def testLazy(): String = {
    val xs = Array(0, 0, 0, 0, 0, 1)
    xs map (5 / _) takeRight 1 mk_s ""
  }

  def nextInfinity(): String = {
    val xs = Each.unfold(BigInt(1))(_ + 1)
    xs dropRight 1000 take 3 mk_s ", "
  }

  def testLargeArray(): String = {
    val xs = Array.range(1, 1e7.toInt)
    xs map (_ + 1) map (_ + 1) map (_ + 1) take 3 mk_s ", "
  }

  def testInMap() {
    val s = InSet((x: Int) => x == 2)
    val m = InMap(s, (v: Int) => v * 3)

    assert(!s(1), "element not in set")
    assert(m.get(1) == None, "element not in map domain")
  }
}

object ww {
  def main(args: Array[String]) {
    val a = new AA()
    println(a.testLazy())
    println(a.nextInfinity())
    println(a.testLargeArray())
    println(a.testInMap())
  }
}