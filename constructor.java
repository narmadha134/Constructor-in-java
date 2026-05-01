 class cons {
    public static void main(String[] args) {
        constructors o = new constructors("Narmadha");
        constructors o2 = new constructors(o);
        constructors o3 = new constructors();

        System.out.println(o.name);
        System.out.println(o2.name2);
    }
}

class constructors {
    String name;
    String name2;

    constructors() {
        System.out.println("Hi");
    }

    constructors(String mn) {
        name = mn;
    }

    constructors(constructors j) {
        name2 = j.name;
    }
}
