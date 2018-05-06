package com.asa.test;

import com.asa.client.GitHubReposRESTClient;
import com.asa.model.GitHubUser;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;

public class GItHubReposRESTClientTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig();
    }

    GitHubReposRESTClient client = new GitHubReposRESTClient();
    String userRepository;

    @Test
    public void testClientWithCorrectUsername(){
        String existingUser = "ciprianpavel";
        userRepository = client.getUserRepositoryData(existingUser);
        System.out.println(userRepository);
        //assert (user.getLogin().equalsIgnoreCase(existingUser));
    }
    @Test
    public void testClientWithIncorrectUsername(){
        String inexistentUser = "fnuixhguhnfuinhufiren";
        userRepository = client.getUserRepositoryData(inexistentUser);
        System.out.println(userRepository);
        //assert (user.getLogin() == null);
    }

    @Test
    public void testClientWithoutUsername(){
        try {
            client.getUserRepositoryData(null);
            assert false;
        }
        catch (NullPointerException npe){
            assert true;
        }
    }
}
