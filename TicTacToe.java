import java.util.Scanner;

public class TicTacToe {

    static String[] board;
    static String turn;

    public static void printBoard() // prints the board
    {
        System.out.println( board[0] + " | " + board[1] + " | " + board[2] );
        System.out.println( board[3] + " | " + board[4] + " | " + board[5] );
        System.out.println( board[6] + " | " + board[7] + " | " + board[8] );
    }

    public static void updateBoard(int pos) // updates board by placing player symbol in it
    {
        if((pos<1)||(pos>9)) {
            System.out.println("Invalid slot number.");
            return;
        }
        if((board[pos-1].equals("X")) || (board[pos-1].equals("O"))) {
            System.out.println("Slot already taken.");
            return;
        }
        else {
            board[pos-1] = turn;
            if(turn.equals("X") )
                turn = "O";
            else
                turn = "X";
        }
        printBoard();
    }

    public static String findWinner()
    {
        String toCheck = null;
        for(int i = 0; i<8; i++) {

            switch(i) {
			case 0:
				toCheck = board[0]+board[1]+board[2];
				break;
			case 1:
				toCheck = board[3]+board[4]+board[5];
				break;
			case 2:
				toCheck = board[6]+board[7]+board[8];
				break;
			case 3:
				toCheck = board[0]+board[3]+board[6];
				break;
			case 4:
				toCheck = board[1]+board[4]+board[7];
				break;
			case 5:
				toCheck = board[2]+board[5]+board[8];
				break;
			case 6:
				toCheck = board[0]+board[4]+board[8];
				break;
			case 7:
				toCheck = board[2]+board[4]+board[6];
				break;
			}

            if(toCheck.equals("XXX"))
                return "X";
            else if(toCheck.equals("OOO"))
                return "O";
        }

        for(int i = 0; i<9; i++) {
            if((board[i].equals(String.valueOf(i+1))))
                break;
            else if(i == 8)
                return "tie";
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        int inputPosition;
        int gameType;
        String winner = null;

        // board initalize
        for(int i = 0; i < 9; i++){
            board[i] =  String.valueOf(i+1);
        }
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };//stores the positions which are not taken

        Player player1 = new Player("X");// player 1 initalize

        System.out.println("This is a new game. Board numbers are as follows:");
        printBoard();
        System.out.println("Enter 1 to play Player vs Player");
        System.out.println("Enter 2 to play Player vs Computer");
        gameType = sc.nextInt();
        if(gameType == 1) {  //Player Vs Player
            Player player2 = new Player("O");
            System.out.println("Welcome to Tic Tac Toe. Player 1 is X, Player 2 is O.");
            while (winner == null) {
                System.out.print("'" + turn + "'" + " , enter your desired position [1-9]: ");
                inputPosition = sc.nextInt();
                if (turn.equals(player1.getPlayerSymbol())) { //Player1's turn
                    player1.setPlayerInputNumber(inputPosition);
                    updateBoard(player1.getPlayerInputNumber());
                }
                else {  // Player2's turn
                    player2.setPlayerInputNumber(inputPosition);
                    updateBoard(player2.getPlayerInputNumber());
                }
                winner = findWinner();
            }
        }

        else  //Player Vs Computer
        {   Computer computer = new Computer("O");
            System.out.println("Welcome to Tic Tac Toe. Player 1 is X, Computer is O.");
            while(winner == null) {

                if(turn.equals(player1.getPlayerSymbol()) ){  //Player's turn
                    System.out.print("'" + turn + "'" + " , enter your desired position [1-9]: ");
                    inputPosition = sc.nextInt();
                    player1.setPlayerInputNumber(inputPosition);
                    updateBoard(player1.getPlayerInputNumber());
                    if(inputPosition<10 && inputPosition>0)
                        arr[inputPosition-1] = -1;
                }
                else{ // computer's turn
                    System.out.println("Computer Enters position");
                    inputPosition = ComputerControl.checkComputerWin(board);
                    if(inputPosition == -1)
                        inputPosition = ComputerControl.checkAgainstMove(board);
                    if(inputPosition == -1)
                        inputPosition = ComputerControl.setRandomMove(board,arr);
                    computer.setComputerPosition(inputPosition);
                    updateBoard(computer.getComputerPosition());
                    if(inputPosition<10 && inputPosition>0)
                        arr[inputPosition-1] = -1;
                }
                winner = findWinner();
            }
        }


        if(winner.equals("tie")) {
            System.out.println("The game is a tie.");
        }
        else {
            if(gameType == 2 && winner.equals("O")){
                System.out.println("Computer won the game!!");
            }
            else {
                if(winner.equals("X"))
                    System.out.println("Player 1 won the game!!");
                else
                    System.out.println("Player 2 won the game!!");
            }
        }
    }
}

