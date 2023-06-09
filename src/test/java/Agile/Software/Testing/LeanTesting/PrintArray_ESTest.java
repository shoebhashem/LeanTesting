/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 19 17:11:43 GMT 2023
 */

package Agile.Software.Testing.LeanTesting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Agile.Software.Testing.LeanTesting.PrintArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrintArray_ESTest extends PrintArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrintArray printArray0 = new PrintArray();
      // Undeclared exception!
      try { 
        printArray0.print((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Agile.Software.Testing.LeanTesting.PrintArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrintArray printArray0 = new PrintArray();
      int[] intArray0 = new int[1];
      printArray0.print(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
  }
}
