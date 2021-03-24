package test.io.smallrye.openapi.runtime.scanner;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path(value = "multipart-mixed-array")
public class ResteasyMultipartMixedListTestResource {

    @POST
    @Path(value = "post")
    @Consumes(value = "multipart/mixed")
    @SuppressWarnings(value = "unused")
    public void post(List<RequestBodyWidget> input) {
    }

}
