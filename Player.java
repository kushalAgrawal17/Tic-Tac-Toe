import java.util.Scanner;
public class Player {
    private String playerSymbol;
    private Integer playerInputNumber = null;

    public Player(String playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

    public String getPlayerSymbol() {
        return playerSymbol;
    }

    public int getPlayerInputNumber() {
        return playerInputNumber;
    }

    public void setPlayerSymbol(String playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

    public void setPlayerInputNumber(int playerInputNumber) {
        this.playerInputNumber = playerInputNumber;
    }
}

