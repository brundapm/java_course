class NestedTernaryOperator{

 public static void main(String[] args){

   int x=50,y=100,z=150;
   int smallest =(x>y)?((x>y)?x:z):((y>z)?y:x);

 System.out.println("smallest Number:"+smallest);

 }

}
