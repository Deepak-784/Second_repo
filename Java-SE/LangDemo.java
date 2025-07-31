class MyObject {
    public String toString() {
        return "My Object";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    // Renamed to avoid conflict with Object.notify()
    public void myNotify() {
        // Custom method logic if needed
    }
}

public class LangDemo {
    public static void main(String[] args) {
        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();

        System.out.println(o1.equals(o2));
    }
}
