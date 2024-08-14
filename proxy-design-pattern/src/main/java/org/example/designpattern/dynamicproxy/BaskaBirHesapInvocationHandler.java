package org.example.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class BaskaBirHesapInvocationHandler implements InvocationHandler {

    private BankaHesabi bankaHesabi;

    public BaskaBirHesapInvocationHandler(BankaHesabi bankaHesabi) {
        setBankaHesabi(bankaHesabi);
    }

    public BankaHesabi getBankaHesabi() {
        return bankaHesabi;
    }

    public void setBankaHesabi(BankaHesabi bankaHesabi) {
        this.bankaHesabi = bankaHesabi;
    }

    @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("paraYatir")) {
                return method.invoke(getBankaHesabi(), args);
            } else if (method.getName().startsWith("paraCek")) {
                throw new Exception("Başka bir hesaptan "
                        + "para cekemezsiniz!");
            } else if (method.getName().startsWith("get")) {
                return method.invoke(getBankaHesabi(), args);
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
