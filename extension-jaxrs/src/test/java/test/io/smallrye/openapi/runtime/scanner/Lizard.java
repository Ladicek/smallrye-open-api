package test.io.smallrye.openapi.runtime.scanner;

import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder(value = { "type", "lovesRocks" })
public class Lizard extends AbstractPet {

    boolean lovesRocks;

}
