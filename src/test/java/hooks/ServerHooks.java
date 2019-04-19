package hooks;

import nicebank.AtmServer;
import org.junit.After;
import org.junit.Before;


public class ServerHooks {

    public static final int PORT = 8887;
    private AtmServer server;

    @Before
    public void startServer() throws Exception {
        server = new AtmServer(PORT);
        server.start();
    }

    @After
    public void serverStop() throws Exception {
        server.stop();
    }

}
