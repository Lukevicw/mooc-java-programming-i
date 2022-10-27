
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    private static int count = 0, wins = 0, losses = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Team> records = readFile(file);
        
        System.out.println("Team:");
        String teamName = scan.nextLine();

        
        for(Team team : records) {
            if (team.getHome().contains(teamName)) {
                count += 1;
                
                if (team.getHomeScore() >= team.getAwayScore()) {
                    wins ++;
                    team.setWins();
                } else {
                    losses ++;
                    team.setLosses();
                }
            } else if (team.getAway().contains(teamName)) {
                count++;
                //team.setWins();
                
                if(team.getAwayScore() >= team.getHomeScore()) {
                    wins++;
                    team.setWins();
                } else {
                    losses++;
                    team.setLosses();
                }
            
                team.playGame();
            }
        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }
    
    
    public static ArrayList<Team> readFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();
        String line, home, away;
        String[] parts;
        int hScore, aScore; 
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                line = reader.nextLine();
                parts = line.split(",");
                home = parts[0];
                away = parts[1];
                hScore = Integer.valueOf(parts[2]);
                aScore = Integer.valueOf(parts[3]);
                
                teams.add(new Team(home, away, hScore, aScore));
              
            }
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        
        return teams;
    }
}
