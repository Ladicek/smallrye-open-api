package test.io.smallrye.openapi.runtime.scanner.dataobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(value = XmlAccessType.PUBLIC_MEMBER)
public class XmlAccessTypePublicMember {

    public String prop1Field;
    @SuppressWarnings(value = "unused")
    private String prop2Field;

    public String getProp3Property() {
        return null;
    }

}
