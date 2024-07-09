package org.solutions.Ej_1829_Find_the_Winner_of_the_Circular_Game;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static int findTheWinner(int n, int k) {
        List<Integer> friends = new ArrayList<>();
        for (int i=1; i<=n; i++){
            friends.add(i);
        }
        int index = 0;
        System.out.println(friends);
        while (friends.size()>1){
            int nextToRemove = (index + k - 1) % friends.size();
            friends.remove(nextToRemove);
            index = nextToRemove;
            System.out.println(friends);
        }
        return friends.get(0);
    }

    public static void main(String[] args) {
        findTheWinner(5, 2);
    }
}
