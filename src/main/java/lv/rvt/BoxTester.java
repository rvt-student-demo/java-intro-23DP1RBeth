package lv.rvt;

class BoxTester {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);
        System.out.println("Area: " + box.area() + " Volume: " + box.volume());

        System.out.println("Width: " + box.width());
        System.out.println("Height: " + box.height());
        System.out.println("Length: " + box.length());

        Box biggerBox = box.biggerBox(box);
        System.out.println("Bigger Box - Width: " + biggerBox.width() + ", Height: " + biggerBox.height() + ", Length: " + biggerBox.length());

        Box smallerBox = box.smallerBox(box);
        System.out.println("Smaller Box - Width: " + smallerBox.width() + ", Height: " + smallerBox.height() + ", Length: " + smallerBox.length());

        System.out.println("Does the smaller box nest inside the original box? " + smallerBox.nests(box));
        System.out.println("Does the original box nest inside the bigger box? " + box.nests(biggerBox));
    }
}
