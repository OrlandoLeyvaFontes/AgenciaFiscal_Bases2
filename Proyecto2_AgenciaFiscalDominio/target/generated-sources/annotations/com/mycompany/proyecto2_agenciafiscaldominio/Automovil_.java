package com.mycompany.proyecto2_agenciafiscaldominio;

import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-30T18:11:37", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Automovil.class)
public class Automovil_ { 

    public static volatile SingularAttribute<Automovil, String> numeroSerie;
    public static volatile SingularAttribute<Automovil, String> marca;
    public static volatile SingularAttribute<Automovil, Clientes> cliente;
    public static volatile SingularAttribute<Automovil, String> color;
    public static volatile SingularAttribute<Automovil, Long> id;
    public static volatile SingularAttribute<Automovil, String> modelo;
    public static volatile SingularAttribute<Automovil, String> linea;

}