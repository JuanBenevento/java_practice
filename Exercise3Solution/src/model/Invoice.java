package model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Invoice {
    private String invoiceId;
    private Client client;
    private LocalDateTime creationDate;
    private double totalAmount;

    // Constructor que asigna la fecha y hora actuales al crear una factura
    public Invoice(Client client, double totalAmount) {
        this.invoiceId = generateInvoiceId();
        this.client = client;
        this.creationDate = LocalDateTime.now();
        this.totalAmount = totalAmount;
    }

    // Método para generar un ID único para la factura
    private String generateInvoiceId() {
        return UUID.randomUUID().toString();
    }

    // Getters y Setters
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Método para calcular el monto final después de aplicar el descuento
    public double calculateFinalAmount() {
        double discount = client.getDiscount(); // Asumiendo que el cliente tiene un método getDiscount()
        return totalAmount - (totalAmount * discount / 100);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId='" + invoiceId + '\'' +
                ", creationDate=" + creationDate +
                ", totalAmount=" + totalAmount +
                ", finalAmount=" + calculateFinalAmount() +
                ", client=" + client +
                '}';
    }
}


/*
Por otro lado vamos a tener el objeto Factura que representa una venta
del local, cada Factura posee un identificador de las mismas
características usadas en Cliente. A su vez cada factura posee un monto
total, una fecha y el Cliente que generó la compra. Para la fecha de la
venta se le va a asignar la fecha y hora al momento de creación del objeto
Factura. El tipo Factura debe contar con un método que calcule el monto
final luego de aplicarle el descuento que posee el cliente.
 */
