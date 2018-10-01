package ar.edu.frc.dao;

import ar.edu.frc.conexion.Conexion;
import ar.edu.frc.milexamen6.Computadora;
import ar.edu.frc.milexamen6.ItemStock;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class ItemStockDao {

    Conexion con = Conexion.getInstance();

    public ItemStockDao() {
    }

    public List<ItemStock> listarItems() {
        List<ItemStock> listado = new ArrayList<>();
        ResultSet resultados = con.consultarSQL("SELECT * from ItemStock");
        try {
            while (resultados.next()) {
                ItemStock item = new ItemStock();
                item.setCantidad(resultados.getInt("Cantidad"));

                int idComputadora = resultados.getInt("Id_computadora");
                Computadora computadora = ComputadoraDao.getInstance().buscar(idComputadora);
                item.setComputadora(computadora);

                listado.add(item);
            }

        } catch (Exception ex) {
        }
        return listado;
    }

    public List<ItemStock> listarItemsConComputadora() {
        List<ItemStock> listado = new ArrayList<>();
        ResultSet rs = con.consultarSQL(
                "           SELECT * "
                + " from ItemStock as item "
                + " inner join Computadora as c "
                + " on item.Id_computadora = c.id_computadora ");
        try {
            while (rs.next()) {
                ItemStock item = new ItemStock();
                item.setCantidad(rs.getInt("Cantidad"));

                int idComputadora = rs.getInt("Id_computadora");

                Computadora comp = new Computadora(rs.getInt("id_computadora"), rs.getString("nombre"), rs.getString("modelo"), rs.getInt("precio"));

                item.setComputadora(comp);

                listado.add(item);
            }

        } catch (Exception ex) {
        }
        return listado;
    }

}
