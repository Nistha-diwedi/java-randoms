class invoice{
    String number;
    String description;
    int qty;
    double price;
    invoice(String number, String description, int qty, double price){
        this.number = number;
        this.description = description;
        this.qty = qty;
        this.price = price;
    }
    public String getnumber(){
        return number;
    }
    public void setnumber(String number){
        this.number = number;
    }
    public String getdescription() {
        return description;
    }
    public void setPdescription(String description) {
        this.description = description;
    }
    public int getqty() {
        return qty;
    }
    public void setqty(int qty){
        if(qty > 0)
            this.qty = qty;
        else
            this.qty = 0;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0.0)
            this.price = price;
        else
            this.price= 0.0;
    }
    public double getinvoiceamount(){
        return qty * price;
    }
}
public class InvoiceTest {
    public static void main(String[] args) {
        invoice invoice1 = new invoice("001", "smartphone", 2, 30000);

        System.out.println("Number: " + invoice1.getnumber());
        System.out.println("Description: " + invoice1.getdescription());
        System.out.println("Quantity: " + invoice1.getqty());
        System.out.println("Price Per Item: Rs. " + invoice1.getPrice());
        System.out.println("Invoice Amount: Rs. " + invoice1.getinvoiceamount());
       }
}
