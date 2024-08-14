package org.example.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class KendiHesabimInvocationHandler implements InvocationHandler {

    private BankaHesabi bankaHesabi;

    public KendiHesabimInvocationHandler(final BankaHesabi bankaHesabi) {
        setBankaHesabi(bankaHesabi);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("paraYatir")) {
                return method.invoke(getBankaHesabi(), args);
            } else if (method.getName().startsWith("paraCek")) {
                return method.invoke(getBankaHesabi(), args);
            } else if (method.getName().startsWith("get")) {
                return method.invoke(getBankaHesabi(), args);
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public BankaHesabi getBankaHesabi() {
        return bankaHesabi;
    }

    public void setBankaHesabi(BankaHesabi bankaHesabi) {
        this.bankaHesabi = bankaHesabi;
    }

    protected BankaHesabi getBaskaHesapProxy(final BankaHesabi bankaHesabi) {
        return (BankaHesabi) Proxy.newProxyInstance(bankaHesabi.getClass().getClassLoader(), bankaHesabi.getClass().getInterfaces(), new BaskaBirHesapInvocationHandler(bankaHesabi));
    }
}
