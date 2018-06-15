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
public interface Player {
	void bomb(int x, int y);
	void goAhead();
	void setOpponentReady();
	void sendMessage(String s);
	void exit();
}