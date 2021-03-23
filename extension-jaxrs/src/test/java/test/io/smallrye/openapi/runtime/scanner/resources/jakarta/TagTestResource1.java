package test.io.smallrye.openapi.runtime.scanner.resources.jakarta;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/tags1")
@Tag(name = "tag3", description = "TAG3 from TagTestResource1")
@SuppressWarnings("unused")
public class TagTestResource1 {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String getValue1() {
        return null;
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Tag(name = "tag1", description = "TAG1 from TagTestResource1#postValue")
    void postValue(String value) {
    }

    @PATCH
    @Consumes(MediaType.TEXT_PLAIN)
    @Tag
    void patchValue(String value) {
    }
}
