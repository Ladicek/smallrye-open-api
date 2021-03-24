package test.io.smallrye.openapi.runtime.scanner.jakarta;

import org.eclipse.microprofile.openapi.annotations.Components;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.security.OAuthFlow;
import org.eclipse.microprofile.openapi.annotations.security.OAuthFlows;
import org.eclipse.microprofile.openapi.annotations.security.OAuthScope;
import org.eclipse.microprofile.openapi.annotations.security.SecurityScheme;

import jakarta.ws.rs.core.Application;

@OpenAPIDefinition(info = @Info(title = "RolesNotAllowed App", version = "1.0"), components = @Components(securitySchemes = {
        @SecurityScheme(securitySchemeName = "noTypeScheme", flows = @OAuthFlows(clientCredentials = @OAuthFlow, implicit = @OAuthFlow(scopes = {
                @OAuthScope(name = "scope1", description = "Provided by OAI annotation") }))) }))
public class RolesNotAllowedApp extends Application {

}
