package soccerleague;
import java.util.Random;
import java.util.ArrayList;
/**
 * @author Miguel Vargas
 */
public class SoccerTeam {   //This class conteins de soccer team for colombian football league
    
    private String name;
    private int winMatch;
    private int loseMatch;
    private int goalsWin;
    private int goalsLose;
    private int matchsPlayed;
    private int points;
    private ArrayList<SoccerTeam> playedTeams;
    
    
    public SoccerTeam(String name){
    this.name=name;
    this.winMatch=0;
    this.loseMatch=0;
    this.goalsWin=0;
    this.goalsLose=0; 
    this.matchsPlayed=0;
    this.points=0;
    this.playedTeams= new ArrayList<>();
    }
    
  
    
    
    //Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWinMatch() {
        return winMatch;
    }

    public void setWinMatch(int winMatch) {
        this.winMatch = winMatch;
    }

    public int getLoseMatch() {
        return loseMatch;
    }

    public void setLoseMatch(int loseMatch) {
        this.loseMatch = loseMatch;
    }

    public int getGoalsWin() {
        return goalsWin;
    }

    public void setGoalsWin(int goalsWin) {
        this.goalsWin = goalsWin;
    }

    public int getGoalsLose() {
        return goalsLose;
    }

    public void setGoalsLose(int goalsLose) {
        this.goalsLose = goalsLose;
    }
    
    
    public int getMatchsPlayed() {
        return matchsPlayed;
    }

    public void setMatchsPlayed(int matchsPlayed) {
        this.matchsPlayed = matchsPlayed;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
        public ArrayList<SoccerTeam> getPlayedTeams() {
        return playedTeams;
    }

    public void setPlayedTeams(ArrayList<SoccerTeam> playedTeams) {
        this.playedTeams = playedTeams;
    }

    
    
    
    
    
    
    
    //Methods
    
    public void addTeam(SoccerTeam team){       //Add the team to the teams list 
    this.playedTeams.add(team); 
    }
    
    
    
    
    
    public static void playMatch(SoccerTeam team1, SoccerTeam team2){  //This methods play a match and change the atributes from each object
     Random random = new Random();   
     int goals1 = random.nextInt(7);  //Goals from team1
     int goals2= random.nextInt(7);  //Goals from team2
        
     team1.setGoalsWin(team1.getGoalsWin()+goals1);       //Put de goals
     team2.setGoalsWin(team2.getGoalsWin()+goals2);
        
      team1.setGoalsLose(team1.getGoalsLose()+goals2);       //Put de goals losed
      team2.setGoalsLose(team2.getGoalsLose()+goals1);
     
     
     team1.setMatchsPlayed(team1.getMatchsPlayed()+1);      //Put the match played
     team2.setMatchsPlayed(team2.getMatchsPlayed()+1);
     
     team1.addTeam(team2);
     team2.addTeam(team1);      //Add the respective rival to the list
     
        
        System.out.println(team1.getName()+" "+goals1+" "+team2.getName()+" "+goals2);
     if(goals1==goals2){    //Tie
     team1.setPoints(team1.getPoints()+1);      //Add only one point for each team
     team2.setPoints(team2.getPoints()+1);
     }
     else if (goals1>goals2){   //Team1 win Team2
     team1.setWinMatch(team1.getWinMatch()+1);
     team1.setPoints(team1.getPoints()+3);
     team2.setLoseMatch(team2.getLoseMatch()+1);
     }
     else{                                      //Team2 win Team1
     team2.setWinMatch(team2.getWinMatch()+1);
      team2.setPoints(team2.getPoints()+3);
     team1.setLoseMatch(team1.getLoseMatch()+1);    
     }     
    }   //End method


  public static void playMatchManual(SoccerTeam team1, SoccerTeam team2, int goals1 , int goals2){  //This methods play a match and change the atributes from each object
    
      
     team1.setGoalsWin(team1.getGoalsWin()+goals1);       //Put de goals
     team2.setGoalsWin(team2.getGoalsWin()+goals2);
        
      team1.setGoalsLose(team1.getGoalsLose()+goals2);       //Put de goals losed
      team2.setGoalsLose(team2.getGoalsLose()+goals1);
     
     
     team1.setMatchsPlayed(team1.getMatchsPlayed()+1);      //Put the match played
     team2.setMatchsPlayed(team2.getMatchsPlayed()+1);
     
     team1.addTeam(team2);
     team2.addTeam(team1);      //Add the respective rival to the list
     
        
        System.out.println(team1.getName()+" "+goals1+" "+team2.getName()+" "+goals2);
     if(goals1==goals2){    //Tie
     team1.setPoints(team1.getPoints()+1);      //Add only one point for each team
     team2.setPoints(team2.getPoints()+1);
     }
     else if (goals1>goals2){   //Team1 win Team2
     team1.setWinMatch(team1.getWinMatch()+1);
     team1.setPoints(team1.getPoints()+3);
     team2.setLoseMatch(team2.getLoseMatch()+1);
     }
     else{                                      //Team2 win Team1
     team2.setWinMatch(team2.getWinMatch()+1);
      team2.setPoints(team2.getPoints()+3);
     team1.setLoseMatch(team1.getLoseMatch()+1);    
     }     
    }   //End method
    
    
    
}
