package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
   private Board board;
   
   public ChessMatch() {
	   board=new Board (8,8);
	   initialSetup();
   }
	public ChessPiece[][]getPieces(){
		
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()]; 
		for (int i = 0;i<board.getRows();i++) {
		for(int j=0;j<board.getColums();j++) {
	       mat[i][j]=(ChessPiece)board.piece(i,j);
		}
	   }
	   return mat;
	}
	private void placeNewPiece(char colunm,int row,ChessPiece piece) {
		board.placePiece(piece, new Chessposition(colunm, row).toPosition());
	}
    public void initialSetup() {
    	placeNewPiece('b',6,new Rook(board, Color.White));
    	placeNewPiece('e',8,new King(board, Color.Black));
    	placeNewPiece('e',1,new King(board, Color.White));
    }
}
