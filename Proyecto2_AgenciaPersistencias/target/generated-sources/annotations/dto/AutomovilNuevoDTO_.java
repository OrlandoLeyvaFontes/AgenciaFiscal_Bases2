package dto;

import entidades_JPA.Clientes;
import entidades_JPA.Placa;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-31T16:44:54", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(AutomovilNuevoDTO.class)
public class AutomovilNuevoDTO_ { 

    public static volatile SingularAttribute<AutomovilNuevoDTO, String> numeroSerie;
    public static volatile SingularAttribute<AutomovilNuevoDTO, String> marca;
    public static volatile SingularAttribute<AutomovilNuevoDTO, Clientes> cliente;
    public static volatile SingularAttribute<AutomovilNuevoDTO, String> color;
    public static volatile SingularAttribute<AutomovilNuevoDTO, Long> id;
    public static volatile SingularAttribute<AutomovilNuevoDTO, String> modelo;
    public static volatile SingularAttribute<AutomovilNuevoDTO, String> linea;
    public static volatile ListAttribute<AutomovilNuevoDTO, Placa> placas;

}