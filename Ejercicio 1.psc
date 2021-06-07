Algoritmo pares_impares
	Definir n, aleat Como Entero
	
	Escribir "Ingrese un numero"
	leer n
	
	Para i=n Hasta 1
		n=n-1
		aleat = Aleatorio(1,100)
		
		Escribir aleat
		Si aleat mod 2 = 0 Entonces
			Escribir "Es par"
		SiNo
			Escribir "No es par"
		Fin Si
		
	Fin Para
	
	

FinAlgoritmo
