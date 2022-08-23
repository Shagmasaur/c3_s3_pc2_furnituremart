public class FurnitureImpl
{
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();
        furnitureItem.setCode("101");
        furnitureItem.setColor("green");
        furnitureItem.setGrade("grade1");
        furnitureItem.setType("table");
        furnitureItem.setPrice(500);
        furnitureItem.setUsage("outdoor");
        System.out.println(furnitureItem.getCode());
        System.out.println(furnitureItem.getColor());
        System.out.println(furnitureItem.getGrade());
        System.out.println(furnitureItem.getType());
        System.out.println(furnitureItem.getPrice());
        System.out.println(furnitureItem.getUsage());
        System.out.println(furnitureItem.calculateDiscount());

    }

}
