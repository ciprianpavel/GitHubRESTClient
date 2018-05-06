package com.asa.client;

import javax.validation.constraints.NotNull;
import javax.ws.rs.client.WebTarget;

public class GitHubReposRESTClient extends GitHubRESTClient {

    private WebTarget userReposTarget;

    public GitHubReposRESTClient(){
        super();
        userReposTarget = getClient().target("https://api.github.com/users/{username}/repos");
    }

    public String getUserRepositoryData(@NotNull String username){
        return userReposTarget.resolveTemplate("username",username).request("application/json").get().readEntity(String.class);
    }


}
