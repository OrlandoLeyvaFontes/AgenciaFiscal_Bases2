package entidades_JPA;

import entidades_JPA.Automovil;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-31T22:48:28", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Placa.class)
public class Placa_ extends Tramite_ {

    public static volatile SingularAttribute<Placa, String> numeroPlacas;
    public static volatile SingularAttribute<Placa, Calendar> fechaInactivo;
    public static volatile SingularAttribute<Placa, Automovil> automovil;
    public static volatile SingularAttribute<Placa, String> estado;

}