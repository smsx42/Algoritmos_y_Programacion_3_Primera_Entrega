package org.fiuba.algoritmos3;

public class Constantes {
    public static final String OPCION_UNO = "1";
    public static final String OPCION_DOS = "2";

    public static final String OPCION_TRES = "3";
    public static final String OPCION_CUATRO = "4";
    public static final String OPCION_CINCO = "5";

    public static final int LIMITE_CARACTERES = 50;
    public static final double PORCENTAJE = 0.1;

    public static final double PORCENTAJE_VENENO = 0.05;
    public static final String ESTADO_NORMAL = "Normal";
    public static final String ESTADO_INHABILITADO = "Inhabilitado";
    public static final String ESTADO_PARALIZADO = "Paralizado";
    public static final String ESTADO_DORMIDO = "Dormido";
    public static final String ESTADO_ENVENENADO = "Envenenado";

    public static final String TIPO_AGUA = "Agua";
    public static final String TIPO_BICHO = "Bicho";
    public static final String TIPO_DRAGON = "Dragon";
    public static final String TIPO_ELECTRICO = "Electrico";
    public static final String TIPO_FANTASMA = "Fantasma";
    public static final String TIPO_FUEGO = "Fuego";
    public static final String TIPO_HIELO = "Hielo";
    public static final String TIPO_LUCHA = "Lucha";
    public static final String TIPO_NORMAL = "Normal";
    public static final String TIPO_PLANTA = "Planta";
    public static final String TIPO_PSIQUICO = "Psiquico";
    public static final String TIPO_ROCA = "Roca";
    public static final String TIPO_TIERRA = "Tierra";
    public static final String TIPO_VENENO = "Veneno";
    public static final String TIPO_VOLADOR = "Volador";

    public static final String RELACION_FUERTE = "Fuerte";
    public static final String RELACION_NORMAL = "Normal";

    public static final String RELACION_DEBIL = "Debil";
    public static final String RELACION_NULA = "Nula";
    public static final double MULTIPLICADOR_FUERTE = 2;
    public static final double MULTIPLICADOR_DEBIL = 0.5;
    public static final double MULTIPLICADOR_NULA = 0;
    public static final double MULTIPLICADOR_NEUTRAL = 1;
    public static final double BONUS_MISMO_TIPO = 1.5;
    public static final double BONUS_NEUTRAL = 1;
    public static final int PROBABILIDAD_CRITICO = 90;
    public static final double CRITICO = 2.0;
    public static final double NO_CRITICO = 1.0;

    public static final String ANSI_NEGRO = "\u001B[30m";
    public static final String ANSI_ROJO = "\u001B[31m";
    public static final String ANSI_VERDE = "\u001B[32m";
    public static final String ANSI_AMARILLO = "\u001B[33m";
    public static final String ANSI_CELESTE = "\u001B[34m";
    public static final String ANSI_PURPURA = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLANCO = "\u001B[37m";
    public static final String ANSI_MAGENTA = "\\u001B[45m";
    
    public static final String ANSI_LILA = "\u001b[38;5;99m";
    public static final String ANSI_VERDEOSCURO = "\u001b[38;5;34m";
    public static final String ANSI_VERDECLARO = "\u001b[38;5;47m";
    public static final String ANSI_CELESTECLARO = "\u001b[38;5;195m";
    public static final String ANSI_MARRON = "\u001b[38;5;94m";
    public static final String ANSI_MARRONOSCURO = "\u001b[38;5;88m";
    public static final String ANSI_ROSACLARO = "\u001b[38;5;213m";
    public static final String ANSI_GRISCLARO = "\u001b[38;5;7m";
    public static final String ANSI_GRISOSCURO = "\u001b[38;5;8m";
    public static final String ANSI_NARANJA = "\u001b[38;5;203m";
    public static final String ANSI_AZUL = "\u001b[38;5;21m";
    public static final String ANSI_AZULFUERTE = "\u001b[38;5;12m";
    public static final String ANSI_VIOLETA = "\u001b[38;5;134m";
    public static final String ANSI_VIOLETAOSCURO = "\u001b[38;5;5m";

    public static final String ANSI_FONDO_NEGRO = "\u001B[40m";
    public static final String ANSI_FONDO_ROJO = "\u001B[41m";
    public static final String ANSI_FONDO_VERDE = "\u001B[42m";
    public static final String ANSI_FONDO_AMARILLO = "\u001B[43m";
    public static final String ANSI_FONDO_AZUL = "\u001B[44m";
    public static final String ANSI_FONDO_PURPURA = "\u001B[45m";
    public static final String ANSI_FONDO_CYAN = "\u001B[46m";
    public static final String ANSI_FONDO_BLANCO = "\u001B[47m";
    public static final String ANSI_FONDO_VIOLETA = "\u001b[48;5;93m";
    
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_UNDERLINE = "\u001B[4m";







    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }




}
