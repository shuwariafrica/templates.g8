package $package$

import munit.FunSuite

class HelloWorldSuite extends FunSuite:

  test("greet should return the correct greeting message") {
    val result = HelloWorld.greet("MUnit")
    assertEquals(result, "Hello, MUnit!")
  }
