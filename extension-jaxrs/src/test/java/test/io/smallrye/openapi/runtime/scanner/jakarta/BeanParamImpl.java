package test.io.smallrye.openapi.runtime.scanner.jakarta;

import jakarta.ws.rs.CookieParam;

public class BeanParamImpl extends BeanParamBase implements BeanParamAddon {

    @CookieParam(value = "cc1")
    String cc1;

}
