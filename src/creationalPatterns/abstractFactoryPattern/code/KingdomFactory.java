package creationalPatterns.abstractFactoryPattern.code;

public interface KingdomFactory {

  Castle createCastle();

  King createKing();

  Army createArmy();

}
