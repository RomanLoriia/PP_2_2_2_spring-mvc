package web.model;

public class Car {
    private String company;
    private int model;
    private int cost;

    public Car(String company, int model, int cost) {
        this.company = company;
        this.model = model;
        this.cost = cost;
    }

    public Car() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
