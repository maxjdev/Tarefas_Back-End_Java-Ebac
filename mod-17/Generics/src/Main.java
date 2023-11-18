import carro.Carro;
import carro.Toyota;
import carro.Volkswagen;
import dao.CarroListDAO;
import dao.IGenericDAO;
public class Main {
    public static void main(String[] args) {
        IGenericDAO<Carro> carroDAO = new CarroListDAO<>();

        Carro volkswagenCar = new Volkswagen("Golf");
        Carro toyotaCar = new Toyota("Camry");

        carroDAO.cadastrar(volkswagenCar);
        carroDAO.cadastrar(toyotaCar);

        Carro carroConsultado = carroDAO.consultar("Golf");
        System.out.println("Consultado: " + carroConsultado);

        volkswagenCar.setModelo("Jetta");
        carroDAO.atualizar(volkswagenCar);

        Carro carroAtualizado = carroDAO.consultar("Jetta");
        System.out.println("Atualizado: " + carroAtualizado);

        carroDAO.deletar("Camry");

        System.out.println("Lista de Carros: " + carroDAO.listar());
    }
}
