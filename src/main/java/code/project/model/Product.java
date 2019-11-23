package code.project.model;

public class Product {
    private int id;
    private String productName;
    private float price;
    private String describe;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Product() {
    }

    public Product(int id, String productName, float price, String describe, String image) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.describe = describe;
        this.image = image;
    }
}
