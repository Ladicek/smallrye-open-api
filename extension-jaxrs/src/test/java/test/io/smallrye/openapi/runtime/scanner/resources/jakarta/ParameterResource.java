package test.io.smallrye.openapi.runtime.scanner.resources.jakarta;

import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

/**
 * Test case for smallrye-open-api issue #25
 * https://github.com/smallrye/smallrye-open-api/issues/25
 *
 * @author Michael Edgar {@literal <michael@xlate.io>}
 */
@SuppressWarnings("unused")
@Path("params/{taskId}")
public class ParameterResource {

    @DELETE
    @Path("/unnamed")
    @APIResponse(responseCode = "204", description = "No content")
    public Response deleteTaskWithoutParamName(
            @Parameter(description = "The id of the task", example = "e1cb23d0-6cbe-4a29", schema = @Schema(type = SchemaType.STRING)) @PathParam("taskId") String taskId,
            @QueryParam("nextTask") String nextTaskId) {
        return Response.noContent().build();
    }

    @DELETE
    @Path("/named")
    @APIResponse(responseCode = "204", description = "No content")
    public Response deleteTaskWithParamName(
            @Parameter(description = "The id of the task, invalid name discarded when @Parameter and JAX-RS annotation have same target", name = "notTaskId", example = "e1cb23d0-6cbe-4a29", schema = @Schema(type = SchemaType.STRING)) @PathParam("taskId") String taskId) {
        return Response.noContent().build();
    }
}
