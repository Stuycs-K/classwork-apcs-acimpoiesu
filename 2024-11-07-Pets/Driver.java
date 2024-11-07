//When we called the getName for the animal we were given the original name given
// but when we called the Bird we would get the newly updated getName() instead
// of the original name since we overrid it.
// A animal being made with bird-like properties doesn't work because
// not all animals have bird-like properties or "is-A" bird and so you shouldn't make
// all animals have bird-like properties. It doesn't work because it doesn't have some of the properties like height or color
public class Driver{
  public static void main(String[]args){
    Animal Jimmeth = new Animal ("ahhhh", 9, "Jimmeth");
    //Jimmeth.speak();
    Bird jimmeth2 = new Bird("arg", 7, "static",1515151.64, "yellow");
    //jimmeth2.speak();
    System.out.println(Jimmeth.getName());
    System.out.println(jimmeth2.getName());
    Animal a1 = new Animal("roar", 5, "Lion");
    Bird b1 = new Bird("tweet", 3, "Chirpy", 10.5, "blue");
    //Bird b2 = new Animal("owww", 4, "Human");
    Animal a2 = new Bird("meow", 2, "notabird", 12.0, "blue");
    a1.speak();
    b1.speak();
    a2.speak();
  }
}
