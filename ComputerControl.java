public class ComputerControl {

    private static int position = -1;

    public static int checkComputerWin(String[] board){  //checks if there is a chance to win
        position = -1;
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

            if (toCheck.equals("1OO")) {
                position = 1;
                break;}
            if (toCheck.equals("O2O") || toCheck.equals("2OO")) {
                position = 2;
                break;}
            if (toCheck.equals("3OO") || toCheck.equals("OO3")) {
                position = 3;
                break;}
            if (toCheck.equals("O4O") || toCheck.equals("4OO")) {
                position = 4;
                break;}
            if (toCheck.equals("O5O")) {
                position = 5;
                break;}
            if (toCheck.equals("OO6") || toCheck.equals("O6O")) {
                position = 6;
                break;}
            if (toCheck.equals("OO7") || toCheck.equals("7OO")) {
                position = 7;
                break;}
            if (toCheck.equals("O8O") || toCheck.equals("OO8")) {
                position = 8;
                break;}
            if (toCheck.equals("OO9")) {
                position = 9;
                break;}

        }
        return position;
    }

    public static int checkAgainstMove(String[] board){  //checks if there is a chance to loose
        position = -1;
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


            if (toCheck.equals("1XX")) {
                position = 1;
                break;}
            if (toCheck.equals("X2X") || toCheck.equals("2XX")) {
                position = 2;
                break;}
            if (toCheck.equals("3XX") || toCheck.equals("XX3")) {
                position = 3;
                break;}
            if (toCheck.equals("X4X") || toCheck.equals("4XX")) {
                position = 4;
                break;}
            if (toCheck.equals("X5X")) {
                position = 5;
                break;}
            if (toCheck.equals("XX6") || toCheck.equals("X6X")) {
                position = 6;
                break;}
            if (toCheck.equals("XX7") || toCheck.equals("7XX")) {
                position = 7;
                break;}
            if (toCheck.equals("X8X") || toCheck.equals("XX8")) {
                position = 8;
                break;}
            if (toCheck.equals("XX9")) {
                position = 9;
                break;}

        }
        return position;
    }

    public static int setRandomMove(String[] board, int[] arr){  // returns a random position
        int i =0;
        while(arr[i]==-1)
            i++;
        position = arr[i];
        return position;
    }
}
