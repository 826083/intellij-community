// "Use constructor 'Test(int)'" "true"
import java.lang.invoke.*;

class Main {
  void foo() throws Exception {
    MethodHandles.Lookup l = MethodHandles.lookup();
    l.findConstructor(Test.class, <caret>MethodType.methodType(void.class));
  }
}

class Test {
  public Test(int a) {}
}