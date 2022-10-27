/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke
 */
public class Team {
    
    private String home, away;
    private int hScore, aScore, games, wins, losses;
    
    public Team(String home, String away, int hScore, int aScore){
        this.home = home;
        this.away = away;
        this.hScore = hScore;
        this.aScore = aScore;
        
        
    }
    
    public String getHome() {
        return this.home;
    }
    
    public String getAway() {
        return this.away;
    }
    
    public int getHomeScore() {
        return this.hScore;
    }
    
    public int getAwayScore() {
        return this.aScore;
    }
    
    public int playGame() {
        return this.games += 1;
    }
    
    public int setWins() {
        return this.wins += 1;
    }
    
    public int setLosses() {
        return this.losses += 1;
    }
    
    public int getWins() {
        return this.wins;
    }
    
    public int getLosses() {
        return this.losses;
    }
}
