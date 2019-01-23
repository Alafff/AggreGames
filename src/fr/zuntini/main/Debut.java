package fr.zuntini.main;

import java.awt.EventQueue;

import fr.zuntini.fenetres.FenetrePrincipale;

public class Debut {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale window = new FenetrePrincipale();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
