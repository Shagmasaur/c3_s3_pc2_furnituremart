public class FurnitureItem
{
    private static final float DISCOUNT = 5;
    private String code;
    private String type;
    private String grade;
    private String color;
    private String usage;
    private int price;

    public FurnitureItem() {
        code = "";
        type = "";
        grade = "";
        color = "";
        usage = "";
        price = 0;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double calculateDiscount() {
        double discountPrice = 0;
        if (getGrade().equals("grade1") || getUsage().equals("outdoor")) {
            discountPrice = (price * DISCOUNT) / 100;
            return price - discountPrice;


        }
        return discountPrice;

    }
}
