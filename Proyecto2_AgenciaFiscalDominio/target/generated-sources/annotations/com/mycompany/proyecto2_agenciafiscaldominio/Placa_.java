package com.mycompany.proyecto2_agenciafiscaldominio;

import com.mycompany.proyecto2_agenciafiscaldominio.Automovil;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-29T08:53:34", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Placa.class)
public class Placa_ extends Tramite_ {

    public static volatile SingularAttribute<Placa, String> numeroPlacas;
    public static volatile SingularAttribute<Placa, Calendar> fechaInactivo;
    public static volatile SingularAttribute<Placa, Automovil> automovil;
    public static volatile SingularAttribute<Placa, String> estado;

}