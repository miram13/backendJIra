package org.acme;

import java.util.List;


public interface JiraService {
    List<Jira> GetJiras();

    Jira findjiraByid(long id, Jira jira);

//    List<Jira> getJiraByStatus(String status);


    Jira PostJira(Jira jira);

    Jira UpdateJira(long id, Jira jira);

    String DeleteJira(long id);


}