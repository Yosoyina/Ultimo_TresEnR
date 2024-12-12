package Ejercicios;
import java.util.Scanner;
import java.util.Random;
public class TresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		Random numAl = new Random ();
		
		// Apartado de los Jugadores
		
		String Jugador1;
		String Jugador2;
		String TurnoJug = "";
		
		// Apartado de los contadores de los jugadores 
		
		int contJ1 = 0;
		int contJ2 = 0;
		
		// Apartado de la moneda
		
		int moneda = 0;
		
		moneda = numAl.nextInt(2)+1;
			
		// Apartado del Tablero del Tres en raya
		
		String [][] Tabla = {{"-", "-", "-"},
				             {"-", "-", "-"},
				             {"-", "-", "-"}};
		
		
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|         Bienvenido al Juego de Tres en Raya          |");
		System.out.println("|______________________________________________________|");
		
		System.out.println("");
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|          Introducce el nombre al Jugador 1           |");
		System.out.println("|______________________________________________________|");
		
		Jugador1 = teclado.next(); // El jugador 1 introuducce su nombre
		
		System.out.println("");
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|          Introducce el nombre al Jugador 2           |");
		System.out.println("|______________________________________________________|");
		
		Jugador2 = teclado.next(); // El jugador 2 introuducce su nombre
		
		// Aparatado de la Condicion ( Cara ) que es igual a 1
		
		if(moneda == 1) {
			
			TurnoJug = Jugador1;
			
			System.out.println(" ____________________________________");
			System.out.println("|                                    |");
			System.out.println("|    Ha salido Cara   " + Jugador1 +"|");
			System.out.println("|____________________________________|");
			
		}
		
		// Aparatado de la Condicion ( Cruz ) que es igual a 2
		
		else if (moneda == 2) {
			
			TurnoJug = Jugador2;
			
			System.out.println(" ____________________________________");
			System.out.println("|                                    |");
			System.out.println("|    Ha salido Cruz  " + Jugador2 +" |");
			System.out.println("|____________________________________|");
			
		}
		
		System.out.println("");
		
		// Parte de las rondas 
		
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|            Tabla Actual del tres en Raya             |");
		System.out.println("|______________________________________________________|");
		
		System.out.println("");
		
		while(true) { // bucle verdadero para los turnos de cada jugador 
			
			// En este bucle el recorrido for mostramos la tabla actual de tres en raya
			
			for (int filas = 0; filas < Tabla.length; filas++) {
				for (int columnas = 0; columnas < Tabla[filas].length; columnas++) {
					
					System.out.print(Tabla[filas][columnas] + " ");
					
				}
				System.out.println("");
			} // acaba el recorrido de la tabla del tres en raya
			
			System.out.println("");
			
			// En este aparatdo decimos que jugador le toca su turno
			
			System.out.println(" ______________________________________________________");
			System.out.println("|                                                      |");
			System.out.println("|         " +TurnoJug + "   este jugador comienza      |");
			System.out.println("|______________________________________________________|");
			
			boolean ficha = false;
			
			while(!ficha) {
				
				int fila, columna; // variables para la matrizes
				
				System.out.println(" ______________________________________________________");
				System.out.println("|                                                      |");
				System.out.println("|            Escoge la fila que es 1, 2, 3             |");
				System.out.println("|______________________________________________________|");
				
				fila = teclado.nextInt() -1; // Esta variable es para la matriz para cuando el jugador introduza se de la m,atriz un 0, 1, 2.
				
				while(fila < 1 || fila > 3) {
					
					System.out.println(" _______________________________________________________________");
					System.out.println("|                                                               |");
					System.out.println("|            Escoge de nuevo la fila que es 1, 2, 3             |");
					System.out.println("|_______________________________________________________________|");
					
					fila = teclado.nextInt() -1;
				}
				
				
				System.out.println(" ______________________________________________________");
				System.out.println("|                                                      |");
				System.out.println("|            Escoge la columna que es 1                |");
				System.out.println("|                                     2                |");
				System.out.println("|                                     3                |");
				System.out.println("|______________________________________________________|");
				
				columna = teclado.nextInt() -1; // Esta variable es para la matriz para cuando el jugador introduza se de la m,atriz un 0, 1, 2.
				
				while(columna < 1 || columna > 3) {
					
					System.out.println(" _______________________________________________________________");
					System.out.println("|                                                               |");
					System.out.println("|            Escoge de nuevo la columna que es 1                |");
					System.out.println("|                                              2                |");
					System.out.println("|                                              3                |");
					System.out.println("|_______________________________________________________________|");
					
					columna = teclado.nextInt() -1;
				}
				
				/* Este apartado es para verificar si la casilla está vacía
				 *  en las fila i columnas se comprueba la condicion que equivale al mismo tabletra con lo unico que
				 *  cuenta esque si se encuentra alguna ficha colocada donde la coloco un jugador saldra un 
				 *  mensaje diciento que ese lugar esta ocupado
				 */
                if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && Tabla[fila][columna].equals("-")) {
                    
                	// Colocar la ficha según el turno de cada jugador
                    if (TurnoJug.equals(Jugador1)) { 
                    	// si se cumple la condicion el jugador uno tendra la x 
                    	// si no se cumple la condicon el jugador dos tendra la o
                    	
                        Tabla[fila][columna] = "X";
                        
                    } else {
                    	
                        Tabla[fila][columna] = "O";
                        
                    }
                    
                    ficha = true; // en esta parte le decimos que la ficha X, O se ha puesto
                    
                } 
                
                // en este aparatado es por si alguna ficha estaba puesta 
                else {
                	
                	System.out.println(" ______________________________");
					System.out.println("|                              |");
                    System.out.println("|    Este sitio esta ocupado   |");
                    System.out.println("|______________________________|");
                    
                }	
			}
			
			
			// Aparatado para verificar si el jugador 1 o 2 ha ganado
            boolean Jg = false;
            
            for (int i = 0; i < 3; i++) {
                // En este aratado se verifica las filas para ver si ha ganado el J1 o J2
            	
            	/*
            	 * Dentro de este bucle recorrera las tres filas si las x o las o de cada jugador 
            	 * son iguales asi si los tres son iguales uno de los dos jugadores a ganado
            	 *  y si no son iguales con el guion pasara a la siguiente fila o columnas hasta 
            	 *  encontrar al  jugador ganador
            	 */
            	
            	
                if (Tabla[i][0].equals(Tabla[i][1]) && Tabla[i][1].equals(Tabla[i][2]) && !Tabla[i][0].equals("-")) {
                    Jg = true;
                    break; // se rompe la condicion de las filas
                }
                // En este aratado se verifica las filas para ver si ha ganado elñ J1 o J2
                if (Tabla[0][i].equals(Tabla[1][i]) && Tabla[1][i].equals(Tabla[2][i]) && !Tabla[0][i].equals("-")) {
                    Jg = true;
                    break; // se rompe la condicion de las columnas
                }
            }
            
            // Apartado para verificar las diagonales 
            
            // En esta condicion lo que hace es que verifica la diagonal \
            if (Tabla[0][0].equals(Tabla[1][1]) && Tabla[1][1].equals(Tabla[2][2]) && !Tabla[0][0].equals("-")) {
                Jg = true;
            }
            
         // En esta condicion lo que hace es que verifica la diagonal /
            
            if (Tabla[0][2].equals(Tabla[1][1]) && Tabla[1][1].equals(Tabla[2][0]) && !Tabla[0][2].equals("-")) {
                Jg = true;
            }
			
            
            // si la condicion es verdadera
            if (Jg) {
                // Apartado para mostrar el tablero del tres en raya 
                for (int filas = 0; filas < Tabla.length; filas++) {
                    for (int columnas = 0; columnas < Tabla[filas].length; columnas++) {
                        System.out.print(Tabla[filas][columnas] + " ");
                    }
                    System.out.println("");
                }
                // Printea al jugador Ganador del tres en raya
                
                System.out.println(" ___________________________________________");
				System.out.println("|                                           |");
                System.out.println("|     "+TurnoJug + " ha ganado el juego!    |");
                System.out.println("|___________________________________________|");
                
             // Apartado para incrementar la victoria de las rondas de los dos jugadores
                if (TurnoJug.equals(Jugador1)) {
                	
                    contJ1++; // Se le incremet a al jugador 1 una ronda ganada
                    
                } else {
                	
                    contJ2++; // Se le incremet a al jugador 2 una ronda ganada
                    
                }
                
                break;
            }
			
         // Apartado para verificar si ha habido empate entre los dos jugadores
            boolean empate = true;
            
            
            // esto es para verificar de que alguna casilla tenga un guion tato por filas como por columnas
            for (int filas = 0; filas < 3; filas++) {
                for (int columnas = 0; columnas < 3; columnas++) {
                    if (Tabla[filas][columnas].equals("-")) {
                        empate = false; // Si hay alguna casilla vacía no habra un empate ya que no se ha completado el tablero
                    }
                }
            }
            
            
            // En este bucle recorrea todas las filas i columnas del tablero confirmado que ninguna casilñla este vacia
            if (empate) {
                for (int filas = 0; filas < Tabla.length; filas++) {
                    for (int columnas = 0; columnas < Tabla[filas].length; columnas++) {
                        System.out.print(Tabla[filas][columnas] + " ");
                    }
                    System.out.println("");
                }
                
                System.out.println(" ______________");
				System.out.println("|              |");
                System.out.println("|    Empate    |");
                System.out.println("|______________|");
                
                break;// se rompe la condicion
            }
            
            
         // Apartado para cambiar el turno de los jugadores
            
            if (TurnoJug.equals(Jugador1)) {
            	
                TurnoJug = Jugador2;
                
            } else {
            	
                TurnoJug = Jugador1;
                
            }
            
            
            System.out.println(" ________________________________________________");
			System.out.println("|                                                |");
            System.out.println("|     Quieres repetir la revancha ???   (s/n)    |");
            System.out.println("|________________________________________________|");
            
            String revancha = teclado.next(); // introducce el usuario si quiere seguir la ronda
            
            if (!revancha.equalsIgnoreCase("s")) { 
            	
            	// en esta condicion ignora el caso que es la s por si pone la n i nos saldra el mensaje saliendo de los juegos i con los resultados de cada jugador
            	
            	System.out.println(" __________________________________________________________");
    			System.out.println("                                                           ");
                System.out.println("                    Saliendo del Juego...                  ");
                System.out.println(" __________________________________________________________");
                System.out.println("                                                           ");
                System.out.println("                    Resultado Finales                      ");
                System.out.println(" __________________________________________________________");
                System.out.println("                                                           ");
                System.out.println("  " + Jugador1 + "  ha ganado estas rondas  "+ contJ1 +"   ");
                System.out.println(" __________________________________________________________");
                System.out.println("                                                           ");
                System.out.println("  " + Jugador2 + "  ha ganado estas rondas  "+ contJ2 +"   ");
                System.out.println(" __________________________________________________________");
                
                
                break; // Sale del bucle i se rompe la condicion
            }  
		} // acaba el bucle while de las rondas
	}
}
