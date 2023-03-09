package view;

import java.util.concurrent.Semaphore;

import controller.ThreadSemaforo;

public class Principal {

	public static void main(String[] args) {
		
		Semaphore semaforo = new Semaphore(1);
		
		for(int i=1;i<4;i++){
			Thread tCruzamento = new ThreadSemaforo(semaforo, i);
			tCruzamento.start();
		}

	}

}