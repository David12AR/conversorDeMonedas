public class Moneda {
    private String base_code;
    private String target_code;
    private double conversion_result;
    private double monto;


    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public Moneda(String base_code, String target_code, double conversion_result, double monto) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_result = conversion_result;
        this.monto = monto;
    }
    @Override
    public String toString() {
        return "El valor " + monto + " [" + base_code + "] corresponde al valor final de =>>> " +
                conversion_result + " [" + target_code + "]";
    }
}

