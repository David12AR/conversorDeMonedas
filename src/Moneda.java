public record Moneda(String base_code,
                     String result,
                     String target_code,
                     double conversion_rate,
                     double conversion_result {
    @Override
    public String toString() {
        return "El valor " + amount + " [" + base_code + "] corresponde al valor final de =>>> " +
                conversion_result + " [" + target_code + "]";

    }
}
