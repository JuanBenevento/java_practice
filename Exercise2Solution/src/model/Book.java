package model;

public class Book {
    private String title;
    private double price;
    private int stock;
    private Author author;

    public Book(String title, double price, int stock, Author author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public String modifyPrice(double newPrice) {
        String message;

        if (newPrice != 0){
            this.price = newPrice;
            message = "Successful modification.";
        } else {
            message = "The entered value is not valid.";
        }

        return message;
    }

    public String modifyStock(int newStock) {
        String message;
        this.stock = stock + newStock;
        message = "Successful modification.";
        return message;
    }

    public String showMessaje (){
        return " "+ author.getName() +"'s book '"+ title +"' is sold for "+ price +" pesos.";
    }

    @Override
    public String toString() {
        return "Book { " +
                "title = " + title +
                ", price = " + price +
                ", stock = " + stock +
                ", author = " + author.getName() +
                '}';
    }
}
