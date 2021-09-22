class Refrigerator{
String brand;
String color;
int dimentions;

void cooling(){
System.out.println(color+" "+brand+" "+"has a very good cooling features");
}

void maestro(){
System.out.println(color+" "+brand+" "+"has a curd making technology");
}

public static void main(String[]args){

  Refrigerator r= new Refrigerator();

r.brand="samsung";
r.color="silver";
r.dimentions=67*57*159;
r.cooling();
r.maestro();

}

}