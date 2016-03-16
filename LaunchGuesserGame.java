
class Guesser{
	int gNumber;
	
	int guessA_Number(int gNumber){
		this.gNumber = gNumber;
		return gNumber;
	}
}

class Player{
	int pNumber;
	int playerNumber(int pNumber){
		this.pNumber = pNumber;
		return pNumber;
	}
}
class Umpire{
	int guesserNumber;
	int playerNumber1;
	int playerNumber2;
	int playerNumber3;
	
	void getGuesserNumber(int guesserNumber){
		this.guesserNumber = guesserNumber;
		System.out.println("guesser Number : "+guesserNumber);
	}
	void getPlayerNumber(int playerNumber1, int playerNumber2, int playerNumber3){
		this.playerNumber1 = playerNumber1;
		this.playerNumber2 = playerNumber2;
		this.playerNumber3 = playerNumber3;
		System.out.println("Player Number:1 : "+playerNumber1);
		System.out.println("Player Number:2 : "+playerNumber2);
		System.out.println("Player Number:3 : "+playerNumber3);
	}
	void compare(){
		if (playerNumber1 == guesserNumber && playerNumber2 == guesserNumber||
				playerNumber2 == guesserNumber && playerNumber3 == guesserNumber||
				playerNumber3 == guesserNumber && playerNumber1 == guesserNumber)
			System.out.println(" 2 players own the game");
		else if(playerNumber1 == guesserNumber)
			System.out.println("player 1 own");
		
		else if (playerNumber2 == guesserNumber)
			System.out.println("player 2 own");
		
		else if (playerNumber3 == guesserNumber)
			System.out.println("player 3 own");
		else
			System.out.println(" no body own");
		}
	}


public class LaunchGuesserGame {

	public static void main(String[] args) {
		Guesser guesser = new Guesser();
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Umpire umpire = new Umpire();
		
		guesser.guessA_Number(6);
		player1.playerNumber(6);
		player2.playerNumber(5);
		player3.playerNumber(9);
		umpire.getGuesserNumber(guesser.gNumber);
		umpire.getPlayerNumber(player1.pNumber, player2.pNumber, player3.pNumber);
		umpire.compare();
	}

}
