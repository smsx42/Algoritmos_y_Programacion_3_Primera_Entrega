package org.fiuba.algoritmos3;

import Tipo.Tipo;

import java.util.Random;

import static org.fiuba.algoritmos3.Constantes.*;

public class HabilidadAtaque extends Habilidad {
    private final Tipo tipo;
    private final int poder;

    public HabilidadAtaque(String nombre, Tipo tipo, int poder, int cantidad){
        super(nombre,cantidad);
        this.tipo = tipo;
        this.poder = poder;
    }

    private double potenciaDeDanio(Tipo tipoPokemon){
        return this.tipo.calcularMultiplicadorDeDanio(tipoPokemon);
    }

    private double calculoAtaqueSegunTipo(Tipo tipoDeUnPokemonPropio, Tipo unTipoPokemonEnemigo) {

        double efectividadTipo = this.potenciaDeDanio(unTipoPokemonEnemigo);
        double mismoTipo = tipoDeUnPokemonPropio.calcularBonusDelMismoTipo(this.tipo);

        Random unRandom = new Random();
        double random = ((double)unRandom.nextInt(38)+217 ) / 255.0;

        return efectividadTipo*mismoTipo*random;
    }

    private double calculoCritico() {
        Random unRandom = new Random();
        int resultado = unRandom.nextInt(100);
        if (resultado < PROBABILIDAD_CRITICO) {
            return NO_CRITICO;
        }
        return CRITICO;
    }

    private double calculoAtaqueSegunEstadisticas(Estadisticas estadisticasPropio, Estadisticas estadisticasEnemigo) {
        double ataque = (double)estadisticasPropio.getAtaque();
        double defensa = (double)estadisticasEnemigo.getDefensa();
        double poderHabilidad = (double) this.poder;
        double critico = this.calculoCritico();
        double nivel = (double)estadisticasPropio.getNivel();

        return (2.0*nivel*poderHabilidad*ataque*critico/(defensa*5.0)+2.0)/50.0;
    }

    private double atacar(Pokemon unPokemonPropio, Pokemon unPokemonEnemigo){
        double danioEstadisticas = this.calculoAtaqueSegunEstadisticas(unPokemonPropio.getEstadisticas(),unPokemonEnemigo.getEstadisticas());
        double danioTipo = this.calculoAtaqueSegunTipo(unPokemonPropio.getTipo(),unPokemonEnemigo.getTipo());
        return danioEstadisticas * danioTipo;
    }

    @Override
    public void usarHabilidad(Pokemon unPokemonEnemigo,Pokemon unPokemonPropio){
        this.cantidadDeUsos -= 1;
        double danio = Math.round(this.atacar(unPokemonPropio,unPokemonEnemigo));
        unPokemonEnemigo.recibirDanio(danio);
        this.mostrarUso(unPokemonEnemigo, unPokemonPropio);
        System.out.println("El daño infligido de la habiilidad: "+this.nombre +" es = " +danio );
    }

    @Override
    public void mostrarHabilidad(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tipo: " + this.tipo.getNombreConColor());
        System.out.println("Poder: " + this.poder);
        System.out.println("Cantidad de usos: " + this.cantidadDeUsos);
        System.out.println("\n");
    }

    @Override
    public void mostrarUso(Pokemon unPokemonEnemigo,Pokemon unPokemon){
        System.out.println("¡" + unPokemon.getNombre() + " usó " + this.getNombre() + "!");
        System.out.println("La vida de " + unPokemonEnemigo.getNombre() + " es = " + unPokemonEnemigo.getVida());
    }


}
