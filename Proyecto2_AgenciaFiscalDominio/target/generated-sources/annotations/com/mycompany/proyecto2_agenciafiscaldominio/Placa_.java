package com.mycompany.proyecto2_agenciafiscaldominio;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-17T15:02:46", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Placa.class)
public class Placa_ { 

    public static volatile SingularAttribute<Placa, Float> costo;
    public static volatile SingularAttribute<Placa, String> numeroAlfaNumerico;
    public static volatile SingularAttribute<Placa, Date> fechaEmision;
    public static volatile SingularAttribute<Placa, Long> id;
    public static volatile SingularAttribute<Placa, Date> fechaRecepcion;

}