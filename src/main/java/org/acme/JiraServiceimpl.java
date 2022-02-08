package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class JiraServiceimpl implements JiraService {

    @Inject
    JiraRepository JiraRepository;


    public JiraServiceimpl() {

    }

    @Transactional
    public List<Jira> GetJiras() {
        return Jira.listAll();
    }


    @Transactional
    public Jira findjiraByid(long id, Jira jira) {
        return JiraRepository.findjiraByid(id, jira);
    }




    @Transactional
    public Jira UpdateJira(long id, Jira jira) {
        return JiraRepository.updateJira(id, jira);
    }


    public Jira PostJira(Jira jira) {
        return JiraRepository.postJira(jira);
    }

    @Transactional
    public String DeleteJira(long id) {
        return JiraRepository.findanddelete(id);
    }
}