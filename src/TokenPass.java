public class TokenPass {
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        for (int i = 0; i < playerCount;i++)
        {
            board[i] = (int) (10 * Math.random());
        }
        currentPlayer = (int) (playerCount * Math.random());
    }

    public void distributeCurrentPlayerTokens()
    {
        int nextPlayer = currentPlayer;
        int numToDistribute = board[currentPlayer];
        board[currentPlayer] = 0;

        while (numToDistribute > 0)
        {
            nextPlayer = (nextPlayer + 1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }

    public int gameOver(int numToDistribute)
    {
        
    }

    public int[] printBoard()
    {
        return board;
    }

    public int nextPlayer()
    {

    }
}
