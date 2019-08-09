import java.util.ArrayList;
import java.util.List;

//linkedList
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>(); // polimorfismo vector =arreglo 1
		lista.add("Primero");
		lista.add("Segundo");
		lista.add("Tercero");
		lista.add(1, "Intermedio");
		lista.remove(1);

		// System.out.println(lista.indexOf("Tercero"));

		for (int i = 0; i < lista.size(); i++) {// recorrer lista
			System.out.println(lista.get(i));//valor
		}
		for(String i: lista) {//elementos iterables
		System.out.println(i);
		}
	}

}
