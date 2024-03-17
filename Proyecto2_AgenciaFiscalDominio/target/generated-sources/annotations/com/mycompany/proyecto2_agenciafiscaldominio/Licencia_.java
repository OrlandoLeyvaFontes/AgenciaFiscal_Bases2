package com.mycompany.proyecto2_agenciafiscaldominio;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-16T19:05:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Licencia.class)
public class Licencia_ { 

    public static volatile SingularAttribute<Licencia, Date> fechaVigencia;
    public static volatile SingularAttribute<Licencia, Float> costo;
    public static volatile SingularAttribute<Licencia, Date> fechaEmision;
    public static volatile SingularAttribute<Licencia, Long> id;

}