package labirintoaleatorio;

import com.sun.xml.internal.ws.util.StringUtils;

public class Player {
    private String playerName;
    private int Keys;
    
    public Player(String playerName) {
        this.playerName = StringUtils.capitalize(playerName);
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public int getKeys() {
        return Keys;
    }

    public void addKeys() {
        this.Keys += 1;
    }
    
    
}
