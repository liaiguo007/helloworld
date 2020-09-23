package workerthread;

public class Main {

public static void main(String[] args) {

	Channel channel = new Channel(5);

	channel.startaWorkers();

	new ClientThread("Alice", channel).start();

	new ClientThread("Bob", channel).start();

	new ClientThread("Cici", channel).start();

}

}