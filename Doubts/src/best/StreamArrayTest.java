package best;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamArrayTest {

	public static void main(String[] args) {
		System.out.println("Arrays.asList() method................: " + arraysAsListMethod() + " ms");
		System.out.println("Arrays.stream() method................: " + arraysStreamMethod() + " ms");
		System.out.println("Stream.of() method....................: " + streamOfMethod() + " ms");
		System.out.println("Arrays.asList() (premade array) method: " + presetArraysAsListMethod() + " ms");
		System.out.println("Arrays.stream() (premade array) method: " + presetArraysStreamMethod() + " ms");
		System.out.println("Stream.of() (premade array) method....: " + presetStreamsOfMethod() + " ms");
	}

	private static Long timeOneMillion(Runnable runner) {
		MilliTimer mt = MilliTimer.start();
		for (int i = 0; i < 1000000; i++) {
			runner.run();
		}
		return mt.end();
	}

	private static Long timeOneMillion(String[] strings, Consumer<String[]> consumer) {
		MilliTimer mt = MilliTimer.start();
		for (int i = 0; i < 1000000; i++) {
			consumer.accept(strings);
		}
		return mt.end();
	}

	public static Long arraysAsListMethod() {
		return timeOneMillion(() -> Arrays.asList(
				new String[] { "hallo", "hi", "test", "test2", "test3", "test4", "test5", "test6", "test7", "test8" })
				.forEach(StreamArrayTest::doSomething));
	}

	public static Long arraysStreamMethod() {
		return timeOneMillion(() -> Arrays.stream(
				new String[] { "hallo", "hi", "test", "test2", "test3", "test4", "test5", "test6", "test7", "test8" })
				.forEach(StreamArrayTest::doSomething));
	}

	public static Long streamOfMethod() {
		return timeOneMillion(
				() -> Stream.of("hallo", "hi", "test", "test2", "test3", "test4", "test5", "test6", "test7", "test8")
						.forEach(StreamArrayTest::doSomething));
	}

	public static Long presetArraysAsListMethod() {
		String[] strings = new String[] { "hallo", "hi", "test", "test2", "test3", "test4", "test5", "test6", "test7",
				"test8" };
		return timeOneMillion(strings, (s) -> Arrays.asList(s).forEach(StreamArrayTest::doSomething));
	}

	public static Long presetArraysStreamMethod() {
		String[] strings = new String[] { "hallo", "hi", "test", "test2", "test3", "test4", "test5", "test6", "test7",
				"test8" };
		return timeOneMillion(strings, (s) -> Arrays.stream(s).forEach(StreamArrayTest::doSomething));
	}

	public static Long presetStreamsOfMethod() {
		String[] strings = new String[] { "hallo", "hi", "test", "test2", "test3", "test4", "test5", "test6", "test7",
				"test8" };
		return timeOneMillion(strings, (s) -> Stream.of(s).forEach(StreamArrayTest::doSomething));
	}

	public static void doSomething(String s) {
		String result = s;
		for (int i = 0; i < 10; i++) {
			result = result.concat(s);
		}
	}
}
