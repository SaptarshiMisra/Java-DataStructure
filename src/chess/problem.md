- https://hackr.io/blog/how-to-build-a-java-chess-game-app
- https://www.geeksforgeeks.org/design-a-chess-game/
- https://www.cs.tufts.edu/comp/150SEN/p2.html


## Step 1: Key models
- Spot:
    A spot represents one block of the 8×8 grid and an optional piece.
- Piece: King, Queen, Rook, Bishop, Knight, Pawn
    The basic building block of the system, every piece will be placed on a spot. Piece class is an abstract class. The extended classes (Pawn, King, Queen, Rook, Knight, Bishop) implements the abstracted operations.
- Board: 
    Board is an 8×8 set of boxes containing all active chess pieces.
- Player: 
    Player class represents one of the participants playing the game.
- Move: 
    Represents a game move, containing the starting and ending spot. The Move class will also keep track of the player who made the move.
- Game: 
    This class controls the flow of a game. It keeps track of all the game moves, which player has the current turn, and the final result of the game.

## Step 2: Chess Game Mechanics

    Here's a concise rundown of how each piece moves:

- King: Can move one square in any direction.
- Queen: Capable of moving any number of squares along a row, column, or diagonal.
- Rook: Travels any number of squares along a row or column.
- Bishop: Diagonally moves over any number of squares.
- Knight: Leaps in an 'L' shape, covering two squares in one direction and then one square perpendicular, or vice versa, able to jump over other pieces.
- Pawn: Advances forward by one square (or two from its initial position), captures diagonally, and is subject to unique moves like 'en passant' and promotion.


    Chessboard Representation

We can represent the chessboard in Java using a two-dimensional array, with each cell corresponding to a square on the chessboard.

This array can hold objects that represent chess pieces, with each piece knowing its type (king, queen, rook, etc.) and color (white or black).

    Implementing Game Logic

The chess game logic involves enforcing the rules for each piece's movement, including special rules like castling (a move involving the king and one of the rooks) and pawn promotion.

Additionally, the game must detect check, checkmate, and stalemate conditions:

- Check: The king is threatened but can avoid capture.
- Checkmate: The king is threatened with no legal moves to evade capture.
- Stalemate: The player to move is not in check but has no legal moves.


    Modeling Pieces and Moves in Java


Each chess piece can be modeled as an object in Java, with properties for its type and color and methods to determine legal moves from a given position on the board.

This approach allows us to use polymorphism, where each piece type (subclass) implements movement logic specific to its characteristics, adhering to the rules of chess.

By understanding these chess game mechanics and how they can be represented in code, we have laid the initial groundwork for developing our Java chess game.

Now, without further ado, let’s have some fun and get coding!

## Step 3: Designing the Chess Board

### 1.0 Piece class
        public abstract class Piece {
            protected Position position;
            protected PieceColor color;
        
            public Piece(PieceColor color, Position position) {
                this.color = color;
                this.position = position;
            }
        
            public PieceColor getColor() {
                return color;
            }
            
            public Position getPosition() {
                return position;
            }
            
            public void setPosition(Position position) {
                this.position = position;
            }
        
            public abstract boolean isValidMove(Position newPosition, Piece[][] board);
        
        }

##### In this code, we’ve:

- Defined 
  - An abstract Piece class with color and position attributes and 
  - an abstract method isValidMove() to determine if a move is legal.
  - Defined a getColor() getter method to return the piece's color, which will be essential for determining which player the piece belongs to.
  - Defined a getPosition() getter to provide access to the piece's current position on the chessboard.
  - Defined a setPosition setter method for updating a piece's position.

- This setup allows for polymorphism when moving pieces, making it a great way to get more practice with essential OOP concepts.

### 1.1 PieceColor class
    public enum PieceColor {
        BLACK, WHITE;
    }

### 1.2 Position class to represent positions on the chessboard.

Let's create a `Position.java` file to create the Position class. This will hold row and column values corresponding to a piece's location on the board.

    public class Position {
        private int row;
        private int column;
        
        public Position(int row, int column) {
            this.row = row;
            this.column = column;
        }
        
        public int getRow() {
            return row;
        }
        
        public int getColumn() {
            return column;
        }
    }
- #### Each specific piece class (e.g., Rook, Bishop) will then extend Piece and implement the isValidMove method to check for legal moves according to chess rules.

### 2. Chessboard Class 

        public class ChessBoard {
        private Piece[][] board;
        
        public ChessBoard() {
        this.board = new Piece[8][8]; // 8x8 chessboard
        setupPieces();
        }
        
        private void setupPieces() {
        // Place Rooks
        board[0][0] = new Rook(PieceColor.BLACK, new Position(0, 0));
        board[0][7] = new Rook(PieceColor.BLACK, new Position(0, 7));
        board[7][0] = new Rook(PieceColor.WHITE, new Position(7, 0));
        board[7][7] = new Rook(PieceColor.WHITE, new Position(7, 7));
        // Place Knights
        board[0][1] = new Knight(PieceColor.BLACK, new Position(0, 1));
        board[0][6] = new Knight(PieceColor.BLACK, new Position(0, 6));
        board[7][1] = new Knight(PieceColor.WHITE, new Position(7, 1));
        board[7][6] = new Knight(PieceColor.WHITE, new Position(7, 6));
        // Place Bishops
        board[0][2] = new Bishop(PieceColor.BLACK, new Position(0, 2));
        board[0][5] = new Bishop(PieceColor.BLACK, new Position(0, 5));
        board[7][2] = new Bishop(PieceColor.WHITE, new Position(7, 2));
        board[7][5] = new Bishop(PieceColor.WHITE, new Position(7, 5));
        // Place Queens
        board[0][3] = new Queen(PieceColor.BLACK, new Position(0, 3));
        board[7][3] = new Queen(PieceColor.WHITE, new Position(7, 3));
        // Place Kings
        board[0][4] = new King(PieceColor.BLACK, new Position(0, 4));
        board[7][4] = new King(PieceColor.WHITE, new Position(7, 4));
        // Place Pawns
        for (int i = 0; i < 8; i++) {
        board[1][i] = new Pawn(PieceColor.BLACK, new Position(1, i));
        board[6][i] = new Pawn(PieceColor.WHITE, new Position(6, i));
        }
        }
        }

In this code, we're:

- We define the ChessBoard class with a 2D array representing the chessboard.
- The constructor initializes the board and calls setupPieces() to place pieces in their starting positions.

