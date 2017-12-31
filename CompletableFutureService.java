package rafa.indra.es;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class CompletableFutureService extends CompletableFuture<String> {

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return super.isDone();
	}

	@Override
	public String get() throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		return super.get();
	}

	@Override
	public String get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
		return super.get(timeout, unit);
	}

	@Override
	public String join() {
		// TODO Auto-generated method stub
		return super.join();
	}

	@Override
	public String getNow(String valueIfAbsent) {
		// TODO Auto-generated method stub
		return super.getNow(valueIfAbsent);
	}

	@Override
	public boolean complete(String value) {
		// TODO Auto-generated method stub
		return super.complete(value);
	}

	@Override
	public boolean completeExceptionally(Throwable ex) {
		// TODO Auto-generated method stub
		return super.completeExceptionally(ex);
	}

	@Override
	public <U> CompletableFuture<U> thenApply(Function<? super String, ? extends U> fn) {
		// TODO Auto-generated method stub
		return super.thenApply(fn);
	}

	@Override
	public <U> CompletableFuture<U> thenApplyAsync(Function<? super String, ? extends U> fn) {
		// TODO Auto-generated method stub
		return super.thenApplyAsync(fn);
	}

	@Override
	public <U> CompletableFuture<U> thenApplyAsync(Function<? super String, ? extends U> fn, Executor executor) {
		// TODO Auto-generated method stub
		return super.thenApplyAsync(fn, executor);
	}

	@Override
	public CompletableFuture<Void> thenAccept(Consumer<? super String> action) {
		// TODO Auto-generated method stub
		return super.thenAccept(action);
	}

	@Override
	public CompletableFuture<Void> thenAcceptAsync(Consumer<? super String> action) {
		// TODO Auto-generated method stub
		return super.thenAcceptAsync(action);
	}

	@Override
	public CompletableFuture<Void> thenAcceptAsync(Consumer<? super String> action, Executor executor) {
		// TODO Auto-generated method stub
		return super.thenAcceptAsync(action, executor);
	}

	@Override
	public CompletableFuture<Void> thenRun(Runnable action) {
		// TODO Auto-generated method stub
		return super.thenRun(action);
	}

	@Override
	public CompletableFuture<Void> thenRunAsync(Runnable action) {
		// TODO Auto-generated method stub
		return super.thenRunAsync(action);
	}

	@Override
	public CompletableFuture<Void> thenRunAsync(Runnable action, Executor executor) {
		// TODO Auto-generated method stub
		return super.thenRunAsync(action, executor);
	}

	@Override
	public <U, V> CompletableFuture<V> thenCombine(CompletionStage<? extends U> other,
			BiFunction<? super String, ? super U, ? extends V> fn) {
		// TODO Auto-generated method stub
		return super.thenCombine(other, fn);
	}

	@Override
	public <U, V> CompletableFuture<V> thenCombineAsync(CompletionStage<? extends U> other,
			BiFunction<? super String, ? super U, ? extends V> fn) {
		// TODO Auto-generated method stub
		return super.thenCombineAsync(other, fn);
	}

	@Override
	public <U, V> CompletableFuture<V> thenCombineAsync(CompletionStage<? extends U> other,
			BiFunction<? super String, ? super U, ? extends V> fn, Executor executor) {
		// TODO Auto-generated method stub
		return super.thenCombineAsync(other, fn, executor);
	}

	@Override
	public <U> CompletableFuture<Void> thenAcceptBoth(CompletionStage<? extends U> other,
			BiConsumer<? super String, ? super U> action) {
		// TODO Auto-generated method stub
		return super.thenAcceptBoth(other, action);
	}

	@Override
	public <U> CompletableFuture<Void> thenAcceptBothAsync(CompletionStage<? extends U> other,
			BiConsumer<? super String, ? super U> action) {
		// TODO Auto-generated method stub
		return super.thenAcceptBothAsync(other, action);
	}

	@Override
	public <U> CompletableFuture<Void> thenAcceptBothAsync(CompletionStage<? extends U> other,
			BiConsumer<? super String, ? super U> action, Executor executor) {
		// TODO Auto-generated method stub
		return super.thenAcceptBothAsync(other, action, executor);
	}

	@Override
	public CompletableFuture<Void> runAfterBoth(CompletionStage<?> other, Runnable action) {
		// TODO Auto-generated method stub
		return super.runAfterBoth(other, action);
	}

	@Override
	public CompletableFuture<Void> runAfterBothAsync(CompletionStage<?> other, Runnable action) {
		// TODO Auto-generated method stub
		return super.runAfterBothAsync(other, action);
	}

	@Override
	public CompletableFuture<Void> runAfterBothAsync(CompletionStage<?> other, Runnable action, Executor executor) {
		// TODO Auto-generated method stub
		return super.runAfterBothAsync(other, action, executor);
	}

	@Override
	public <U> CompletableFuture<U> applyToEither(CompletionStage<? extends String> other,
			Function<? super String, U> fn) {
		// TODO Auto-generated method stub
		return super.applyToEither(other, fn);
	}

	@Override
	public <U> CompletableFuture<U> applyToEitherAsync(CompletionStage<? extends String> other,
			Function<? super String, U> fn) {
		// TODO Auto-generated method stub
		return super.applyToEitherAsync(other, fn);
	}

	@Override
	public <U> CompletableFuture<U> applyToEitherAsync(CompletionStage<? extends String> other,
			Function<? super String, U> fn, Executor executor) {
		// TODO Auto-generated method stub
		return super.applyToEitherAsync(other, fn, executor);
	}

	@Override
	public CompletableFuture<Void> acceptEither(CompletionStage<? extends String> other,
			Consumer<? super String> action) {
		// TODO Auto-generated method stub
		return super.acceptEither(other, action);
	}

	@Override
	public CompletableFuture<Void> acceptEitherAsync(CompletionStage<? extends String> other,
			Consumer<? super String> action) {
		// TODO Auto-generated method stub
		return super.acceptEitherAsync(other, action);
	}

	@Override
	public CompletableFuture<Void> acceptEitherAsync(CompletionStage<? extends String> other,
			Consumer<? super String> action, Executor executor) {
		// TODO Auto-generated method stub
		return super.acceptEitherAsync(other, action, executor);
	}

	@Override
	public CompletableFuture<Void> runAfterEither(CompletionStage<?> other, Runnable action) {
		// TODO Auto-generated method stub
		return super.runAfterEither(other, action);
	}

	@Override
	public CompletableFuture<Void> runAfterEitherAsync(CompletionStage<?> other, Runnable action) {
		// TODO Auto-generated method stub
		return super.runAfterEitherAsync(other, action);
	}

	@Override
	public CompletableFuture<Void> runAfterEitherAsync(CompletionStage<?> other, Runnable action, Executor executor) {
		// TODO Auto-generated method stub
		return super.runAfterEitherAsync(other, action, executor);
	}

	@Override
	public <U> CompletableFuture<U> thenCompose(Function<? super String, ? extends CompletionStage<U>> fn) {
		// TODO Auto-generated method stub
		return super.thenCompose(fn);
	}

	@Override
	public <U> CompletableFuture<U> thenComposeAsync(Function<? super String, ? extends CompletionStage<U>> fn) {
		// TODO Auto-generated method stub
		return super.thenComposeAsync(fn);
	}

	@Override
	public <U> CompletableFuture<U> thenComposeAsync(Function<? super String, ? extends CompletionStage<U>> fn,
			Executor executor) {
		// TODO Auto-generated method stub
		return super.thenComposeAsync(fn, executor);
	}

	@Override
	public CompletableFuture<String> whenComplete(BiConsumer<? super String, ? super Throwable> action) {
		// TODO Auto-generated method stub
		return super.whenComplete(action);
	}

	@Override
	public CompletableFuture<String> whenCompleteAsync(BiConsumer<? super String, ? super Throwable> action) {
		// TODO Auto-generated method stub
		return super.whenCompleteAsync(action);
	}

	@Override
	public CompletableFuture<String> whenCompleteAsync(BiConsumer<? super String, ? super Throwable> action,
			Executor executor) {
		// TODO Auto-generated method stub
		return super.whenCompleteAsync(action, executor);
	}

	@Override
	public <U> CompletableFuture<U> handle(BiFunction<? super String, Throwable, ? extends U> fn) {
		// TODO Auto-generated method stub
		return super.handle(fn);
	}

	@Override
	public <U> CompletableFuture<U> handleAsync(BiFunction<? super String, Throwable, ? extends U> fn) {
		// TODO Auto-generated method stub
		return super.handleAsync(fn);
	}

	@Override
	public <U> CompletableFuture<U> handleAsync(BiFunction<? super String, Throwable, ? extends U> fn,
			Executor executor) {
		// TODO Auto-generated method stub
		return super.handleAsync(fn, executor);
	}

	@Override
	public CompletableFuture<String> toCompletableFuture() {
		// TODO Auto-generated method stub
		return super.toCompletableFuture();
	}

	@Override
	public CompletableFuture<String> exceptionally(Function<Throwable, ? extends String> fn) {
		// TODO Auto-generated method stub
		return super.exceptionally(fn);
	}

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		// TODO Auto-generated method stub
		return super.cancel(mayInterruptIfRunning);
	}

	@Override
	public boolean isCancelled() {
		// TODO Auto-generated method stub
		return super.isCancelled();
	}

	@Override
	public boolean isCompletedExceptionally() {
		// TODO Auto-generated method stub
		return super.isCompletedExceptionally();
	}

	@Override
	public void obtrudeValue(String value) {
		// TODO Auto-generated method stub
		super.obtrudeValue(value);
	}

	@Override
	public void obtrudeException(Throwable ex) {
		// TODO Auto-generated method stub
		super.obtrudeException(ex);
	}

	@Override
	public int getNumberOfDependents() {
		// TODO Auto-generated method stub
		return super.getNumberOfDependents();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
