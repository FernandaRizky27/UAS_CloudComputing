package cc.k3521028.suhuserver.dto;

public class TemperatureResponse {
    private double convertedValue;

    public TemperatureResponse(double convertedValue) {
        this.convertedValue = convertedValue;
    }

    public double getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(double convertedValue) {
        this.convertedValue = convertedValue;
    }
}

