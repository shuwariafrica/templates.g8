package $package$

import munit.FunSuite

class HelloTests extends FunSuite:

  test("greet should return the correct greeting message") {
    val result = Hello.greet("MUnit")
    assertEquals(result, "Hello, MUnit!")
  }
