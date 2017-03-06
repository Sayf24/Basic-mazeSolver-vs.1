package mazeSolver;

import java.util.Arrays;

public class pathFinder {
	static int x = 0;
	static int y = 0;
	static int goalx = 2;
	static int goaly = 4;
	public static String[][] maze = new String[5][5];
	public String[][] visited = new String[5][5];

	public static void main(String[] args) {
		createMaze(maze);
		//System.out.println(Arrays.deepToString(maze));
		if(solve(x,y)){
			System.out.println("maze solved");
		}
		//System.out.println(Arrays.deepToString(maze));
	}
	public static boolean solve(int x,int y){
		System.out.println("check");
		System.out.println(y);
		System.out.println(x);
		System.out.println(Arrays.deepToString(maze));

		if(x==goalx&&y==goaly){
			System.out.println("done");
			return true;
		}
		if(y<4 && maze[y+1][x]=="o"){
			maze[y][x]="v";
			y=y+1;
			solve(x,y);
		}
		if(y>1 && maze[y-1][x]=="o"){
			maze[y][x]="v";
			y=y-1;
			solve(x,y);

		}
		if(x< 4 && maze[y][x+1]=="o"){
			maze[y][x]="v";
			x=x+1;
			solve(x,y);
		}
		if(x>1 && maze[y][x-1]=="o"){
			maze[y][x]="v";
			x= x-1;
			solve(x,y);
		}else{
			return true;
		}
		return false;
	}

	
	
	public static void createMaze(String[][] a){
		a[0][0]="o";
		a[0][1]="o";
		a[0][2]="x";
		a[0][3]="o";
		a[0][4]="o";
		a[1][0]="o";
		a[1][1]="o";
		a[1][2]="o";
		a[1][3]="o";
		a[1][4]="o";
		a[2][0]="o";
		a[2][1]="x";
		a[2][2]="o";
		a[2][3]="x";
		a[2][4]="x";
		a[3][0]="x";
		a[3][1]="x";
		a[3][2]="o";
		a[3][3]="x";
		a[3][4]="x";
		a[4][0]="x";
		a[4][1]="x";
		a[4][2]="o";
		a[4][3]="x";
		a[4][4]="x";
		
		
	}
}
