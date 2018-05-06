package com.asa.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class GitHubRESTClient {
    private Client client;

    public GitHubRESTClient() {
        client = ClientBuilder.newClient();
    }
    public Client getClient() {
        return client;
    }

}
