package academy.devdojo.maratonajava.javacore.Kenums.domain;

public enum CostumerType {
    COSTUMER(1, "Costumer"),
    COMPANY(2, "Company");

    private final int value;
    private final String nameReport;

    CostumerType(int value, String nameReport) {
        this.value = value;
        this.nameReport = nameReport;
    }

    public static CostumerType costumerTypeForReportName(String nameReport) {
        for (CostumerType costumerType : CostumerType.values()) {
            if (costumerType.getNameReport().equals(nameReport)){
                return costumerType;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getNameReport() {
        return nameReport;
    }
}

