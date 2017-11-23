package jc.com.duandianxuchuan;

import android.app.Application;

import jc.com.duandianxuchuan.gen.DaoMaster;
import jc.com.duandianxuchuan.gen.DaoSession;
import jc.com.duandianxuchuan.gen.UserDao;

/**
 * Created by 56553 on 2017/11/22.
 */

public class App extends Application {
    public static UserDao userDao;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "lenvess.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        userDao = daoSession.getUserDao();
    }
}
