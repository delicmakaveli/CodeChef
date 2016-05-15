package theLeadGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();

		int n = Integer.parseInt(s);

		int score1 = 0;
		int score2 = 0;
		int winner = 0;
		int maxLead = 0;

		while (n > 0) {
			String[] split = bf.readLine().split(" ");
			int rScore1 = Integer.parseInt(split[0]);
			int rScore2 = Integer.parseInt(split[1]);
			
			int currentLead = 0;
			int currentWin = 1;

			score1 += rScore1;
			score2 += rScore2;

			if (score1 > score2) {
				currentLead = score1 - score2;
			} else {
				currentLead = score2 - score1;
				currentWin = 2;
			}
			if(currentLead > maxLead) {
				maxLead = currentLead;
				winner = currentWin;
			}
			n--;
		}
		StringBuilder outputs = new StringBuilder();
        outputs.append(winner + " " + maxLead);
        System.out.println(outputs);
	}
}
