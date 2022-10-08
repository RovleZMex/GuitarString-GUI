package com.robles.pruebagui;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Esta clase modela una cuerda vibrante de guitarra a una frecuencia dada por
 * el usuario.
 *
 * @autores Gabriel Santiago Robles Robles. Victor Hugo Ramirez Rios. Gustavo
 * Gutierrez Navarro.
 * 
 * @date 07/10/2022
 */
public class GuitarString {

	private final Queue<Double> circularBuffer = new LinkedList<>(); //
	public final double DECAYCONSTANT = 0.996;

	// Constructor de la clase
	public GuitarString(double frequency) {
		if (frequency <= 0) {
			throw new IllegalArgumentException("El valor de la frecuencia es invalido, por favor ingrese un numero mayor a 0.");
		}
		int bufferSize = (int) Math.round(StdAudio.SAMPLE_RATE / frequency);
		if (bufferSize < 2) {
			throw new IllegalArgumentException("El valor de la frecuencia es muy grande, por favor intente con un numero mas pequeño.");
		}
		for (int i = 0; i < bufferSize; i++) {
			circularBuffer.add(0.0);
		}
	}

	public GuitarString(double[] init) {
		if (init.length < 2) {
			throw new IllegalArgumentException("El numero de componentes es muy pequeño, por favor asegurese de mandar por lo menos 2 elementos.");
		}
		for (double value : init) { // value representa el desplazamiento de una cuerda con valor entre -0.5 y 0.5.
			circularBuffer.add(value);
		}
	}

	public void pluck() {
		double randomValue;
		for (int i = 0; i < circularBuffer.size(); i++) {
			randomValue = Math.random() * ((.5 - 0.5) + 1) - 0.5; // Valor aleatorio entre [-0.5, 0.5) 
			circularBuffer.remove();
			circularBuffer.add(randomValue);
		}
	}
           
        /**
         * Este metodo agrega un nuevo elemento a la cola que es igual a la suma
         * del primer y segundo valor, dividido entre dos y multiplicado por una
         * constante de decaimiento y elimina la primera muestra de la cola.
         */
	public void tic() {
		double firstValue = circularBuffer.peek();
		circularBuffer.remove();
		double secondValue = circularBuffer.peek();
		circularBuffer.add((firstValue + secondValue) / 2 * DECAYCONSTANT);
	}

	public double sample() {
		return circularBuffer.peek();
	}
}
