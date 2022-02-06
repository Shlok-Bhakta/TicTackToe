import java.util.*;
import javax.swing.*;


public class App {
    
    public static void main(String[] args) throws Exception {
        		//asking for 1 or 2 player mode
		Status win = Status.none;
		int turn = 0;
		String[] gameOptions = {"Solo(with bot)", "with a friend"};
		int mode = JOptionPane.showOptionDialog(null, "Would you like to play alone or with a friend?", "Gamemode", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, gameOptions, gameOptions[0]);
		Object[] board = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		ArrayList<Object> available = new ArrayList<Object>();
		available.add(1);
		available.add(2);
		available.add(3);
		available.add(4);
		available.add(5);
		available.add(6);
		available.add(7);
		available.add(8);
		available.add(9);

		Object change = 0;

		//singleplayer
		if (mode == 0) {
			while (win == Status.none) {

			}
		}
		//multiplayer
		if (mode == 1) {
			while (win == Status.none) {
				//get available spaces
				



				//play for o
				if ((turn % 2) == 0) {
					

					//asking for user input
					change = JOptionPane.showOptionDialog(null, "pick a spot:\n" + BoardToText(board), "Turn for O", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, board, available.toArray()[0]);
					System.out.println(change);
					available.remove(Integer.parseInt(change.toString()));
					System.out.println(available.toString());
						//figuring out what number to change in the board array
						switch (Integer.parseInt(change.toString())) {
							case 0:
								board[0] = "O";
								break;
							case 1:
								board[1] = "O";
								break;
							case 2:
								board[2] = "O";
								break;
							case 3:
								board[3] = "O";
								break;
							case 4:
								board[4] = "O";
								break;
							case 5:
								board[5] = "O";
								break;
							case 6:
								board[6] = "O";
								break;
							case 7:
								board[7] = "O";
								break;
							case 8:
								board[8] = "O";
								break;
						}
						turn++;
					

				} //play for x
				else {
					
					//asking for user input
					change = JOptionPane.showOptionDialog(null, "pick a spot:\n" + BoardToText(board), "Turn for X", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, board, available.toArray()[0]);
					//removes 
					available.remove(Integer.parseInt(change.toString()) - turn);
					System.out.println(change);
					System.out.println(available.toString());
						//figuring out what number to change in the board array

						switch (Integer.parseInt(change.toString())) {
							case 0:
								board[0] = "X";
								break;
							case 1:
								board[1] = "X";
								break;
							case 2:
								board[2] = "X";
								break;
							case 3:
								board[3] = "X";
								break;
							case 4:
								board[4] = "X";
								break;
							case 5:
								board[5] = "X";
								break;
							case 6:
								board[6] = "X";
								break;
							case 7:
								board[7] = "X";
								break;
							case 8:
								board[8] = "X";
								break;
						}
						turn++;
					}
				

			}
		}

	}

	public static String BoardToText(Object[] Board) {
		String out = null;
		Object[] inboard = new Object[9];
		inboard = Board;
		out = (inboard[0] + "  |  " + inboard[1] + "  |  " + inboard[2]
				+ "\n------------\n"
				+ inboard[3] + "  |  " + inboard[4] + "  |  " + inboard[5]
				+ "\n------------\n"
				+ inboard[6] + "  |  " + inboard[7] + "  |  " + inboard[8]);

		return out;
	}
	
	
	
}

