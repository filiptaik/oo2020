

class Container<T>{
    T value;

    public void showClass(){
        System.out.println(value.getClass().getName());
    }
}

public class Example {
    public static void main(String[] args) {
        Container<Integer> intObj = new Container<>();
        intObj.value = 1;
        intObj.showClass();
    }
}