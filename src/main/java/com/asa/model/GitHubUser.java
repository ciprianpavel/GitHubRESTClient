package com.asa.model;

import javax.json.*;
import javax.json.bind.annotation.JsonbProperty;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class GitHubUser implements Serializable {
    private String login;
    private String id;
    @JsonbProperty(value = "avatar_url")
    private String avatarURL;
    @JsonbProperty(value = "gravatar_id")
    private String gravatarId;
    private String url;
    @JsonbProperty(value = "html_url")
    private String htmlURL;
    @JsonbProperty(value = "followers_url")
    private String followersURL;
    @JsonbProperty(value = "following_url")
    private String followingURL;
    @JsonbProperty(value = "gists_url")
    private String gistsURL;
    @JsonbProperty(value = "starred_url")
    private String starredURL;
    @JsonbProperty(value = "subscriptions_url")
    private String subscriptionsURL;
    @JsonbProperty(value = "organizations_url")
    private String organizationsURL;
    @JsonbProperty(value = "repos_url")
    private String reposURL;
    @JsonbProperty(value = "events_url")
    private String evenstURL;
    @JsonbProperty(value = "received_events_url")
    private String receivedEventsURL;
    private String type;
    @JsonbProperty(value = "site_admin")
    private boolean siteAdmin;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private String hireable;
    private String bio;
    @JsonbProperty(value = "public_repos")
    private int publicRepos;
    @JsonbProperty(value = "public_gists")
    public int publicGists;
    private int followers;
    private int following;
    @JsonbProperty(value = "created_at")
    private Date createdAt;
    @JsonbProperty(value = "updated_at")
    private Date updatedAt;

    public GitHubUser() {
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("login="+getLogin());
        sb.append(" id="+getId());
        sb.append(" avatar_url="+getAvatarURL());

        return sb.toString();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlURL() {
        return htmlURL;
    }

    public void setHtmlURL(String htmlURL) {
        this.htmlURL = htmlURL;
    }

    public String getFollowersURL() {
        return followersURL;
    }

    public void setFollowersURL(String followersURL) {
        this.followersURL = followersURL;
    }

    public String getFollowingURL() {
        return followingURL;
    }

    public void setFollowingURL(String followingURL) {
        this.followingURL = followingURL;
    }

    public String getGistsURL() {
        return gistsURL;
    }

    public void setGistsURL(String gistsURL) {
        this.gistsURL = gistsURL;
    }

    public String getStarredURL() {
        return starredURL;
    }

    public void setStarredURL(String starredURL) {
        this.starredURL = starredURL;
    }

    public String getSubscriptionsURL() {
        return subscriptionsURL;
    }

    public void setSubscriptionsURL(String subscriptionsURL) {
        this.subscriptionsURL = subscriptionsURL;
    }

    public String getOrganizationsURL() {
        return organizationsURL;
    }

    public void setOrganizationsURL(String organizationsURL) {
        this.organizationsURL = organizationsURL;
    }

    public String getReposURL() {
        return reposURL;
    }

    public void setReposURL(String reposURL) {
        this.reposURL = reposURL;
    }

    public String getEvenstURL() {
        return evenstURL;
    }

    public void setEvenstURL(String evenstURL) {
        this.evenstURL = evenstURL;
    }

    public String getReceivedEventsURL() {
        return receivedEventsURL;
    }

    public void setReceivedEventsURL(String receivedEventsURL) {
        this.receivedEventsURL = receivedEventsURL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireable() {
        return hireable;
    }

    public void setHireable(String hireable) {
        this.hireable = hireable;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(int publicRepos) {
        this.publicRepos = publicRepos;
    }

    public int getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(int publicGists) {
        this.publicGists = publicGists;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
