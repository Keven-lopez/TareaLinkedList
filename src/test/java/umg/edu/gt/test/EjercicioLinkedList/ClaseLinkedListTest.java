package umg.edu.gt.test.EjercicioLinkedList;


import java.util.LinkedList;

import org.junit.Test;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.*;

public class ClaseLinkedListTest {
	
	@Test
	public void testDuplicados() {
		EjercicioLinkedList prueba = new EjercicioLinkedList();
		LinkedList <Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(40);
		LinkedList<Integer> nuevoList = prueba.eliminarDuplicados(list);
		System.out.println(nuevoList);
	}
	
	@Test
	public void testInvertir() {
		System.out.println("Test Invertir");
		EjercicioLinkedList prueba = new EjercicioLinkedList();
		LinkedList <String> list = new LinkedList<String>();
		list.add("hola");
		list.add("adios");
		list.add("perro");
		list.add("gato");
		LinkedList<String> nuevoList = prueba.invertirElementos(list);
		System.out.println(nuevoList);
	}
	
	@Test
    public void testCombinarListas() {
		System.out.println("Test Combinar");
		EjercicioLinkedList prueba = new EjercicioLinkedList();
		LinkedList <Integer> list = new LinkedList<Integer>();

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        list = prueba.combinarListas(list1, list2);
        System.out.println(list);
	}
}
