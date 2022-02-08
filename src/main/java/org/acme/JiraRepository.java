package org.acme;

        import io.quarkus.hibernate.orm.panache.PanacheRepository;

        import javax.enterprise.context.ApplicationScoped;
        import javax.transaction.Transactional;
        import javax.ws.rs.NotFoundException;


@ApplicationScoped
public class JiraRepository implements PanacheRepository<Jira> {


//    List<Jira> getJirasByStatus(String status) {
//        List<Jira> jiras = listAll();
//        List<Jira> response = new ArrayList<>();
//        for (Jira jira : jiras) {
//            if (jira.label.equals(status)) {
//                response.add(jira);
//            }
//        }
//        return response;
//    }






    public Jira updateJira(long id, Jira jira) {
        Jira entity = Jira.findById(id);
        if (entity == null) {
            throw new NotFoundException();
        }
        entity.issue = jira.issue;
        entity.summary = jira.summary;
        entity.persist();
        return entity;
    }

    public Jira postJira(Jira jira) {
        jira.persist();
        return jira;
    }

    @Transactional
    public Jira findjiraByid(long id, Jira jira) {

        return findById(id);
    }

    String findanddelete(long id) {
        Jira jira = findById(id);
        if (jira.isPersistent()) {
            if (deleteById(id) == true) {
                return "Item is deleted with id" + id;
            }
        }
        return "Item is not deleted with id";
    }
}