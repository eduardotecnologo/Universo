package control;

import dao.GenreSeriesDao;
import interfaces.IController;
import model.GenreSeriesModel;

/**
 *
 * @author edudeveloper
 */
public class GenreSeriesController implements IController{
    GenreSeriesModel gsm = new GenreSeriesModel();
    GenreSeriesDao gsd = new GenreSeriesDao();

    @Override
    public void saveController(Object... value) {
      gsm.setId((int) value[0]);           // casting
      gsm.setDescricao((String) value[1]); // casting
      
      // Enviando as informações para o Banco
      gsd.saveDao(gsm);
    }

    @Override
    public void deleteController(int id) {

    }

    @Override
    public void chargeComboBox() {

    }
}
