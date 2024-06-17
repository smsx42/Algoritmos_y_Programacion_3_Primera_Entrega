package Item;

import org.fiuba.algoritmos3.Modificacion;
import org.fiuba.algoritmos3.Pokemon;

public class HiperPocion extends ItemsCuracion {


    public HiperPocion(String nombre, int cantidad, Modificacion unaModificacion){
        super(nombre, cantidad);
        this.unaModificacion = unaModificacion;
    }

    @Override
    public boolean aplicarItem(Pokemon unPokemon) {

        boolean realizo = realizarUsadoItemsDeCuracion(unPokemon.getEstadisticas());
        this.unaModificacion.modificar(unPokemon.getEstadisticas(), 100);
        return realizo;
    }

    public void mostrarItem() {
        System.out.println(nombre + ": Restaura 100 de vida - Cantidad: " + cantidad);
    }
}

