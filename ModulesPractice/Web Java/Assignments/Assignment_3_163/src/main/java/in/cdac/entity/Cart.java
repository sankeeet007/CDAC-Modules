package in.cdac.entity;

public class Cart {

    private int cartId;
    private String username;
    private int productId;

    public Cart() {}

    public Cart(String username, int productId) {
        this.username = username;
        this.productId = productId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}