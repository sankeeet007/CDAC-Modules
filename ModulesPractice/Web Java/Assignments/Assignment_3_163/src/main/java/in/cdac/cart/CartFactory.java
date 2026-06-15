package in.cdac.cart;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import in.cdac.entity.Cart;

public class CartFactory {
    public static Cart getInstance(String cartClass) {
        try {
            Class refCart = Class.forName(cartClass);
            Constructor ctor = refCart.getConstructor(null);
            return (Cart) ctor.newInstance(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
