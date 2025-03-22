package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class EjercicioLinkedList {
	
	/** INSTRUCCIONES
 	Escriba el algoritmo que resuelve el problema en esta clase.
	Debe crear un package llamado umg.edu.gt.test.EjercicioLinkedList que corresponda al Test de esta clase.
	Genere un Test por cada ejemplo y fuerce que uno de esos Test falle, puede implementar retornar un resultado
	y compararlo con el esperado.
	 */
	
	// Usando LinkedList de Java Collections, resuelva los siguientes problemas
	// Problema 1: Dada una LinkedList<Integer>, escribir un método que elimine los valores duplicados, dejando solo la primera aparición de cada número.
	public LinkedList<Integer> eliminarDuplicados(LinkedList<Integer> numeros) {
		LinkedList<Integer> nuevoList = new LinkedList();
		for (int num : numeros) {
			if (!nuevoList.contains(num)){
				nuevoList.add(num);
			}
		}
		return nuevoList;
	}
	// Problema 2: Implementar un método que invierta los elementos de una LinkedList<String> sin usar otra lista o ArrayList.
	
	public LinkedList<String> invertirElementos(LinkedList<String> list){
		Collections.reverse(list);
		return list;
		
	}
	// Problema 3: Dadas dos listas enlazadas ordenadas de enteros, escribir un método que devuelva una nueva LinkedList<Integer> con los elementos de ambas listas intercalados en orden.
	
	public LinkedList<Integer> combinarListas(LinkedList<Integer> list1, LinkedList<Integer> list2){
		LinkedList<Integer> nuevoList = new LinkedList();
		 int i = 0, j = 0;

	        while (i < list1.size() && j < list2.size()) {
	            if (list1.get(i) < list2.get(j)) {
	                nuevoList.add(list1.get(i));
	                i++;
	            } else {
	                nuevoList.add(list2.get(j));
	                j++;
	            }
	        }


	        while (i < list1.size()) {
	            nuevoList.add(list1.get(i));
	            i++;
	        }


	        while (j < list2.size()) {
	            nuevoList.add(list2.get(j));
	            j++;
	        }

	        return nuevoList;
		
	}
}
