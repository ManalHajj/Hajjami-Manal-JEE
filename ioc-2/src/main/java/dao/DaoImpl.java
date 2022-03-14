package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {


    @Override
    public double getData() {
        /* récupération de la tempéature à partir de la base */
        System.out.println("Version BDD");
        double temp=Math.random()*40;
        return temp;
    }
}
