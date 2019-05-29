package fr.declaration.variable;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int moy = array[0];
		int somme = 0;
		
		for (int i=0; i<array.length-1; i++) {
			somme = somme + array[i];
			}
		moy = somme/ array.length;
		System.out.println(moy);
	
}
}
