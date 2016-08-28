package ClassWorkEndOfSummer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class SoccerTeam {

    HashMap<String, List<String>> players;

    public SoccerTeam() {
        players = new HashMap<String, List<String>> ();
    }

    public List<String> get(String position) {
        List <String> names = new ArrayList<>();
    	for ( int i = 0; i < players.get(position).size(); i++) {
			names.add(players.get(position).get(i));
		}
    	return names;
    }
    public void put(String position, String name) {
    	 if(players.get(position) == null) {
             players.put(position, new ArrayList<String>());
         }
    	 players.get(position).add(name);
    }
}


public class MainMap {

	public static void main(String[] args) {

     SoccerTeam sokol = new SoccerTeam();
     sokol.put("1", "Vasya");
     sokol.put("2", "Petya");
     sokol.put("1", "Dima");
     sokol.put("3", "Gleb");
     System.out.println(sokol.players);
	}

}
