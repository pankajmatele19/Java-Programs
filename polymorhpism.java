 class polymorhpism {
    public void animalsound() {
        System.out.println("The animal makes sound");
    }
}
class Dog extends polymorhpism {
    public void animalsound() {
        System.out.println("Dog Says : bow bow");
    }
}
class lion extends polymorhpism {
    public void animalsound() {
        System.out.println("Lion Says : Roars");
    }
}
class Main {
    public static void main(String[] args) {
        polymorhpism myobj=new polymorhpism();
        Dog mydog=new Dog();
        lion mylion=new lion();
        myobj.animalsound();
        mydog.animalsound();
        mylion.animalsound();
    }
}
