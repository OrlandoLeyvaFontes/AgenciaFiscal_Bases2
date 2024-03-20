package com.mycompany.proyecto2_agenciafiscaldominio;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-19T19:24:38", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Tramite.class)
public class Tramite_ { 

    public static volatile SingularAttribute<Tramite, Date> fechaRealizacion;
    public static volatile SingularAttribute<Tramite, Float> costo;
    public static volatile SingularAttribute<Tramite, String> nombreSolicitante;
    public static volatile SingularAttribute<Tramite, Long> id;
    public static volatile SingularAttribute<Tramite, String> tipoTramite;

}