package com.github.j0hncena.chess.movement;

public class BoardBoundary implements MovementBehavior {

	@Override
	public boolean isValid(int fromX, int fromY, int toX, int toY) {
		return false;
	}

}
