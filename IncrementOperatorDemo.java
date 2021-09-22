class IncrementOperatorDemo{

public static void main(String[]args){

System.out.println("pre increment operatation.....");
  int i = 1;
  int j = ++i;

System.out.println("i: "+i);//2
System.out.println("j: "+j);//2

System.out.println("post increment operatation.....");
  int m = 100;
  int n = m++;

System.out.println("m: "+m);//101
System.out.println("n: "+n);//100

}

}