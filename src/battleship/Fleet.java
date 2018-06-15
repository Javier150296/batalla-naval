/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author JavierLeon
 */
import java.util.*;
import javaapplication5.Game;

import ships.Ship;

public class Fleet {

	private ArrayList<Ship> ships;
	private Game game;
	
	
	public Fleet(Game game){
		this.game = game;
		ships = new ArrayList<Ship>();
		ships.add(new Ship(5, "Portaaviones", this));
		ships.add(new Ship(4, "Buque de guerra", this));
		ships.add(new Ship(3, "Destructor", this));
		ships.add(new Ship(3, "Submarino", this));
		ships.add(new Ship(2, "Bote Patrullero", this));						
		
	}
	
	
	public boolean shipLeft(int index){
		
		return !ships.get(index).isPlaced();
	}
	
	
	public boolean isPlaced(){
		boolean isPlaced = true;
		for(Ship s:ships)
		{
			if (isPlaced){
				isPlaced = s.isPlaced();
			}
		}
		return isPlaced;
	}
	
	public Ship getShip(int index) {
		return ships.get(index);
	}

	public void isSunk(){
		boolean isSunk = true;
		for (Ship s: ships){
			if (isSunk){
				isSunk = s.isSunk();
			}
		}
		if (isSunk)
			game.printToStatusField("Has ganado!");		
	}
}
