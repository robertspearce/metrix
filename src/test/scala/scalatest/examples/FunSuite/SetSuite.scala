package scalatest.examples.FunSuite

import org.scalatest.FunSuite

/**
 * Created by mgo12 on 28/06/2015.
 */
class SetSuite extends FunSuite{

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }

}
