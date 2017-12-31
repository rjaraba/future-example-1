package rafa.indra.es;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ServicioExecutor {
	 
	private final ExecutorService executor = Executors.newFixedThreadPool(5);
	
	public Future<String> processVeryLong(String param1) throws InterruptedException {
		
	    return executor.submit(() -> {
	        TimeUnit.SECONDS.sleep(5);
	        System.out.println("Terminando processVeryLong...");
	        return param1.concat(" result");
	    });
	}
}
