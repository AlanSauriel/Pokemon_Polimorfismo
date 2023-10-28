package pokemon.pokemon;

public class Rayquaza extends Pokemon {
    public Rayquaza(Tipo tipo, int PS, int Ataque, int Defensa, int AtaqueEspecial, int DefensaEspecial, int Velocidad, int Nivel) {
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
        if (pokemon.getTipo() == Tipo.ROCA) efectividad = 0.50;
        if (pokemon.getTipo() == Tipo.DRAGON) efectividad = 0.50;
        if (pokemon.getTipo() == Tipo.HADA) efectividad = 0.50;
        
        
        //No muy efectivo
        if (pokemon.getTipo() == Tipo.AGUA) efectividad = 1.0;
        if (pokemon.getTipo() == Tipo.FUEGO) efectividad = 1.0;
        if (pokemon.getTipo() == Tipo.BICHO) efectividad = 1.0;
        if (pokemon.getTipo() == Tipo.LUCHA) efectividad = 1.00;
        
        //Muy efectivo
        if (pokemon.getTipo() == Tipo.PLANTA) efectividad = 4.0;
       
        return efectividad;     
    }
}
