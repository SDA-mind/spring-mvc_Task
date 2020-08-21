package web.model;

public class Car {
    private String name;
    private Integer series;
    private String engine;

    public Car() {
    }

    public Car(String name, Integer series, String engine) {
        this.name = name;
        this.series = series;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
