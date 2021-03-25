package test.io.smallrye.openapi.runtime.scanner.jakarta;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.DiscriminatorMapping;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(value = "/pets")
public class DiscriminatorFullDeclaredInResponseTestResource {

    @Path(value = "{id}")
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Operation(summary = "Returns an AbstractPet with a discriminator declared in the response")
    @APIResponse(content = {
            @Content(schema = @Schema(oneOf = { Cat.class, Dog.class,
                    Lizard.class }, discriminatorProperty = "pet_type", discriminatorMapping = {
                            @DiscriminatorMapping(value = "dog", schema = Dog.class) })) })
    @SuppressWarnings(value = "unused")
    public AbstractPet get(@PathParam(value = "id") String id) {
        return null;
    }

}
