public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    fleet.add(new Thing("Get Milk"));
    fleet.add(new Thing("Remove the obstacles"));

    Thing standUp = new Thing("Stand up");
    fleet.add(standUp);
    standUp.complete();

    Thing eatLunch = new Thing("Eat lunch");
    fleet.add(eatLunch);
    eatLunch.complete();










    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
  }
}