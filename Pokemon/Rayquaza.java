package pokemon.pokemon;

public class Articuno extends Pokemon {
    public Articuno(Tipo tipo, int PS, int Ataque, int Defensa, int AtaqueEspecial, int DefensaEspecial, int Velocidad, int Nivel) {
        super(Tipo.DRAGON.VOLADOR, 105, 150, 90, 150, 90, 95,10);

        ListaMovimientos listaMovimientos = new ListaMovimientos();

        Movimiento[] movimientos = new Movimiento[4];
        movimientos[0] = listaMovimientos.buscarMovimientoPorNombre("Ciclon");
        movimientos[1] = listaMovimientos.buscarMovimientoPorNombre("Tajo aereo");
        movimientos[2] = listaMovimientos.buscarMovimientoPorNombre("Ascenso Draco");
        movimientos[3] = listaMovimientos.buscarMovimientoPorNombre("Triturar");

        setMovimientos(movimientos);
    }

    @Override
    public double obtenerEfectividad(Pokemon pokemon) {
        double efectividad = 1.0;

        //No efectivo
        if (pokemon.getTipo() == Tipo.ROCA) efectividad = 0.0;
        
        //No muy efectivo
        if (pokemon.getTipo() == Tipo.ACERO) efectividad = 0.25;
        if (pokemon.getTipo() == Tipo.ELECTRICO) efectividad = 0.25;
        if (pokemon.getTipo() == Tipo.FUEGO) efectividad = 0.25;
        if (pokemon.getTipo() == Tipo.BICHO) efectividad = 0.50;
        if (pokemon.getTipo() == Tipo.PLANTA) efectividad = 0.50;
        
        //Muy efectivo
        if (pokemon.getTipo() == Tipo.TIERRA) efectividad = 4.0;
       
        return efectividad;     
    }
}
