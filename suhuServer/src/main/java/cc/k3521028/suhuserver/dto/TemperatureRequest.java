package cc.k3521028.suhuserver.dto;

public class TemperatureRequest {
    private double value;
    private String from;
    private String to;

    public TemperatureRequest() {}

    public TemperatureRequest(double value, String from, String to) {
        this.value = value;
        this.from = from;
        this.to = to;
    }

    // Getter dan Setter
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
