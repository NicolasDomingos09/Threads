package controller;

public class ThreadMatriz extends Thread {
	
	int[] vet;
	int line;
	
	public ThreadMatriz(int[] vet, int line) {
		this.vet = vet;
		this.line = line;
	}
	
	private void sum(int[] vet, int line) {
		int sum = 0;
		for(int num : vet) {
			sum += num;
		}
		System.out.println("Linha: " + line + " Soma: " + sum);
	}
	
	@Override
	public void run() {
		sum(vet, line);
	}
}