package eu.somethingsecret.xoxinternals.controller;

import eu.somethingsecret.xoxinternals.model.BoardReadOnly;
import eu.somethingsecret.xoxinternals.model.Player;
import eu.somethingsecret.xoxinternals.model.XoxInitSettings;

import java.util.Collection;

public interface XoxManager {

    Collection<Long> getGames();

    void removeGame(long gameId);

    long addGame(XoxInitSettings initSettings);

    BoardReadOnly getBoard(long gameId);

    Player[] getPlayers(long gameId);

    XoxClaimFieldAction[] getActions(long gameId, String player);

    void performAction(long gameId, String player, int actionIndex);

    Ranking getRanking(long gameId);
}
