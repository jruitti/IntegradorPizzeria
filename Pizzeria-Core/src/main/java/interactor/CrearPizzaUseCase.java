package interactor;

import excepciones.PizzaExisteException;
import modelo.Pizza;
import repositorio.IRepositorioCrearPizza;

public class CrearPizzaUseCase {

    private IRepositorioCrearPizza crearPizzaGateWay;

    public CrearPizzaUseCase(IRepositorioCrearPizza crearPizzaGateWay) {
        this.crearPizzaGateWay = crearPizzaGateWay;
    }

    public boolean existePizza(Pizza laPizza){
        return crearPizzaGateWay.buscarPizzaPorNombre(laPizza.getNombre()) != null;
    }

    public boolean crearPizza(Pizza laPizza) throws PizzaExisteException {
        if(!existePizza(laPizza)){
            return this.crearPizzaGateWay.guardar(laPizza);
        }
        throw new PizzaExisteException();
    }
}