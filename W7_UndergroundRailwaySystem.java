import java.util.*;

class UndergroundSystem {

    Map<Integer, String> station = new HashMap<>();
    Map<Integer, Integer> time = new HashMap<>();

    Map<String, double[]> trips = new HashMap<>();

    public UndergroundSystem() {
    }

    public void checkIn(int id, String stationName, int t) {
        station.put(id, stationName);
        time.put(id, t);
    }

    public void checkOut(int id, String stationName, int t) {
        String start = station.get(id);
        int startTime = time.get(id);

        String route = start + "->" + stationName;
        int travelTime = t - startTime;

        if (!trips.containsKey(route)) {
            trips.put(route, new double[]{0, 0});
        }

        trips.get(route)[0] += travelTime;
        trips.get(route)[1]++;

        station.remove(id);
        time.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "->" + endStation;

        double[] data = trips.get(route);

        return data[0] / data[1];
    }
}