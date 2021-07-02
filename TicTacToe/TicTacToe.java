import java.util.Scanner;
public class TicTacToe{

  public static Scanner in = new Scanner(System.in);

  //this array is used to track Player input on the board
  private static char[][] gameBoard = new char [3][3];
  
  //this assigns X or O to a player
  private static String xPlayer = "Player 1";
  private static String oPlayer = "Player 2";
  
  //checks if user wants to play another game
  private static boolean playGame = true;
  
  //single or two player game?
  private static boolean multiplayer = true;
  
  //tracks current move (true = X, false = O)
  private static boolean currentMove = true;
  
  //this array is used to check for a winner
  private static char[][] winArray = new char [3][3];
  
  //initializes the game and resets the game board
  public static void initGame(){
    for (int row = 0; row < 3; ++row) {
      for (int col = 0; col < 3; ++col) {
        gameBoard[row][col] = ' ';
      }
    }
    int k = 0;
    for (int i = 0; i < 3; ++i) {
      for (int j = 0; j < 3; ++j) {
        winArray[i][j] = (char)k;
        k++;
      }
    }
    currentMove = true;
  }
          
  //this prints the game board
  public static void printBoard(){
    System.out.println("       " + gameBoard[0][0] + "  |  " + gameBoard[0][1] +
      "  |  " + gameBoard[0][2]);
    System.out.println("     -----+-----+-----");
    System.out.println("       " + gameBoard[1][0] + "  |  " + gameBoard[1][1] +
      "  |  " + gameBoard[1][2]);
    System.out.println("     -----+-----+-----");
    System.out.println("       " + gameBoard[2][0] + "  |  " + gameBoard[2][1] +
      "  |  " + gameBoard[2][2]);
    
  }
  
  //Main Menu selection screen, selecting "Exit" ends the program
  public static int mainMenu(){
    int menuSelect = 0;
    while (menuSelect != 1 && menuSelect != 2){
      System.out.println("Main Menu");
      System.out.println("1. New Game");
      System.out.println("2. Exit");
      System.out.print("Selection: ");
      menuSelect = in.nextInt();
      System.out.println();
      if (menuSelect != 1 && menuSelect != 2){
        System.out.println("Invalid input! Please make a valid selection.");
      }
    }
    return menuSelect;
  }
  
  //Player selection screen, selecting "Main Menu" returns you to the Main Menu
  public static int playerSelect(){
    int pSelect = 0;
    while (pSelect != 1 && pSelect != 2 && pSelect != 3){
      System.out.println("Player Select:");
      System.out.println("1. One Player");
      System.out.println("2. Two Player");
      System.out.println("3. Main Menu");
      System.out.print("Selection: ");
      pSelect = in.nextInt();
      System.out.println();
      if (pSelect != 1 && pSelect != 2 && pSelect != 3){
        System.out.println("Invalid input! Please make a valid selection.");
      }
    }
    return pSelect;
  }
  
  //Player 1 selects X or O, and Player 2/CPU is assigned the latter
  public static void tokenSelect(){
    char token = 'a';
    while (token != 'x' && token != 'o' && token != 'X' && token != 'O'){
      System.out.print("Player 1 - Select Between 'X' or 'O': ");
      token = in.next().charAt(0);
      System.out.println();
      if (token != 'x' && token != 'o' && token != 'X' && token != 'O'){
        System.out.println("Invalid input! Please make a valid selection.");
      }
    }
    if (token == 'o' || token == 'O'){
      xPlayer = "Player 2";
      oPlayer = "Player 1";
      if (multiplayer == false) xPlayer = "CPU";
    }
    if (token == 'x' || token == 'X'){
      xPlayer = "Player 1";
      oPlayer = "Player 2";
      if (multiplayer == false) oPlayer = "CPU";
    }
    
  }
  
  //Initiates 1 player mode
  public static void onePlayer(){
    for (int i = 0; i < 9; i++){
      printBoard();
      int row = 5;
      int col = 5;
      if (currentMove == true){
        while ((row != 0 && row != 1 && row != 2) || 
          (col != 0 && col != 1 && col != 2) || 
          (gameBoard[row][col] == 'X') || (gameBoard[row][col] == 'O')){
          if (xPlayer == "Player 1"){
            System.out.println(xPlayer + " (X) select row and column: ");
            row = (in.nextInt() - 1);
            col = (in.nextInt() - 1);
            if ((row != 0 && row != 1 && row != 2) || 
              (col != 0 && col != 1 && col != 2) || 
              (gameBoard[row][col] == 'X') || (gameBoard[row][col] == 'O')){
              System.out.print("Invalid input! ");
              System.out.println("Please make a valid selection.");
            }
          }
          else {
            int cpuRow = 4;
            int cpuCol = 4;
            for (int m = 0; m < 3; ++m) {
              for (int n = 0; n < 3; ++n) {
                if ((gameBoard[m][n] != 'X') && (gameBoard[m][n] != 'O')){
                  cpuRow = m;
                  cpuCol = n;
                }  
              }
            }
            row = cpuRow;
            col = cpuCol;
            System.out.println("CPU selects : " + ++cpuRow + " " + ++cpuCol);
          }
        }
        gameBoard[row][col] = 'X';
        winArray[row][col] = 'X';
        currentMove = false;
      }
      else {
        while ((row != 0 && row != 1 && row != 2) || 
          (col != 0 && col != 1 && col != 2) || 
          (gameBoard[row][col] == 'X') || (gameBoard[row][col] == 'O')){
          if (oPlayer == "Player 1"){
            System.out.println(oPlayer + " (O) select row and column: ");
            row = in.nextInt() - 1;
            col = in.nextInt() - 1;
            if ((row != 0 && row != 1 && row != 2) || 
              (col != 0 && col != 1 && col != 2) || 
              (gameBoard[row][col] == 'X') || (gameBoard[row][col] == 'O')){
                System.out.print("Invalid input! ");
                System.out.println("Please make a valid selection.");
            }
          }
          else {
            int cpuRow = 4;
            int cpuCol = 4;
            for (int x = 0; x < 3; ++x) {
              for (int y = 0; y < 3; ++y) {
                if ((gameBoard[x][y] != 'X') && (gameBoard[x][y] != 'O')){
                  cpuRow = x;
                  cpuCol = y;
                }  
              }
            }
            row = cpuRow;
            col = cpuCol;
            System.out.println("CPU selects : " + cpuRow + " " + cpuCol);
          }
        }          
        gameBoard[row][col] = 'O';
        winArray[row][col] = 'O';
        currentMove = true;
      }
      if (isWin() == true){
        printBoard();
        System.out.println("Match complete! " + gameBoard[row][col] + " wins!");
        break;
      }
    }
  }
  
  
  //Initiates 2 player mode
  public static void twoPlayer(){
    for (int i = 0; i < 9; i++){
      printBoard();
      int row = 5;
      int col = 5;
      if (currentMove == true){
        while ((row != 0 && row != 1 && row != 2) || 
          (col != 0 && col != 1 && col != 2) || 
          (gameBoard[row][col] == 'X') || (gameBoard[row][col] == 'O')){
          System.out.println(xPlayer + " (X) select row and column: ");
          row = (in.nextInt() - 1);
          col = (in.nextInt() - 1);
          if ((row != 0 && row != 1 && row != 2) || 
            (col != 0 && col != 1 && col != 2) || 
            (gameBoard[row][col] == 'X') || (gameBoard[row][col] == 'O')){
            System.out.println("Invalid input! Please make a valid selection.");
          }
        }
        gameBoard[row][col] = 'X';
        winArray[row][col] = 'X';
        currentMove = false;
      }
      else {
        while ((row != 0 && row != 1 && row != 2) || 
          (col != 0 && col != 1 && col != 2) || 
          (gameBoard[row][col] == 'X') || (gameBoard[row][col] == 'O')){
          System.out.println(oPlayer + " (O) select row and column: ");
          row = in.nextInt() - 1;
          col = in.nextInt() - 1;
          if ((row != 0 && row != 1 && row != 2) || 
            (col != 0 && col != 1 && col != 2) || 
            (gameBoard[row][col] == 'X') || (gameBoard[row][col] == 'O')){
            System.out.println("Invalid input! Please make a valid selection.");
          }
        }          
        gameBoard[row][col] = 'O';
        winArray[row][col] = 'O';
        currentMove = true;
      }
      if (isWin() == true){
        printBoard();
        System.out.println("Congrats! " + gameBoard[row][col] + " wins!");
        break;
      }
    }
  }
  
  //Checks for a winner after every turn
  public static boolean isWin(){
    if ((winArray[0][0] == winArray[0][1] && winArray[0][1] == winArray[0][2])
      || (winArray[1][0] == winArray[1][1] && winArray[1][1] == winArray[1][2])
      || (winArray[2][0] == winArray[2][1] && winArray[2][1] == winArray[2][2])
      || (winArray[0][0] == winArray[1][0] && winArray[1][0] == winArray[2][0])
      || (winArray[0][1] == winArray[1][1] && winArray[1][1] == winArray[2][1])
      || (winArray[0][2] == winArray[1][2] && winArray[1][2] == winArray[2][2])
      || (winArray[0][0] == winArray[1][1] && winArray[1][1] == winArray[2][2])
      || (winArray[0][2] == winArray[1][1] && winArray[1][1] == winArray[2][0]))
       return true;
    else return false;
  }
  
  //Main - Runs a game of Tic Tac Toe on a loop until the user opts to quit
  public static void main(String[] args){
    int select;
    
    while (playGame == true){
      initGame();
      select = mainMenu();
      if (select == 2) break;
      if (select == 1) select = playerSelect();
      //If user selects 3, Main Menu and Player Select menu will loop
      while (select == 3) {
        select = mainMenu();
        if (select == 2) break;
        if (select == 1) select = playerSelect();
      }
      if (select == 1) multiplayer = false;
      if (select == 2) multiplayer = true;
      tokenSelect();
      if (select == 1) onePlayer();
      if (select == 2) twoPlayer();
      if (isWin() == false) System.out.println("Draw game!!");
      char playAgain = ' ';
      System.out.println("Game Over.");
      while (playAgain != 'y' && playAgain != 'n' && 
        playAgain != 'Y' && playAgain != 'N'){
        System.out.print("Would you like to play again [y/n]?: ");
        playAgain = in.next().charAt(0);
        System.out.println();
        if (playAgain != 'y' && playAgain != 'n' && 
          playAgain != 'Y' && playAgain != 'N'){
          System.out.println("Invalid input! Please make a valid selection.");
        }
      }
      if (playAgain == 'n' || playAgain == 'N') playGame = false;
    }
  }
}