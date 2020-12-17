package behavioralPatterns.mediatorPattern.code;

public abstract class PartyMemberBase implements PartyMember {
  protected Party party;

  @Override
  public void joinedParty(Party party) {
    this.party = party;
  }

  @Override
  public void partyAction(Action action) {
    System.out.println(action.getDescription());
  }

  @Override
  public void act(Action action) {
    if (party != null) {
      System.out.println(action);
      party.act(this, action);
    }
  }

  @Override
  public abstract String toString();

}
