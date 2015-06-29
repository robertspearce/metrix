package scalatest.examples.FunSpec

import org.scalatest.FunSpec

/**
 * Created by mgo12 on 28/06/2015.
 */
class SetSpec extends FunSpec {

  describe("A Set") {
    describe("when empty") {
      it("should have size 0") {
        assert(Set.empty.size == 0)
      }

      it("should produce NoSuchElementException when head is invoked") {
        intercept[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }

}
