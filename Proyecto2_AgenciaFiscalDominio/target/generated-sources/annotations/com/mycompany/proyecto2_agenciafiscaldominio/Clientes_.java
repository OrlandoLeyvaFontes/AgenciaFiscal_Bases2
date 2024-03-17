package com.mycompany.proyecto2_agenciafiscaldominio;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-17T15:02:46", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, Date> fechaNacimiento;
    public static volatile SingularAttribute<Clientes, Long> id;
    public static volatile SingularAttribute<Clientes, String> nombreCompleto;
    public static volatile SingularAttribute<Clientes, String> telefono;
    public static volatile SingularAttribute<Clientes, String> rfc;

}