//[up, down, left, right]


public class Map {

    int[][][] simpleBoard = new int[16][16][4];
    public Map(){
        int[][][] simpleBoard = {
            //   0          1         2           3         4           5         6         7          8           9         10         11         13         13         14         15        
            {{3,0,3,0}, {3,0,0,3}, {3,0,3,0}, {3,0,0,0}, {3,0,0,0}, {3,0,0,0}, {3,0,0,0}, {3,0,0,0}, {3,0,0,0}, {3,0,0,0}, {3,0,0,0}, {3,0,0,3}, {3,0,3,0}, {3,3,0,0}, {3,0,0,0}, {3,0,0,3}}, // 0
            {{0,0,3,0}, {0,3,0,3}, {0,0,3,0}, {0,0,0,3}, {3,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,3}, {3,0,3,0}, {0,0,0,0}, {0,0,0,3}}, // 1
            {{0,0,3,0}, {3,0,0,3}, {0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,3,0,3}, {0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,3}}, // 2
            {{0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,3,0,3}, {0,0,3,0}, {0,0,0,0}, {3,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,3,0,3}}, // 3
            {{0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {3,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {3,0,0,3}}, // 4
            {{0,3,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,3,0,0}, {0,0,0,0}, {0,0,0,3}, {0,3,3,0}, {0,0,0,3}}, // 5
            {{3,0,3,0}, {0,0,0,0}, {0,0,0,3}, {0,3,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,3,0,0}, {0,3,0,0}, {0,0,0,0}, {0,0,0,0}, {3,0,0,3}, {0,0,3,0}, {0,0,0,0}, {3,0,0,0}, {0,0,0,3}}, // 6
            {{0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {3,0,0,0}, {0,0,0,0}, {0,3,0,0}, {0,0,0,3}, {3,3,3,3}, {3,3,3,3}, {0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,3}}, // 7
            {{0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {3,0,0,3}, {0,0,3,3}, {3,3,3,3}, {3,3,3,3}, {0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,3}}, // 8
            {{0,0,3,0}, {0,3,0,3}, {0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {3,0,0,0}, {3,3,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,3,0,3}, {0,0,0,3}}, // 9
            {{0,0,3,0}, {3,0,0,0}, {0,0,0,0}, {0,0,0,3}, {0,3,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {3,0,0,3}, {0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {3,0,0,0}, {0,3,0,3}}, // 10
            {{0,3,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {3,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,3}, {0,3,3,0}, {0,0,0,0}, {3,0,0,3}}, // 11
            {{3,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,3,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,3,0,0}, {0,0,0,0}, {0,0,0,0}, {3,0,0,0}, {0,0,0,0}, {0,0,0,3}}, // 12
            {{0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,3,0,0}, {0,0,0,0}, {3,0,0,3}, {0,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,3}, {3,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,3}}, // 13
            {{0,0,3,0}, {0,0,0,0}, {0,0,0,3}, {3,0,3,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,3}}, // 14
            {{0,3,3,0}, {0,3,0,0}, {0,3,0,0}, {0,3,0,0}, {0,3,0,0}, {0,3,0,0}, {0,3,0,3}, {0,3,3,0}, {0,3,0,0}, {0,3,0,0}, {0,3,0,0}, {0,3,0,3}, {0,3,3,0}, {0,3,0,0}, {0,3,0,0}, {0,3,0,3}}  // 15
        };


    }

    public int[] getSquare(int x, int y){
        int[] cell = this.simpleBoard[y][x];
        return cell;
    }
}