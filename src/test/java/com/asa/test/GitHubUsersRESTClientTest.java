package com.asa.test;

import com.asa.client.GitHubUsersRESTClient;
import com.asa.model.GitHubUser;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;

public class GitHubUsersRESTClientTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig();
    }

    GitHubUsersRESTClient client = new GitHubUsersRESTClient();
    GitHubUser user;

    @Test
    public void testClientWithCorrectUsername(){
        String existingUser = "ciprianpavel";
        user = client.getUserData(existingUser);
        System.out.println(user);
        assert (user.getLogin().equalsIgnoreCase(existingUser));
    }
    @Test
    public void testClientWithIncorrectUsername(){
        String inexistentUser = "fnuixhguhnfuinhufiren";
        user = client.getUserData(inexistentUser);
        System.out.println(user);
        assert (user.getLogin() == null);
    }

    @Test
    public void testClientWithoutUsername(){
        try {
            client.getUserData(null);
            assert false;
        }
        catch (NullPointerException npe){
            assert true;
        }
    }
}