class Flowers{
String name;
String color;
int noOfPetals;

void bloom(){
System.out.println(color+" "+name+"is blooming...!");
}

void shedFragrance(){
System.out.println(color+" "+name+"is shedding fragrance...!");
}

public static void main(String[]args){

Flower rose = new Flower();
rose.name = "Rose";
rose.color = "Yellow";
rose.noOfPetals = 16;

Flower jasmine = new Flower();
jasmine.name="Jasmine";
jasmine.color="White";
jasmine.noOfPetals=7;

Flower lotus = new Flower();
lotus.name = "Lotus";
lotus.color = "Pink";
lotus.noOfPetals = 9;

rose.bloom();
jasmine.bloom();
lotus.bloom();
rose.shedFragrance();
jasmine.shedFragrance();
lotus.shedFragrance();
}

}