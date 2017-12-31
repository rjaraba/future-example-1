package rafa.indra.es;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompletableFutureTest {

	private ExecutorService executor = null;
	
	@Before
	public void before() {
		System.out.println("Before");
		executor = Executors.newFixedThreadPool(5);
	}
	
	@After
	public void after() throws InterruptedException {
		System.out.println("After");
		executor.awaitTermination(5, TimeUnit.SECONDS);
		executor = null;
		System.out.println("After finalizado");
	}
	
	@Test
	public void testSupplyAsync() {
		CompletableFuture<String> futureSupplyAsync = CompletableFuture.supplyAsync(() -> {
		    System.out.println("Comenzando testSupplyAsync...");
		    try {
				TimeUnit.SECONDS.sleep(3);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    System.out.println("Terminado testSupplyAsync!");
		    return "Terminado";
		}, executor);
		 
		futureSupplyAsync.whenCompleteAsync((s, e) -> System.out.println("Resultado testSupplyAsync: " + s),
		        executor);
		System.out.println("Terminado testSupplyAsync");

	}
	
	@Test
	public void testExceptionally () {
		CompletableFuture<String> futureAsync = CompletableFuture.supplyAsync(() -> {
		    System.out.println("Comenzando supplyAsync with exception...");
		    try {
				TimeUnit.SECONDS.sleep(2);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    System.out.println("Terminado supplyAsync with exception!");
		    throw new RuntimeException("Error en el futuro");
		}, executor);
		 
		CompletableFuture<String> futureEx = futureAsync.exceptionally(e -> {
		    System.out.println("Resultado con excepción!!" + e.getMessage());
		    return "StringPorDefecto";
		});
		 
		futureEx.whenCompleteAsync((s, e) -> System.out.println("Resultado futureEx: {" + s + "}"),
		        executor);

	}
	
	
	
	@Test
	public void testHandle() {
		CompletableFuture<String> futureAsync = CompletableFuture.supplyAsync(() -> {
		    System.out.println("Comenzando supplyAsync with exception...");
		    try {
				TimeUnit.SECONDS.sleep(2);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    System.out.println("Terminado supplyAsync with exception!");
		    throw new RuntimeException("Error en el futuro");
		}, executor);
		 
		CompletableFuture<String> handledFuture = futureAsync.handleAsync((s, e) -> {
		    if (e != null) {
		    	System.err.println("Resultado con excepción!!" + e.getMessage());
		        return "StringPorDefecto";
		    } else {
		    	System.out.println("Resultado: {" + s + "}");
		        return s;
		    }
		}, executor);
		 
		handledFuture.whenCompleteAsync((s, e) -> System.out.println("Resultado handle: {" + s + "}"),
		        executor);

	}
}
