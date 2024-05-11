package Structural.proxy;

public class LaptopDaoProxy implements LaptopDao {

    LaptopDao laptopDao;

    public LaptopDaoProxy(LaptopDao laptopDao) {
        this.laptopDao = laptopDao;
    }

    @Override
    public void create() {
//        if (ADMIN) {
//            laptopDao.create();
//        } else {
//            throw new RuntimeException();
//        }
    }
}
