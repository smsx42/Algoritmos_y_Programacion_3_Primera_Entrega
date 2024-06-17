package Tipo;
import static org.fiuba.algoritmos3.Constantes.*;

public class Volador extends Tipo {

    public Volador(){
        super();
        this.nombre = "Volador";
        this.color = ANSI_CELESTECLARO;
        this.completarTablaEfectividad();
    }
    
    @Override
    public void completarTablaEfectividad(){
        this.tablaEfectividad.put(TIPO_BICHO, RELACION_FUERTE);
        this.tablaEfectividad.put(TIPO_ELECTRICO, RELACION_DEBIL);
        this.tablaEfectividad.put(TIPO_LUCHA, RELACION_FUERTE);
        this.tablaEfectividad.put(TIPO_PLANTA, RELACION_FUERTE);
        this.tablaEfectividad.put(TIPO_ROCA, RELACION_DEBIL);
    }
}


