package org.solutions.Ej_1829_Find_the_Winner_of_the_Circular_Game;

public class IncredibleSolution {
    public static int findTheWinner(int n, int k) {
        int res = 0;
        for (int player_num = 2; player_num <= n; ++player_num) {
            res = (res + k) % player_num;
        }
        return res + 1;
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }
}
