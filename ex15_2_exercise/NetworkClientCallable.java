package ex15_2_exercise;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.net.Socket;
import java.util.Scanner;

public class NetworkClientCallable implements Callable<RequestResponse> {

    private final RequestResponse lookup;

    public NetworkClientCallable(RequestResponse lookup) {
        this.lookup = lookup;
    }

    @Override
    public RequestResponse call() throws IOException {
        try (Socket sock = new Socket(lookup.host, lookup.port);
             Scanner scanner = new Scanner(sock.getInputStream())) {
            lookup.response = scanner.next();
            return lookup;
        }
    }

}
