package xyz.camiloarguello.numbershapes;

public class Number {
    public int number;

    public boolean isTriangular(){
        int x = 1;
        int triangular = 1;

        while(triangular < number){
            x++;
            triangular += x;
        }

        if(triangular == number){
            return true;
        }else{
            return false;
        }

    }
}
