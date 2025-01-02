package cc.k3521028.panjangserver.dto;

public class LengthRequest {
    private double value; // Nilai panjang
    private String from; // Satuan awal (contoh: Meter)
    private String to;   // Satuan tujuan (contoh: Kilometer)

    // Constructor tanpa parameter
    public LengthRequest() {}

    // Constructor dengan parameter
    public LengthRequest(double value, String from, String to) {
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
