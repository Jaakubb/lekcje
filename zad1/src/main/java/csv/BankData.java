package csv;

public class BankData {
    private String bankName;
    private String city;
    private String state;
    private String cert;
    private String acquiringInstitution;
    private String closingDate;
    private String fund;

    public BankData(String bankName, String city, String state, String cert, String acquiringInstitution, String closingDate, String fund) {
        this.bankName = bankName;
        this.city = city;
        this.state = state;
        this.cert = cert;
        this.acquiringInstitution = acquiringInstitution;
        this.closingDate = closingDate;
        this.fund = fund;
    }

    @Override
    public String toString() {
        return "BankData{" +
                "bankName='" + bankName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", cert='" + cert + '\'' +
                ", acquiringInstitution='" + acquiringInstitution + '\'' +
                ", closingDate='" + closingDate + '\'' +
                ", fund='" + fund + '\'' +
                '}';
    }

    public String getBankName() {
        return bankName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCert() {
        return cert;
    }

    public String getAcquiringInstitution() {
        return acquiringInstitution;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public String getFund() {
        return fund;
    }
}
