public class PropertyProject {

    public static void main(String[] args) {
        Property p1 = new Property("Erzbergerstraße 1", 10, 20.57);
        System.out.println(p1.getAddress() + " - " + p1.getSize() + "m²" );

        Property p2 = new Property("Erzbergerstraße 2", 15, 22.212);
        System.out.println(p2.getAddress() + " - " + p2.getSize() + "m²" );

        Property p3= new Property("Erzbergerstraße 3",17, 24.444);
        System.out.println(p3.getAddress() + " - " + p3.getSize() + "m²");

        Property p4= new Property("Erzbergerstraße 4",17, 24.444);
        System.out.println(p4.getAddress() + " - " + p4.getSize() + "m²");

        Property p5= new Property("Erzbergerstraße 5",17, 24.444);
        System.out.println(p5.getAddress() + " - " + p5.getSize() + "m²");

    }

}
