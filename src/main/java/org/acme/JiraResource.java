
package org.acme;

        import javax.inject.Inject;
        import javax.transaction.Transactional;
        import javax.ws.rs.*;
        import javax.ws.rs.core.MediaType;
        import javax.ws.rs.core.Response;
        import java.util.List;

@Path("/Jira")
public class JiraResource {


    @Inject
    JiraService jiraService;

    @GET
    @Path("/jira")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Jira> Jirawithqwery(@QueryParam("issue") String issue) {
        return (List<Jira>) jiraService.GetJiras();
    }

//
//    @GET
//    @Path("/jiraByStatus")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Transactional
//    public List<Jira> jiraByStatus(@QueryParam("status") String status) {
//        return jiraService.jiraByStatus(status);
//    }



    @POST
    @Path("/jira")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Jira PostJira(Jira jira) {
     return jiraService.PostJira(jira);
//        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/jira/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Jira UpdateJira(@PathParam("id") long id, Jira jira) {
        return jiraService.UpdateJira(id, jira);
    }

    @GET
    @Path("/jira/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Jira findjiraByid(@PathParam("id") long id, Jira jira) {
        return jiraService.findjiraByid(id, jira);
    }


    @DELETE
    @Path("/jira/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteJira(@PathParam("id") long id) {
        return jiraService.DeleteJira(id);
    }
}