public class Bird extends Animal {

  public Bird(String name) {
    this.name = name;
  }


  @Override
  String greet() {
    return null;
  }

  @Override
  String wantChild() {
    return "want a child from an egg!";
  }

  @Override
  boolean hungry() {
    return false;
  }

  @Override
  String getName() {
    return this.name;
  }
}
