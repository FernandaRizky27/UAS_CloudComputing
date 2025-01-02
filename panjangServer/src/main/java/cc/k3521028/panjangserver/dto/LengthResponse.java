package cc.k3521028.panjangserver.dto;

public class LengthResponse {
    private double convertedValue; // Nilai panjang hasil konversi

    // Constructor dengan parameter
    public LengthResponse(double convertedValue) {
        this.convertedValue = convertedValue;
    }

    // Getter dan Setter
    public double getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(double convertedValue) {
        this.convertedValue = convertedValue;
    }
}

