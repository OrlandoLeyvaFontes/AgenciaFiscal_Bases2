package com.mycompany.proyecto2_agenciafiscaldominio;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-19T19:24:38", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Licencia.class)
public class Licencia_ { 

    public static volatile SingularAttribute<Licencia, Integer> vigencia;
    public static volatile SingularAttribute<Licencia, Float> costoNormal;
    public static volatile SingularAttribute<Licencia, Float> costoDiscapaitados;
    public static volatile SingularAttribute<Licencia, Long> id;

}