/* Create a new class called “Calculator” which contains the following:
A static method called powerInt(int num1,int num2) that accepts two integers and returns num1 to the power of num2 (num1 power num2).
A static method called powerDouble(double num1,int num2) that accepts one double and one integer and returns num1 
to the power of num2 (num1 power num2).
Call your method from another class without instantiating the class (i.e. call it like Calculator.powerInt(12,10) 
since your methods are defined to be static) Hint: Use Math.pow(double,double) to calculate the power.*/

class Calculator{
 static int resultint;
 static double resultdouble;
 

  static int powerInt(int num1,int num2){
  resultint = Math.pow(num1,num2); 
   return resultint;
   }
   static double powerDouble(double num3,int num4){
   resultdouble = Math.pow(num1,num2); 
   return resultdouble;
   }
   }
   
class CalculatorDemo{
  public static void main(String args[]){
  //Calculator c = new Calculator();
  int x = Calculator.powerInt(12,10);
  double y = Calculator.powerDouble(5.5,2);
    


}

}
