package entidades_JPA;

import entidades_JPA.Clientes;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-31T22:48:28", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Tramite.class)
public class Tramite_ { 

    public static volatile SingularAttribute<Tramite, Clientes> cliente;
    public static volatile SingularAttribute<Tramite, Calendar> fechaTramite;
    public static volatile SingularAttribute<Tramite, Float> Costo;
    public static volatile SingularAttribute<Tramite, Integer> id;

}