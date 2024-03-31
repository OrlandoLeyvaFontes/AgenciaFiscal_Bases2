package dto;

import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-31T16:44:54", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(ClienteNuevoDTO.class)
public class ClienteNuevoDTO_ { 

    public static volatile SingularAttribute<ClienteNuevoDTO, Boolean> discapacitado;
    public static volatile SingularAttribute<ClienteNuevoDTO, Calendar> fechaNacimiento;
    public static volatile SingularAttribute<ClienteNuevoDTO, Long> id;
    public static volatile SingularAttribute<ClienteNuevoDTO, String> nombreCompleto;
    public static volatile SingularAttribute<ClienteNuevoDTO, String> telefono;
    public static volatile SingularAttribute<ClienteNuevoDTO, String> rfc;

}