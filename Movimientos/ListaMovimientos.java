package pokemon.pokemon;
import java.util.ArrayList;

public class ListaMovimientos {
private ArrayList<Movimiento> movimientos = new ArrayList<>();
    public ListaMovimientos(){
        movimientos.add(new Movimiento("Ciclon", 40, Tipo.DRAGON, 20, TipoAtaque.ESPECIAL));
        movimientos.add(new Movimiento("Tajo aereo", 75, Tipo.VOLADOR, 15, TipoAtaque.ESPECIAL ));
        movimientos.add(new Movimiento("Asenco Draco", 120, Tipo.VOLADOR, 5, TipoAtaque.FISICO ));
        movimientos.add(new Movimiento("Triturar", 80, Tipo.SINIESTRO, 15, TipoAtaque.FISICO ));

        movimientos.add(new Movimiento("Confusion",50, Tipo.PSIQUICO, 35,TipoAtaque.ESPECIAL));
        movimientos.add(new Movimiento("Meteoro",40, Tipo.NORMAL, 20,TipoAtaque.ESPECIAL));
        movimientos.add(new Movimiento("Poder Pesado",60, Tipo.ROCA, 5,TipoAtaque.ESPECIAL));
        movimientos.add(new Movimiento("Psicocorte",70, Tipo.PSIQUICO, 20,TipoAtaque.FISICO));
        }
     public Movimiento buscarMovimientoPorNombre(String nombre){
        for (Movimiento movimiento : movimientos){
            if (movimiento.getNombre().equals(nombre)){
                return movimiento;
            }
        }
        return null;
    }
} 
