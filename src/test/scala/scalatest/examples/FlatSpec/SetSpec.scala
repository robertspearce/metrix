package scalatest.examples.FlatSpec

import java.util.NoSuchElementException

import org.scalatest.FlatSpec

/**
 * Created by mgo12 on 28/06/2015.
 */
class SetSpec extends FlatSpec{

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }

}
