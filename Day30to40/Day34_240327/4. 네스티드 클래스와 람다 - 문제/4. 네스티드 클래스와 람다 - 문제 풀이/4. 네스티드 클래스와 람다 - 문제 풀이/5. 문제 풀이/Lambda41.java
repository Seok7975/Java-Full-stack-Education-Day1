interface Printable {
    void print(String s);
}

class Lambda41 {
    public static void ShowString(Printable p, String s) {
        p.print(s);
    }

    public static void main(String[] args) {
        ShowString((s) -> System.out.println(s), "What is Lambda?");
    }
}

/*
What is Lambda?
*/