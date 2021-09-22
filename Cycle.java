class Cycle{
String brand;
String color;
int rate;

void speed(){
System.out.println(color+" "+brand+" "+"has a very good speed ");
}

void wheeling(){
System.out.println(color+" "+brand+" "+"is thrilling for wheeling");
}

public static void main(String[]args){

 Cycle c= new Cycle();

c.brand="Btwin";
c.color="yellow";
c.rate=6000;
c.speed();
c.wheeling();

}

}