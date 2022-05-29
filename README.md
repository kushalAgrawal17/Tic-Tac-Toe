# Tic-Tac-Toe
This project is the implementation of Tic-Tac-Toe game. Both Player vs Player and Player vs Computer are implemented using OOPs in java.

How to run the programm:
1.On the command line,compile the program by entering the command: javac TicTacToe.java
2.Now run the program by entering the command: java TicTacToe

The game board is as follows:
    1 | 2 | 3
    4 | 5 | 6
    7 | 8 | 9

The programm first asks the user to enter 1 for playing player vs player , else enter 2 to play player vs computer.
1. Player vs Player - Player 1 is 'X' , Player 2 is 'O'
   'X' starts the game. Players are alternatively asked to enter the position [1-9] at which they want to place their symbol.The game board is displayed everytime after it is updated.
    The program ends when the game is won by any player or the game is a draw.

2. Player vs Computer - Player is 'X', Computer is 'O'
   Player starts the game. Player is asked to enter the position [1-9] at which he want to place his symbol and the computer enters its position. The game board is displayed everytime after it is updated.
   The program ends when the game is won by the player/computer or the game is a draw.



The programm has four classes
1.TicTacToe - has the main function
2.Player
3.Computer
4.ComputerControl - has the computer logic to decide position
