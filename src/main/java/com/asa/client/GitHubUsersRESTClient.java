package com.asa.client;

import com.asa.model.GitHubUser;

import javax.validation.constraints.NotNull;
import javax.ws.rs.client.WebTarget;

public class GitHubUsersRESTClient extends GitHubRESTClient{

    private WebTarget userTarget;

    public GitHubUsersRESTClient(){
        userTarget = getClient().target("https://api.github.com/users/{username}");
    }

    public GitHubUser getUserData(@NotNull String username){
        return userTarget.resolveTemplate("username",username).request("application/json").get().readEntity(GitHubUser.class);
    }

}
