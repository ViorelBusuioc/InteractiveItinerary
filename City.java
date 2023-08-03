public class City {

    private String name;
    private int distance;

    public City(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return String.format("{%s-> %skm}",name,distance);
    }

    public int getDistance() {
        return distance;
    }
}
