package rafa.indra.es;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.execute();
	}
	
	public void execute() {
		ServicioExecutor servicio = new ServicioExecutor();
		
		try {
			System.out.println("Lanzamos ServiceExecutor");
			Future<String> future = servicio.processVeryLong("test");
			String result = null;
			try {
				result = future.get();
				System.out.println(result);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("FIN");
	}
}
