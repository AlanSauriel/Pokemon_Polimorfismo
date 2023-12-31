package pokemon.pokemon;

public class Mewtwo extends Pokemon {
    public Mew(Tipo tipo, int PS, int Ataque, int Defensa, int AtaqueEspecial, int DefensaEspecial, int Velocidad, int Nivel) {
        super(Tipo.PSIQUICO, 106, 110, 90, 154, 90, 130, 10);
        
        ListaMovimientos listaMovimientos = new ListaMovimientos();
        
        Movimiento[] movimientos = new Movimiento[4];
        movimientos[0] = listaMovimientos.buscarMovimientoPorNombre("Confusion");
        movimientos[1] = listaMovimientos.buscarMovimientoPorNombre("Metoros");
        movimientos[2] = listaMovimientos.buscarMovimientoPorNombre("Poder Pasado");
        movimientos[3] = listaMovimientos.buscarMovimientoPorNombre("Psicorte");
        
        setMovimientos(movimientos);
    }

    @Override
    public double obtenerEfectividad(Pokemon pokemon) {
        double efectividad = 1.0;
        
        //No efectivo
        if (pokemon.getTipo() == Tipo.BICHO) efectividad = 0.50;
        if (pokemon.getTipo() == Tipo.FANTASMA) efectividad = 0.50;
        if (pokemon.getTipo() == Tipo.SINIESTRO) efectividad = 0.50;
         
        //Efectivo
        if (pokemon.getTipo() == Tipo.LUCHA) efectividad = 2.0;
        if (pokemon.getTipo() == Tipo.PSIQUICO) efectividad = 2.0;
        
        return efectividad;   
    }   
}
