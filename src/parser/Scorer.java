package parser;

import java.text.DecimalFormat;

public class Scorer {

	private String s1;
	private String s2;
	private static int xlen;
	private static int ylen;
	public static int maxlen;
	double score;
	
	public void score() {
		
	}
	
	public double score(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;		
		
		//计算得分p
		int p = getLcs();
		
		if(p < 5 && p > 50) { 
			return -1;
		}else {
			score = 100 * 2 * p / (xlen + ylen); //按百分比扩大一百倍
		}
		
		return score;
	}

	private int getLcs() {
		xlen = s1.length();
		ylen = s2.length();
        int[][] commonSublen = new int[xlen + 1][ylen + 1];
        int[][] direction = new int[xlen + 1][ylen + 1];
        for (int i = 1; i <= xlen; i++) {
            char xi = s1.charAt(i - 1);
            for (int j = 1; j <= ylen; j++) {
                char yj = s2.charAt(j - 1);
                if (xi == yj) {
                    commonSublen[i][j] = commonSublen[i - 1][j - 1] + 1;
                    direction[i][j] = 2;
                } else if (commonSublen[i - 1][j] > commonSublen[i][j - 1]) {
                    commonSublen[i][j] = commonSublen[i - 1][j];
                    direction[i][j] = 1;
                } else if (commonSublen[i - 1][j] < commonSublen[i][j - 1]) {
                    commonSublen[i][j] = commonSublen[i][j - 1];
                    direction[i][j] = 3;
                } else {
                    commonSublen[i][j] = commonSublen[i - 1][j];
                    direction[i][j] = 4;
                }
            }
        }
        int maxSublen = commonSublen[xlen][ylen];
        return maxSublen;
    }

	
}
