public class Snuck extends Product{
    private String taste;
    public Snuck(String name, Double cost, String taste){
        super(name, cost);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
