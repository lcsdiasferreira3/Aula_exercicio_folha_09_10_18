package aula;

public class aula_folha {

	public static void main(String[] args) {
		float matriz[][] = new float[3] [3];
		
		matriz[0][0] = 1;
		matriz[0][1] = 10;
		matriz[0][2] = 20;
		
		matriz[1][0] = 2;
		matriz[1][1] = 20;
		matriz[1][2] = 40;
		
		matriz[2][0] = 3;
		matriz[2][1] = 52;
		matriz[2][2] = 74;
		 
		for(int i = 0; i <= 2; i++) {
			for(int x = 0; x <= 2; x++ ) {
			System.out.println(matriz[0][0] + matriz[1][1] + matriz[2][2]);
			System.out.println(matriz[0][2] * matriz[1][1] * matriz[2][0]);
			System.out.println(matriz[1][1] / matriz[2][1]);
			
			
			}	
		
		System.out.println();
		}

	}

}
